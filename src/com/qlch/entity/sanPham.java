/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlch.entity;

/**
 *
 * @author Leonovo
 */
public class sanPham {
    private String maSanPham;
    private int maThuongHieu;
    private int maDanhMuc;
    private String tenSanPham;
    private float gia;
    private int soLuong;

    public sanPham() {
    }

    public sanPham(String maSanPham, int maThuongHieu, int maDanhMuc, String tenSanPham, float gia, int soLuong) {
        this.maSanPham = maSanPham;
        this.maThuongHieu = maThuongHieu;
        this.maDanhMuc = maDanhMuc;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(int maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
