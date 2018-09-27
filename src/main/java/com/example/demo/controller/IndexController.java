package com.example.demo.controller;

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
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "index方法", notes="服务默认首页")
    @RequestMapping(value="",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) throws Exception {
        mv.addObject("record", "this is swagger index page");
        mv.setViewName("index");
        return mv;
    }

}
