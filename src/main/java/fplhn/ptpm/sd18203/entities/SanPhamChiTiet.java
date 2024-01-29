package fplhn.ptpm.sd18203.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Objects;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPhamChiTiet {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="IdMauSac")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="IdKichThuoc")
    private KichThuoc kichThuoc;

    @ManyToOne
    @JoinColumn(name="IdSanPham")
    private SanPham sanPham;

    @Column(name = "MaSPCT", nullable = false, length = 255)
    private String maSpct;

    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;

    @Column(name = "DonGia", nullable = false, precision = 0)
    private Double donGia;

    @Column(name = "TrangThai", nullable = false)
    private Integer trangThai;

}
