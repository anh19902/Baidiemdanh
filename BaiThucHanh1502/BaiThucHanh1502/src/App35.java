import java.util.Scanner;

public class App35 {
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) throws Exception {
            System.out.print("Nhap so nguyen a = ");
            int a = scanner.nextInt();
            System.out.print("Nhap so nguyen b = ");
            int b = scanner.nextInt();
        if(a < b)
            System.out.println(a);
        else System.out.println(b);
}
}
