package com.chime.shadow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 统一使用
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/gesila")
    public String gesila() {
        return "gesila";
    }

    @RequestMapping("/bingxie")
    public String bingxie() {
        return "bingxie";
    }

    @RequestMapping("/kkf")
    public String kkf() {
        return "kkf";
    }
}
