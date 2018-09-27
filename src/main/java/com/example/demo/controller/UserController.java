package com.example.demo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "user方法", notes="服务用户首页")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String"),
            @ApiImplicitParam(name = "name", value = "用户name", required = false, dataType = "String")})
    @RequestMapping(value="/user/findUserById",method = RequestMethod.GET)
    public ModelAndView user(String id,String name, ModelAndView mv) throws Exception {
        mv.addObject("record", "this is swagger user page");
        mv.setViewName("user");
        return mv;
    }

}
