package fplhn.ptpm.sd18203.controllers;

import fplhn.ptpm.sd18203.dto.mau_sac.StoreRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {
    @GetMapping("create")
    public String create(Model model)
    {
        StoreRequest msReq = new StoreRequest(1, "PH21", "Đỏ");
        model.addAttribute("data", msReq);
        return "admin/mau_sac/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("data") StoreRequest req,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            System.out.println("Có lỗi");
        }
        System.out.println(req.getId());
        System.out.println(req.getMa());
        System.out.println(req.getTen());
        return "admin/mau_sac/create";
    }
}
