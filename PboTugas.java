
package pbo.tugas;

import java.util.Scanner;

/**
 *
 * @author SETIAWAN GANTENG
 */
public class PboTugas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tahun
        System.out.print("Masukan Tahun (1909 - 2024): ");
        int tahun = input.nextInt();

        // Cek kabisat
        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

        input.close();
    }
}    }
        // TODO code application logic here
    }
    
}
