package shapes;

import java.util.Scanner;

public class HinhTru extends Hinhtron {
    
    public float chieuCao ;

    public HinhTru(){
        ten = "Hinh tru ";
    }

    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("Chieu cao  = ");
        java.util.Scanner Scanner = new Scanner(System.in);
        chieuCao = Scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhTheTich();
        TheTich = DienTich * chieuCao;
    }
}
