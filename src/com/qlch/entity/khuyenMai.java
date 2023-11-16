/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlch.entity;

import java.util.Date;

/**
 *
 * @author Leonovo
 */
public class khuyenMai {
    private int maKhuyenMai;
    private String tenKhuyenMai;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private float giamTheoPhanTram;
    private float giamTheoGia;
    private String ghiChu;

    public khuyenMai() {
    }

    public khuyenMai(int maKhuyenMai, String tenKhuyenMai, Date ngayBatDau, Date ngayKetThuc, float giamTheoPhanTram, float giamTheoGia, String ghiChu) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giamTheoPhanTram = giamTheoPhanTram;
        this.giamTheoGia = giamTheoGia;
        this.ghiChu = ghiChu;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public float getGiamTheoPhanTram() {
        return giamTheoPhanTram;
    }

    public void setGiamTheoPhanTram(float giamTheoPhanTram) {
        this.giamTheoPhanTram = giamTheoPhanTram;
    }

    public float getGiamTheoGia() {
        return giamTheoGia;
    }

    public void setGiamTheoGia(float giamTheoGia) {
        this.giamTheoGia = giamTheoGia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
