package fplhn.ptpm.sd18203.repositories;

import fplhn.ptpm.sd18203.entities.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
    public static final int CHO_THANH_TOAN = 0;
    public static final int DA_THANH_TOAN = 1;
    public ArrayList<HoaDon> findByTrangThai(int trangThai);
}
