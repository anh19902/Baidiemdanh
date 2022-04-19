package Baithuchanh;

import java.util.Scanner;

public class Customer extends Person {
    protected long SDT;
    public String loaiCustomer() {
        return "";
}
        public void display() {
        System.out.println("\tSDT: " + SDT);
        System.out.println("\tHo ten: " + name);
        System.out.println("\tTuoi: " + age);
        System.out.println("\tDia chi: " + address);
    }

    // Ham nhap thong tin
    public void enter(Scanner sc) {
        System.out.print("\tNhap SDT: ");
        SDT = sc.nextInt();
        System.out.print("\tNhap ho ten: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("\tNhap tuoi: ");
        age = sc.nextInt();
        System.out.print("\tNhap dia chi: ");
        sc.nextLine();
        address = sc.nextLine();
    }
}
