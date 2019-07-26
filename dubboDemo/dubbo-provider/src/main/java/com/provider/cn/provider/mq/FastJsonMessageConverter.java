
package com.lcb.soa.common.mq;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.support.converter.AbstractMessageConverter;
import org.springframework.amqp.support.converter.MessageConversionException;

import com.alibaba.fastjson.JSON;

/** JSON 消息转换器 */
public class FastJsonMessageConverter extends AbstractMessageConverter
{
	public static final String DEFAULT_CHARSET = "UTF-8";
	private String defaultCharset = DEFAULT_CHARSET;

	@Override
	protected Message createMessage(Object obj, MessageProperties props)
	{
		try
		{
			String json = JSON.toJSONString(obj);
			byte[] body = json.getBytes(defaultCharset);

			props.setContentType(MessageProperties.CONTENT_TYPE_JSON);
			props.setContentEncoding(defaultCharset);

			if(body != null)
				props.setContentLength(body.length);

			return new Message(body, props);
		}
		catch(UnsupportedEncodingException e)
		{
			throw new MessageConversionException("invalid charset " + defaultCharset, e);
		}
	}

	@Override
	public Object fromMessage(Message message)
	{
		String charset = message.getMessageProperties().getContentEncoding();
		
		if(charset == null)
			charset = defaultCharset;

		try
		{
			return new String(message.getBody(), charset);
		}
		catch(UnsupportedEncodingException e)
		{
			throw new MessageConversionException("invalid charset " + charset, e);
		}
	}

	public void setDefaultCharset(String defaultCharset)
	{
		this.defaultCharset = (defaultCharset != null ? defaultCharset : "UTF-8");
	}

	public String getDefaultCharset()
	{
		return this.defaultCharset;
	}

}
