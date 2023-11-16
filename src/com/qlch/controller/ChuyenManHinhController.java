/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlch.controller;

import com.qlch.bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.qlch.ui.BaoHanhJPanel;
import com.qlch.ui.HoaDonJPanel;
import com.qlch.ui.KhachHangJPanel;
import com.qlch.ui.KhoJPanel;
import com.qlch.ui.KhuyenMaiJPanel;
import com.qlch.ui.NhanVienJPanel;
import com.qlch.ui.SanPhamJPanel;
import com.qlch.ui.ThongKeJPanel;

/**
 *
 * @author Leonovo
 */
public class ChuyenManHinhController {

    private JPanel root;
    private String kindSelected = "";
    List<DanhMucBean> listDanhMuc = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;

    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChinh";
        jpnItem.setBackground(new Color(40, 201, 209));
        jlbItem.setBackground(new Color(40, 201, 209));
        JPanel node = new NhanVienJPanel();
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
        for (DanhMucBean item : listDanhMuc) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "SanPham":
                    node = new SanPhamJPanel();
                    break;
                case "Kho":
                    node = new KhoJPanel();
                    break;
                case "KhuyenMai":
                    node = new KhuyenMaiJPanel();
                    break;
                case "KhachHang":
                    node = new KhachHangJPanel();
                    break;
                case "HoaDon":
                    node = new HoaDonJPanel();
                    break;
                case "BaoHanh":
                    node = new BaoHanhJPanel();
                    break;
                case "ThongKe":
                    node = new ThongKeJPanel();
                    break;

                // more
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(40, 201, 209));
            jlbItem.setBackground(new Color(40, 201, 209));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(40, 201, 209));
            jlbItem.setBackground(new Color(40, 201, 209));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(0,102,255));
                jlbItem.setBackground(new Color(0,102,255));
            }
        }

    }

    private void setChangeBackground(String kind) {
        for (DanhMucBean item : listDanhMuc) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(40, 201, 209));
                item.getJlb().setBackground(new Color(40, 201, 209));
            } else {
                item.getJpn().setBackground(new Color(0,102,255));
                item.getJlb().setBackground(new Color(0,102,255));
            }
        }
    }
}
