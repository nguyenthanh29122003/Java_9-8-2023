import java.util.Scanner;

public class MenuAB {

    public static double Tong(double a, double b){
        return a+b;
    }

    public static double Hieu(double a, double b){
        return a-b;
    }

    public static double Tich(double a, double b){
        return a*b;
    }

    public static double Thuong(double a, double b){
        return a/b;
    }

    public static boolean Menu(int s, double a, double b){
        if(s == 1){
            System.out.println("\n    Tinh tong cua hai so la: " + Tong(a, b));
            return true;
        }else if(s == 2){
            System.out.println("\n    Tinh hieu cua hai so la:" + Hieu(a, b));
            return true;
        }else if(s == 3){
            System.out.println("\n    Tinh tich cua hai so la:" + Tich(a, b));
            return true;
        }else if(s == 4){
            System.out.println("\n    Tinh thuong cua hai so la: " + Thuong(a, b));
            return true;
        }else if(s == 0){
            System.out.println("\n    Da thoat khoi menu! ");
            return false;
        }else {
            System.out.println("\n    Khong co lua chon nay!");
            return true;
        }
    }


    public static void menuShow(){
            System.out.println("");    
            System.out.println("    1. Tinh tong ");
            System.out.println("    2. Tinh hieu ");
            System.out.println("    3. Tinh tich ");
            System.out.println("    4. Tinh thuong ");
            System.out.println("    0. Thoat menu ");
            System.out.print("    Nhap lua chon:  ");
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        double a, b;
        int s;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        boolean show = true;
        while(show){
            menuShow();
            s = sc.nextInt();
            show = Menu(s, a, b);
        }
        sc.close();
    }
}
