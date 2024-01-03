package fplhn.ptpm.sd18203.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
//    @RequestMapping(name="login", method = RequestMethod.POST)
    @GetMapping("login")
    public String getLoginForm(Model model)
    {
        String name = "SD18203";
        model.addAttribute("name", name);
        return "login";
    }
}
