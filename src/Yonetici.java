public class Yonetici extends Calisan {

    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;

    }

    public void setSorumluKisiSayisi(int sorumluKisiSayisi) {
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    public int getSorumluKisiSayisi() {
        return this.sorumluKisiSayisi;
    }

    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu kisi sayisi "+sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktari){

        System.out.println(getAd() +  " calisanlara "+ zamMiktari +" tl zam yapti..");
    }

}
