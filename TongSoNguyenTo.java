import java.util.Scanner;
import java.lang.Math;

public class TongSoNguyenTo{

    static boolean isPrime(int x){
        if(x < 2)
            return false;
        for(int i=2;i <= Math.sqrt(x);i++)
            if(x%i==0)
            return false;
        return true;
    }

    static int sumPrime(int x){
        int sum = 0;
        for(int i = 2; i < x; i++){
                if(isPrime(i))
                    sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int x = sc.nextInt();
        System.out.println("Tong cua cac so nguyen to be hon " + x + " la: " + sumPrime(x));
        sc.close();;
    }
}




