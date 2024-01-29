package fplhn.ptpm.sd18203.repositories;

import fplhn.ptpm.sd18203.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}
