package TUGAS;
class Anggota{
    private String daftarAnggota[];
    private int jumlah;
    private boolean penuh;
    public Anggota(int max){
        daftarAnggota = new String[max];
        penuh = false;
        jumlah = 0;
    }

    public String[] getDaftarAnggota() {
        return daftarAnggota;
    }

    public int getJumlah() {
        return jumlah;
    }

    public boolean isPenuh() {
        return penuh;
    }

    public void setDaftarAnggota(String[] daftarAnggota) {
        this.daftarAnggota = daftarAnggota;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setPenuh(boolean penuh) {
        this.penuh = penuh;
    }
    
    public void info(){
        System.out.println("Jumlah anggota : "+(jumlah));
        for(int i=0;i<jumlah;i++){//menampilkan sebanyak jumlah anggota
            System.out.println((i+1)+". "+daftarAnggota[i]);
        }
    }
    
    public boolean isKosong(){
        boolean hasil = false;
        if(jumlah == 0){
            hasil = true;
        }
        return hasil;
    }
    public void format(){
        jumlah = 0;
        penuh = false;
        
    }
    
    public void tambahAnggota(String anggotabaru){
        if(!penuh){
            daftarAnggota[jumlah] = anggotabaru;
            jumlah++;
            if(jumlah == daftarAnggota.length){
                penuh = true;
            }
        }else{
                System.out.println("Anggota Penuh");
        }
    }
    public void hapusAnggota(){
        if(isKosong()){
            System.out.println("Anggota Kosong");
        }else{
            jumlah--;
        }
    }
}
public class Tugas1 {
    public static void main(String[] args) {
        Anggota a1 = new Anggota(4);
        a1.tambahAnggota("Obet");
        a1.tambahAnggota("Ali");
        a1.tambahAnggota("Omar");
        a1.format();
        a1.hapusAnggota();
        a1.info();
    }
}
