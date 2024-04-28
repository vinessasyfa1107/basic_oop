import java.util.Scanner;
public class DemoIf {
    /**Main Method*/
    public static void main(String [] args){
        double nilaiInput;
        Scanner InputConsole = new Scanner(System.in);
        System.out.println("\nPROGRAM DEMO IF");
        System.out.println("--------------------\n");

        // Menginstruksikan user untuk menginputkan nilai
        System.out.println("Masukkan Nilai [0 - 100]: ");
        nilaiInput = InputConsole.nextDouble();

        // Menyeleksi kondisi dan mencetak hasil ke console
        if (nilaiInput >= 60)
        System.out.println("\nSelamat, anda lulus mata kuliah ini.");
    }
}
