package fplhn.ptpm.sd18203.controllers;

import fplhn.ptpm.sd18203.dto.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PostMapping("login")
    public String login(
//        @RequestParam("email") Optional<String> username,
//        @RequestParam("password") String pwd,
        LoginRequest req,
        Model model
    ) {
        System.out.println("LoginController@login");
        System.out.println(req.getEmail());
        System.out.println(req.getPassword());
        model.addAttribute("name", req.getEmail());
        return "login";
    }
}
