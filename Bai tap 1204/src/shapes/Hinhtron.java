package shapes;

import java.util.Scanner;

public class Hinhtron extends HinhHoc{

    public float banKinh;

    public Hinhtron() {
        ten = " HInh Tron ";
    }

    public void nhapBanKinh() {
        System.out.println("Ban kinh = ");
        java.util.Scanner Scanner = new Scanner(System.in);
        banKinh = Scanner.nextFloat();
    }
    public void tinhChuVi() {
        ChuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich() {
        DienTich = PI * banKinh * banKinh;
    }
}   
