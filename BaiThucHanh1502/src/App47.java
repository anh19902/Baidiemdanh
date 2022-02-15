import java.util.Scanner;
public class App47 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int sum=0;
        do{
            System.out.println("nhap n so bat ki : ");
            int n=sc.nextInt();
            sum+=n;
            System.out.println("Tong la : "+sum);
             

        }while(sum<=100);
        
}
}