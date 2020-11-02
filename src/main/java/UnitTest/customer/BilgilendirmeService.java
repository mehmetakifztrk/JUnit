package UnitTest.customer;

import UnitTest.customer.exception.MailServerUnavailableException;

public class BilgilendirmeService {

    public void yeniKayitMailGonder(Musteri musteri){
        System.out.println("Mail Gönderildi");
    }
    public void haftalikMailGonder(){
        throw new MailServerUnavailableException("mail server hata veriyor");
    }
}
