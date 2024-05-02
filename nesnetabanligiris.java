package info.com;

public class nesnetabanligiris {

    public static void main(String args[]) {

        int yas = 30;
        //nesne oluşturma
        araba bmw = new araba();

        bmw.renk ="kırmızı";
        bmw.hız = 250;
        bmw.uzunluk = 2.50;
        bmw.calisiyorMu = true;

        araba volkswagen = new araba();

        volkswagen.renk = "siyah";
        volkswagen.hız = 260;
        volkswagen.uzunluk = 4.50;
        volkswagen.calisiyorMu = false;





        araba renault = new araba();
        renault.renk = "beyaz";
        renault.hız = 150;
        renault.uzunluk = 3.60;
        renault.calisiyorMu = true;

        renault.hizlan(30);
        renault.durdur();

        bmw.yavasla(90);


        //System.out.println(bmw.hız);

        bmw.bilgiAl();
        volkswagen.bilgiAl();
        renault.bilgiAl();





    }
}
