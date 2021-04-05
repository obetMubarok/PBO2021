package TUGAS;

class Nilai{
    private double daftarNilai[];
    private String nama;

    public Nilai(String nama, int jumlah){
        this.nama = nama;
        daftarNilai = new double[jumlah];
    }   

    public double[] getDaftarNilai() {
        return daftarNilai;
    }

    public void setDaftarNilai(double[] daftarNilai) {
        this.daftarNilai = daftarNilai;
    }
    
}

class NilaiMhs extends Nilai{
    private String nim;

    public NilaiMhs(String nim, String nama, int jumlah) {
        super(nama, jumlah);
        this.nim = nim;
        
    }
    public double getIps(){
        double jumlahNilaiPokok=0;
        double ips=0;
        for(int i=0;i<getDaftarNilai().length;i++){
           if(getDaftarNilai()[i]>=91)
               jumlahNilaiPokok += 4*2;
           else if(getDaftarNilai()[i]>=76)
               jumlahNilaiPokok += 3.5*2;
           else if(getDaftarNilai()[i]>=61)
               jumlahNilaiPokok += 3*2;
           else if(getDaftarNilai()[i]>=46)
               jumlahNilaiPokok += 2.5*2;
           else if(getDaftarNilai()[i]>=31)
               jumlahNilaiPokok += 2*2;
           else if(getDaftarNilai()[i]>=16)
               jumlahNilaiPokok += 1*2;
           else
               jumlahNilaiPokok += 0*2;
        }
        ips = jumlahNilaiPokok/((getDaftarNilai().length)*2);
        
        return ips;
    }
}

class NilaiSiswa extends Nilai{
    private String nis;

    public NilaiSiswa(String nis, String nama, int jumlah) {
        super(nama, jumlah);
        this.nis = nis;
    }
    public double getAvg(){
        double jumlah=0;
        for(int i=0; i<getDaftarNilai().length; i++){
            jumlah += getDaftarNilai()[i];
        }
        return jumlah/getDaftarNilai().length;
    }
    public double getMax(){
        double max=getDaftarNilai()[0];
        for(int i=1; i<getDaftarNilai().length;i++){
            if(max<getDaftarNilai()[i])
                max = getDaftarNilai()[i];
        }
        return max;
    }
    public double getMin(){
        double min=getDaftarNilai()[0];
        for(int i=1; i<getDaftarNilai().length;i++){
            if(min>getDaftarNilai()[i])
                min = getDaftarNilai()[i];
        }
        return min;
    }
}
public class Tugas2B {
    public static void main(String[] args) {
        NilaiMhs n = new NilaiMhs("1234", "Obet", 5);
        NilaiSiswa n2 = new NilaiSiswa("1234", "Ali", 3);
        
        n.setDaftarNilai(new double[]{100,90,80,90,95});
        n2.setDaftarNilai(new double[]{100,78,90});
        
        System.out.println(n.getIps());
        System.out.println(n2.getMax());
    }
}
