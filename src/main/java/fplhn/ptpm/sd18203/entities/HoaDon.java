package fplhn.ptpm.sd18203.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDon implements Serializable {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;

    @Column(name = "IdNV", nullable = false)
    private Integer idNv;

    @Column(name = "NgayMuaHang", nullable = false)
    private Date ngayMuaHang;

    @Column(name = "TrangThai", nullable = false)
    private Integer trangThai;

}
