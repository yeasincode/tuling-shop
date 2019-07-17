package com.provider.cn.provider.web;

import com.provider.cn.provider.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser/{id}",method= RequestMethod.POST)
    @ApiOperation(value = "用id查询user",notes = "用户查询")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @RequestMapping(value = "update/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "用id更新user",notes = "用户更新")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    public String updateUser(@PathVariable int id){
        return "hello world!";
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "用id删除user",notes = "用户删除")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    public String deleteUser(@PathVariable int id){
        return "delete world!";
    }

}
