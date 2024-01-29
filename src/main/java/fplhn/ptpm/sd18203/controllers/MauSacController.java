package fplhn.ptpm.sd18203.controllers;

import fplhn.ptpm.sd18203.dto.mau_sac.StoreRequest;
import fplhn.ptpm.sd18203.entities.MauSac;
import fplhn.ptpm.sd18203.repositories.MauSacRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public String index(
        Model model,
        @RequestParam("page") Optional<Integer> pageParam
    ) {
        int page = pageParam.orElse(0);
        Pageable p = PageRequest.of(page, 5);
        Page<MauSac> pageData = msRepo.findByTrangThai(MauSacRepository.ACTIVE, p);
        model.addAttribute("pageData", pageData);
        return "admin/mau_sac/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") MauSac ms, Model model)
    {
        model.addAttribute("data", ms);
        return "admin/mau_sac/edit";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int idCanXoa)
    {
        this.msRepo.deleteById(idCanXoa);
        return "redirect:/mau-sac/index";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") MauSac ms,
            @Valid @ModelAttribute("data") StoreRequest req,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            System.out.println("Có lỗi");
            // redirect form - báo lỗi
        }

        ms.setMa(req.getMa());
        ms.setTen(req.getTen());
        this.msRepo.save(ms);

        return "redirect:/mau-sac/index";
    }

    @GetMapping("create")
    public String create(Model model)
    {
        StoreRequest msReq = new StoreRequest();
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

        MauSac ms = new MauSac(null, req.getMa(), req.getTen(), 1);
        this.msRepo.save(ms);

        return "redirect:/mau-sac/index";
    }
}
