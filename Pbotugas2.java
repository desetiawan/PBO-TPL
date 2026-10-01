
import java.util.Scanner;

public class Pbotugas2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float jari, keliling, luas;
        final float PI = 3.14f;

        System.out.print("Masukan jari-jari: ");
        jari = input.nextFloat();

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);

        input.close();
    }
}