import java.util.Scanner;

public class Bai1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String hoTen, queQuan;
        int namSinh;

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();

        System.out.printf("Ho ten: %s; Nam sinh: %d; Que quan: %s", hoTen, namSinh, queQuan);

        sc.close();
    }
}