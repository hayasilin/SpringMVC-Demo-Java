package com.mkyong.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloUserController {
	
	@RequestMapping("userpage")
    public String hello(@RequestParam("user") String user, Model m) {
        m.addAttribute("user", user);
        return "userpage";
    }
}
