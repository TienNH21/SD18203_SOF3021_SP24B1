package fplhn.ptpm.sd18203.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name="MauSac")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MauSac {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="Ma")
    private String ma;
    @Column(name="Ten")
    private String ten;
    @Column(name="TrangThai")
    private Integer trangThai;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Ma", nullable = false, length = 255)
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "Ten", nullable = false, length = 255)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "TrangThai", nullable = false)
    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MauSac mauSac = (MauSac) o;
        return Objects.equals(id, mauSac.id) && Objects.equals(ma, mauSac.ma) && Objects.equals(ten, mauSac.ten) && Objects.equals(trangThai, mauSac.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ma, ten, trangThai);
    }
}
