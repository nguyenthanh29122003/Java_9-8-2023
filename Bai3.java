import java.util.Scanner;
public class Bai3 {
    
    public static int Max(int a, int b, int c){
        int max = a;
        if(b>max){
            if(c>b)
                max = c;
            else
                max = b;
        }else if(c>max)
            max = c;
        return max;
    }

    public static float AVG(int a, int b, int c){
        return (a+b+c)/3;
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);     

        int a, b, c;

        System.out.printf("Nhap a: ");
        a = sc.nextInt();
        System.out.printf("Nhap b: ");
        b = sc.nextInt();
        System.out.printf("Nhap c: ");
        c = sc.nextInt();

        System.out.printf("So vua nhap: %d, %d, %d \n", a, b, c);

        int temp = (a>b) ? a : b;
        int max = (c>temp) ? c : temp;

        

        System.out.printf("Trung binh cong cua 3 so la: %.2f \n", AVG(a, b, c));        
        System.out.println("So lon nhat trong 3 so la: " + max);

        sc.close();
    }
}
