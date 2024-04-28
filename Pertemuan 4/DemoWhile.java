public class DemoWhile {

    /**Main Method*/
    public static void main(String[] args) {
        int counter = 0; // Inisialisasi counter

        System.out.println("\nPROGRAM DEMO WHILE");
        System.out.println("----------------------\n");

        while (counter <= 5) { //Kondisi perulangan
            System.out.println("Mencetak counter ke-" + counter);
            ++counter; //Menaikkan counter dengan 1
        }
    }
}
