import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String islemler = "Islemler... \n"
                + "1. Yazilimci islemleri \n"
                + "2. Yonetici islemleri \n"
                + "Cikis icin q ya basin";
        System.out.println(islemler);

        while (true) {
            System.out.print("Islem secin :");
            String islem = scn.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islem.equals("1")) {
               Yazilimci yazilimci = new Yazilimci("Onur", "Solmaz", 1234, "Java,C");
                String yazilimciIslemleri = "1.Format At\n"
                        + "2. Bilgileri Goster \n"
                        + "Cikis icin q ya basin";

                System.out.println(yazilimciIslemleri);

                while (true) {
                    System.out.print("Islem secin :");
                    String yazilimciIslem = scn.nextLine();

                    if (yazilimciIslem.equals("q")) {
                        System.out.println("Yazilimci islemlerinden cikis yapiliyor...");
                        break;
                    } else if (yazilimciIslem.equals("1")) {
                        System.out.print("Isletim sistemi :");
                        String isletimSistemi = scn.nextLine();
                        yazilimci.formatAt(isletimSistemi);

                    } else if (yazilimciIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }else {
                        System.out.println("Gecersiz yazilimci islemi girdiniz...");
                    }
                }
            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Batuhan", "Berk", 1235, 10);
                String yoneticiIslemleri = "1.Zam Yap\n"
                        + "2. Bilgileri Goster \n"
                        + "Cikis icin q ya basin";

                System.out.println(yoneticiIslemleri);

                while (true) {
                    System.out.print("Islem secin :");
                    String yoneticiIslem = scn.nextLine();

                    if (yoneticiIslem.equals("q")) {
                        System.out.println("Yonetici islemlerinden cikis yapiliyor...");
                        break;
                    } else if (yoneticiIslem.equals("1")) {
                        System.out.print(yonetici.getAd() + "dan ne kadar zam istiyorsunuz :");
                        int yoneticiZam = scn.nextInt();
                        yonetici.zamYap(yoneticiZam);

                    } else if (yoneticiIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }else{
                        System.out.println("Gecersiz yonetici islemi girdiniz...");
                    }
                }
            } else {
                System.out.println("Gecersiz islem...");
            }
        }

    }
}

