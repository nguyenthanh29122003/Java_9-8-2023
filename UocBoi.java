import java.util.Scanner;

public class UocBoi {
    public static int UCLN(int a, int b){
        int min = (a<b)?b:a;
        int ucln = 0;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i == 0){
                ucln = i;
            }
        }
        return ucln;
    }

    public static int BCNN(int a, int b){
        int max = (a>b)?a:b;
        while(true){
            if(max % a == 0 && max % b == 0)
                return max;
            ++max;
        }
    }

    public static void main(String[] args){
        System.out.println(UCLN(24,48));
        System.out.println(BCNN(6,12));
    }
}
