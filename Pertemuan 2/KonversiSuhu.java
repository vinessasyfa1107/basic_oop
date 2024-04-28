class KonversiSuhu {
    double hasil;
    //method celcius to farenheit
    public double tofarenheit(double celcius){
        hasil = (celcius * 9/5) + 32;
        return hasil;
    }

    //method farenheit to celcius
    public double tocelcius(double farenheit){
        hasil = (farenheit - 32) * 5/9 ;
        return hasil;
    }
}
class KonversiSuhuTest{
    public static void main (String[] Args) {
        double suhuCelcius;
        double suhuFarenheit;
        double hasilCelcius;
        double hasilFarenheit;

        suhuCelcius = 37.0;
        suhuFarenheit = 145.0;

        KonversiSuhu hitung = new KonversiSuhu();

        hasilCelcius = hitung.tocelcius(suhuFarenheit);
        hasilFarenheit = hitung.tofarenheit(suhuCelcius);

        System.out.println("--> Farenheit to Celcius = " +hasilCelcius);
        System.out.println("--> Celcius to Farenheit = " +hasilFarenheit);
    }

}
