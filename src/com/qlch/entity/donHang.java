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
public class donHang {
    private int maDonHang;
    private String maKhachHang;
    private String maNhanVien;
    private int maKhuyenMai;
    private Date ngayTao;

    public donHang() {
    }

    public donHang(int maDonHang, String maKhachHang, String maNhanVien, int maKhuyenMai, Date ngayTao) {
        this.maDonHang = maDonHang;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.maKhuyenMai = maKhuyenMai;
        this.ngayTao = ngayTao;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    
}
