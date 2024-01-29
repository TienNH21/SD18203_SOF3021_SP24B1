package fplhn.ptpm.sd18203.repositories;

import fplhn.ptpm.sd18203.entities.SanPhamChiTiet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SanPhamCTRepository
    extends JpaRepository<SanPhamChiTiet, Integer> {
    public static final int ACTIVE = 1;
    public static final int IN_ACTIVE = 0;

    public Page<SanPhamChiTiet> findByTrangThai(int trangThai, Pageable pageable);
}
