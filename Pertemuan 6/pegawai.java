import java.time.*;
public class pegawai {
        String idpegawai;
        String nama;
        int golongan;
        LocalDate tglLahir;

        pegawai(String id, String nama, int golongan, LocalDate tgllhr){
            this.idpegawai = id;
            this.nama = nama;
            this.golongan = golongan;
            this.tglLahir = tgllhr;
        }
        int hitungusia(){
            LocalDate today = LocalDate.now();
            Period selisih = Period.between(this.tglLahir, today);
            return selisih.getYears();
        }

        // hitung gaji pokok berdasarkan golongan dan usia
        long hitunggajipokok(){
            long gajipokok = 0;
            if (this.golongan == 1){
                if (this.hitungusia() < 40){
                    gajipokok = 3500000;
                } else {
                    gajipokok = 4500000;
                }
            } else if (this.golongan == 2){
                if (this.hitungusia() < 40){
                    gajipokok = 5000000;
                } else {
                    gajipokok = 6000000;
                }
            }
            return gajipokok;
        }

        void printpegawai(){
            System.out.println("ID Pegawai   : " + this.idpegawai);
            System.out.println("Nama Pegawai : " + this.nama);
            System.out.println("Golongan     : " + this.golongan);
            System.out.println("Tgl Lahir    : " + this.tglLahir);
            System.out.println("Gaji Pokok   : Rp " + this.hitunggajipokok());
        }
    }
