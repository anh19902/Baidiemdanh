package Baithuchanh;

import java.util.Scanner;

public class Student extends Person {
    // Thuoc tinh
    protected int năm;
    protected String loaiStudent() {
        return "";
    }
   // Ham khoi tao khong doi so
    public Student() {
}

  // Ham hien thi
  public void display() {
    super.display();
    System.out.println("\tNăm " + năm);
}
  // Ham nhap thong tin
  public void enter(Scanner sc) {
    System.out.print("\tNhap năm : ");
    năm = sc.nextInt();
}
}
