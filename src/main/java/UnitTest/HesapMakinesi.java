package UnitTest;

public class HesapMakinesi {

    public int topla(Integer... a){
        return  a[0]+a[1];
    }
    public  int cikart(int... b){
        return b[0]-b[1];
    }
    public int metrekareHesapla(int eni, int boyu){
        return eni*boyu;
    }
}

