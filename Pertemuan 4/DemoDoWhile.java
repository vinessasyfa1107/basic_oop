public class DemoDoWhile {

    /**Main Method*/
    public static void main(String[] args) {
        int counter = 0; // Inisialisasi counter

        System.out.println("\nPROGGRAM DEMO DO..WHILE");
        System.out.println("-------------------------\n");

        do{
            System.out.println("Mencetak counter ke-" + counter);
            ++counter;
        }while(counter <= 0);
    }
}
