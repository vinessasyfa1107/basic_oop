import java.util.Scanner;

public class MethodOverloadTest {
    public static void main(String[] args){
        MethodOverload mo = new MethodOverload();
        Scanner angka = new Scanner(System.in);

        System.out.println("Program Method Kuadrat");
        System.out.println("========================");

        System.out.println("Masukkan sebuah bilangan bulat: ");
        int bulat = angka.nextInt();

        System.out.println("Masukkan sebuah bilangan deimal: ");
        double desimal = angka.nextDouble();

        mo.kuadrat(bulat);
        mo.kuadrat(desimal);
        angka.close();
    }
}
