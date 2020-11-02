package UnitTest.customer;

public class MusteriRepository {

     public void kaydet(Musteri musteri) {
        System.out.println("kaydedildi");
     }
     public void sil(Integer id) {
        System.out.println("Müsteri Silindi");
     }
     public  Musteri bul(Integer musteriId){
         System.out.println("Bul");
         return  null;
     }

}
