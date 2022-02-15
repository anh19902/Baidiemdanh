import java.util.Scanner;

public class Baitap {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;
    public static void main(String[] args) throws Exception {
        System.out.print("Nhap so nguyen n = ");
        int n = scanner.nextInt();
        System.out.printf("Tong cua cac chu so %d la : %d", n, totalDigitsOfNumber(n));
    }
    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        }   while (n > 0);
        return total;
    }
} 
