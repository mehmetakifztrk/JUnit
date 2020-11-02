package UnitTest.junit;

import UnitTest.HesapMakinesi;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class JUnitParamsTest {
    private HesapMakinesi hesapMakinesi = new HesapMakinesi();

    @Test
    @Parameters({"10,2,20", "20,3,60"})
    public void testMetreKareHesaplama(int eni, int boyu, int toplamMetreKare) {
        assertEquals(toplamMetreKare,hesapMakinesi.metrekareHesapla(eni, boyu));
    }
}
