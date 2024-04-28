public class Example {
    static int count = 0;
    final String name;

    public Example(String name){
        count++;
        this.name = name;
    }

    public static void main(String[] args){
        Example obj1 = new Example("John");
        Example obj2 = new Example("Jane");

        System.out.println("Total objek: " + Example.count);

        System.out.println("Nama objek 1: " + obj1.name);
        System.out.println("Nama objek 2: " + obj2.name);
    }
}
