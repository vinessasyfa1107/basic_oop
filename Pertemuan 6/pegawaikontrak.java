import java.time.*;

    public class pegawaikontrak extends pegawai {

        pegawaikontrak(String id, String nama, int golongan, LocalDate tgllhr){
            super(id, nama, golongan, tgllhr);
        }

        long hitungtunjanganpegawai(){
            long tunjaganpegawai = 1000000;
            return tunjaganpegawai;
        }

        long hitungtotalgaji(){
            long total = this.hitunggajipokok() + this.hitungtunjanganpegawai();
            return total;
        }

        void printpegawai(){
            System.out.println("ID Pegawai   : " + this.idpegawai);
            System.out.println("Nama Pegawai : " + this.nama);
            System.out.println("Golongan     : " + this.golongan);
            System.out.println("Tgl Lahir    : " + this.tglLahir);
            System.out.println("Usia         : " + this.hitungusia() + " tahun");
            System.out.println("Gaji Pokok   : Rp " + this.hitunggajipokok());
            System.out.println("Tunj Pegawai : Rp " + this.hitungtunjanganpegawai());
            System.out.println("Total Gaji   : Rp " + this.hitungtotalgaji());
        }
    }

