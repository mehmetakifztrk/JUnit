package UnitTest;

import org.junit.Assert;
import org.junit.Test;

public class HesapMakinesiTest {

    @Test
    public void testHesapMakinesi() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int sayi1 = 5;
        int sayi2 = 19;
        int topla = hesapMakinesi.topla(sayi1, sayi2);
        Assert.assertEquals(24,topla);
    }

    @Test
    public void testCıkart() {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        Assert.assertEquals(15,hesapMakinesi.cikart(15,0));
        Assert.assertEquals(-5,hesapMakinesi.cikart(10,15));
        Assert.assertEquals(20,hesapMakinesi.cikart(50,30));
    }
}
