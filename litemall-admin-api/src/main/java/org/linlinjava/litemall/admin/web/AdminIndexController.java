package org.linlinjava.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.linlinjava.litemall.core.util.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/index")
public class AdminIndexController {
    private final Log logger = LogFactory.getLog(AdminIndexController.class);

    @RequestMapping("/index")
    public Object index() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @RequestMapping("/guest")
    public Object guest() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @RequestMapping("/authn")
    public Object authn() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @RequestMapping("/user")
    public Object user() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @RequestMapping("/admin")
    public Object admin() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @RequestMapping("/admin2")
    public Object admin2() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @GetMapping("/read")
    public Object read() {
        return ResponseUtil.ok("hello world, this is admin service");
    }


    @PostMapping("/write")
    public Object write() {
        return ResponseUtil.ok("hello world, this is admin service");
    }

}
