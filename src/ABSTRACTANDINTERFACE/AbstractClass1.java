package ABSTRACTANDINTERFACE;
abstract class KelasAbstract{
    private String pesan;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
    abstract public void infoPesan();
}

class KelasAnak extends KelasAbstract{

    @Override
    public void infoPesan() {
        System.out.println("isi Pesan : "+getPesan());
    }
    
}


public class AbstractClass1 {
    public static void main(String[] args) {
        //KelasAbstract kaa = new KelasAbstract(); kelas abstract tidak bisa dibuat objek
        KelasAbstract kaa = new KelasAnak();//bisa menunjuk ke objek dari class anak
        KelasAnak ka = new KelasAnak();
        
        //kaa = ka;//proses menunjuk yg lain
        
        ka.setPesan("Selamat datang");
        ka.infoPesan();
    }
}
