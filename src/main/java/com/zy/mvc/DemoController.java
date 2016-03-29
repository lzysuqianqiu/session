package com.zy.mvc;

import com.zy.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/putCache")
    public String putCache() {
        demoService.put();
        return "ok";

    }


}
