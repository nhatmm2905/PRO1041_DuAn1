/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlch.entity;

/**
 *
 * @author Leonovo
 */
public class khachHang {
    private String maKhachHang;
    private String hoVaTen;
    private boolean gioiTinh;
    private String email;
    private String diaChi;

    public khachHang() {
    }

    public khachHang(String maKhachHang, String hoVaTen, boolean gioiTinh, String email, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
