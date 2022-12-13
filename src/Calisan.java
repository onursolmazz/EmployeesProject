
public class Calisan {
    private String ad;
    private String soyad;
    private int id;

    public Calisan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public String getAd() {
        return this.ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return this.soyad;
    }

    public void setSoyad(String soyad){
        this.soyad = soyad ;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id ;
    }


    public void bilgileriGoster(){
        System.out.println("Calisan Bilgileri ...");
        System.out.println("Isim :"+ad);
        System.out.println("Soyisim :"+soyad);
        System.out.println("Id :"+id);

    }


}
