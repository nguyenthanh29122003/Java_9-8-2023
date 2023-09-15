import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;
        float r;

        System.out.print("Nhap ban kinh hinh tron: ");
        r = sc.nextFloat();

        float c = r * 2 * PI;
        float s = r * r * PI;

        System.out.printf("Chu vi hinh tron: %.2f \n", c);
        System.out.printf("Dien tich hinh tron: %.2f", s);

        sc.close();
    }
}
