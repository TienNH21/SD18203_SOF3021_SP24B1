package fplhn.ptpm.sd18203.controllers;

import fplhn.ptpm.sd18203.dto.mau_sac.StoreRequest;
import fplhn.ptpm.sd18203.repositories.MauSacRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {
    private List<StoreRequest> ds;

    @Autowired
    private MauSacRepository msRepo;

    public MauSacController()
    {
        this.ds = new ArrayList<>();
        this.ds.add(new StoreRequest(1, "#ff0000", "Red"));
        this.ds.add(new StoreRequest(2, "#ff0367", "Yellow"));
    }

    @GetMapping("index")
    public String index(Model model)
    {
        model.addAttribute("data", msRepo.findAll());
        return "admin/mau_sac/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") int id, Model model)
    {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId() == id) {
                model.addAttribute("data", ds.get(i));
            }
        }

        return "admin/mau_sac/edit";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") int id,
            @Valid @ModelAttribute("data") StoreRequest req,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            System.out.println("Có lỗi");
            // redirect form - báo lỗi
        }

        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getId() == id) {
                ds.set(i, req);
            }
        }

        return "redirect:/mau-sac/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int idCanXoa)
    {
        for (int i = 0; i < ds.size(); i++) {
            ds.remove(i);
        }

        return "redirect:/mau-sac/index";
    }

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
            // redirect form - báo lỗi
        }

        ds.add(req);

        return "redirect:/mau-sac/index";
    }
}
