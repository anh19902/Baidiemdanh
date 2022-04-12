package main;

import shapes.HinhChuNhat;
import shapes.Hinhtron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class App54 {
    
    public static void main(String[] args) {
        //Thử nghiệm với lớp Hình Tròn
        Hinhtron Hinhtron = new Hinhtron();
        Hinhtron.xuatTen();
        Hinhtron.nhapBanKinh();
        Hinhtron.tinhChuVi();
        Hinhtron.tinhDienTich();
        Hinhtron.inChuVi();
        Hinhtron.inDienTich();

        //Thử nghiệm với lớp Hình Trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        //Thử nghiệm với lớp Hình Chữ Nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        //Thử nghiệm với lớp Hình Vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.NhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}