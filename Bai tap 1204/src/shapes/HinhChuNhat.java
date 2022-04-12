package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat() {
        ten = "Hinh Chu Nhat ";
    }

    public void nhapChieuDai() {
        System.out.println("Chieu dai  = ");
        java.util.Scanner Scanner = new Scanner(System.in);
        dai = Scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Chieu rong  = ");
        java.util.Scanner Scanner = new Scanner(System.in);
        rong = Scanner.nextFloat();
    }

    public void tinhChuVi() {
        ChuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        DienTich = dai * rong;
    }
}

