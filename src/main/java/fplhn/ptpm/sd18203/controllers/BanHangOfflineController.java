package fplhn.ptpm.sd18203.controllers;

import fplhn.ptpm.sd18203.entities.HoaDon;
import fplhn.ptpm.sd18203.entities.SanPhamChiTiet;
import fplhn.ptpm.sd18203.repositories.HoaDonRepository;
import fplhn.ptpm.sd18203.repositories.SanPhamCTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BanHangOfflineController {
    @Autowired
    private HoaDonRepository hdRepo;

    @Autowired
    private SanPhamCTRepository spctRepo;

    @GetMapping("/admin/ban-hang-tai-quay")
    public String getUI(Model model)
    {
        return "admin/ban_hang";
    }

    @GetMapping("ban-hang/get-list-hd-cho")
    @ResponseBody
    public ResponseEntity<ArrayList<HoaDon>> getListHDCho()
    {
        ArrayList<HoaDon> dshd = this.hdRepo.findByTrangThai(HoaDonRepository.CHO_THANH_TOAN);
        return ResponseEntity.ok(dshd);
    }

    @GetMapping("ban-hang/get-list-spct")
    public ResponseEntity<Page<SanPhamChiTiet>> getListSPCT(
        @RequestParam("page") Optional<Integer> pageParam
    ) {
        Pageable pageable = PageRequest.of(pageParam.orElse(1), 5);
        Page<SanPhamChiTiet> dsSpct = this.spctRepo.findByTrangThai(SanPhamCTRepository.ACTIVE, pageable);
        return ResponseEntity.ok(dsSpct);
    }
}
