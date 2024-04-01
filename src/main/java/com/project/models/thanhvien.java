package com.project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "thanhvien")
@Getter
@Setter
public class thanhvien {
    @Id
    @Column(name = "MaTV")
    private BigInteger maTV;

    @Column(name = "HoTen")
    private String hoTen;

    @Column(name = "Khoa")
    private String khoa;

    @Column(name = "Nganh")
    private String nganh;

    @Column(name = "SDT")
    private String sdt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "thanhvien")
    private List<thongtinsd> thongtinsd;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "thanhvien")
    private List<xuly> xuly;

    public thanhvien() {
    }

    public thanhvien(BigInteger maSV,String hoTen, String khoa, String nganh, String sdt) {
        this.maTV = maSV;
        this.hoTen = hoTen;
        this.khoa = khoa;
        this.nganh = nganh;
        this.sdt = sdt;
    }

    public BigInteger getMaTV() {
        return maTV;
    }

    public void setMaTV(BigInteger maTV) {
        this.maTV = maTV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public List<com.project.models.thongtinsd> getThongtinsd() {
        return thongtinsd;
    }

    public void setThongtinsd(List<com.project.models.thongtinsd> thongtinsd) {
        this.thongtinsd = thongtinsd;
    }

    public List<com.project.models.xuly> getXuly() {
        return xuly;
    }

    public void setXuly(List<com.project.models.xuly> xuly) {
        this.xuly = xuly;
    }

    @Override
    public String toString() {
        return "thanhvien{" +
                "maTV=" + maTV +
                ", hoTen='" + hoTen + '\'' +
                ", khoa='" + khoa + '\'' +
                ", nganh='" + nganh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", thongtinsd=" + thongtinsd +
                ", xuly=" + xuly +
                '}';
    }
}