package fplhn.ptpm.sd18203.controllers;

import fplhn.ptpm.sd18203.dto.mau_sac.StoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    @Qualifier("red")
    private StoreRequest req;

    @RequestMapping("hello")
    public String hello()
    {
        System.out.println(req.getId());
        System.out.println(req.getMa());
        System.out.println(req.getTen());
        return "hello";
    }
}
