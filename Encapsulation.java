 class Hewan {
    private String NamaHewan;
    private String JenisHewan;
    private int UmurHewan;

    public String getNamaHewan(){
        return NamaHewan;
    }
    public void setNamaHewan(String NamaHewan){
        this.NamaHewan = NamaHewan;
    }

    public String getJenisHewan(){
        return JenisHewan;
    }
    public void setJenisHewan(String JenisHewan){
        this.JenisHewan = JenisHewan;
    }
    public int getUmurHewan(){
        return UmurHewan;
    }
    public void setUmurHewan(int UmurHewan){
        this.UmurHewan = UmurHewan;
    }

}

    public class encapsulation {
    
         public static void main(String[] args) {
            Hewan hewan = new Hewan();
            hewan.setNamaHewan("Harimau");
            hewan.setJenisHewan("Darat");
            hewan.setUmurHewan(19);

        System.out.println("Nama Hewan: " + hewan.getNamaHewan());
        System.out.println("Jenis Hewan: " + hewan.getJenisHewan());
        System.out.println("Umur Hewan: " + hewan.getUmurHewan());

        }
    }
