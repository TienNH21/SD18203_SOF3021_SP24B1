package fplhn.ptpm.sd18203.repositories;

import fplhn.ptpm.sd18203.entities.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepository
    extends JpaRepository<MauSac, Integer> {
}
