import java.time.*;

    public class gajitotal {

        public static void main(String[] args) {
            pegawai p1 = new pegawai("P01", "Eliyanti", 2, LocalDate.of(2000, 10, 7));
            p1.printpegawai();

            pegawaitetap p2 = new pegawaitetap("P02", "Vinessa Gabby Asyfa", 1, LocalDate.of(2003, 7, 11), "8888");
            p2.printpegawai();

            pegawaikontrak p3 = new pegawaikontrak("P03", "Athena Seyan", 1, LocalDate.of(2008, 9, 30));
            p3.printpegawai();
        }

    }

