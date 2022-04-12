package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = " Hinh Vuong ";
    }

    public void NhapCanh() {
        System.out.println("Canh  = ");
        Scanner Scanner= new Scanner(System.in);
        dai = rong = Scanner.nextFloat();
    }
}
