/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlch.entity;

/**
 *
 * @author Leonovo
 */
public class thuongHieu {
    private String maThuongHieu;
    private String tenThuongHieu;
    private String maNhanVien;

    public thuongHieu() {
    }

    public thuongHieu(String maThuongHieu, String tenThuongHieu, String maNhanVien) {
        this.maThuongHieu = maThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
        this.maNhanVien = maNhanVien;
    }

    public String getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(String maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    
}
