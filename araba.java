package info.com;

public class araba {
    String renk ;
    int hız;
    double uzunluk;
    boolean calisiyorMu;

    //metod davranışı beliler özellik yapabilirlik

    public void calistir(){
        calisiyorMu = true;
    }
    public void durdur(){
        calisiyorMu = false;
    }

    public void hizlan(int miktar){
        hız = hız + miktar;
    }
    public void yavasla(int miktar){
        hız = hız- miktar;
    }

    public void bilgiAl(){
        System.out.println("rengi" + renk);
        System.out.println("hız" + hız);
        System.out.println("uzunluk" + uzunluk);
        System.out.println("çalışıyor mu" + calisiyorMu);


    }

}
