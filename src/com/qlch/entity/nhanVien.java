/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlch.entity;

/**
 *
 * @author Leonovo
 */
public class nhanVien {
    private String maNhanVien;
    private String matKhau;
    private String hoVaTen;
    private String email;
    private String soDienThoai;
    private boolean chucVu;

    public nhanVien() {
    }

    public nhanVien(String maNhanVien, String matKhau, String hoVaTen, String email, String soDienThoai, boolean chucVu) {
        this.maNhanVien = maNhanVien;
        this.matKhau = matKhau;
        this.hoVaTen = hoVaTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.chucVu = chucVu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }
    
}
