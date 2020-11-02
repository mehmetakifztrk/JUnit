package UnitTest.customer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MusteriServiceTest {

    private MusteriService musteriService;

    private MusteriRepositoryStub musteriRepository = new MusteriRepositoryStub();

    private BilgilendirmeService bilgilendirmeService;

    @Before
    public void setUp() throws Exception {
        musteriService = new MusteriService();
//        musteriRepository = Mockito.mock(MusteriRepository.class);
        bilgilendirmeService = Mockito.mock(BilgilendirmeService.class);
        musteriService.setBilgilendirmeService(bilgilendirmeService);
        musteriService.setMusteriRepository(musteriRepository);
    }

    @Test
    public void testMusteriKaydet(){
        Musteri musteri = new Musteri(1234);
        musteriService.musteriKaydet(musteri);
//        Mockito.verify(musteriRepository).kaydet(musteri);
//        assertTrue(musteriRepository.getMusteriListesi().containsValue(musteri));
        assertNotNull(musteriRepository.bul(musteri.getId()));
        Mockito.verify(bilgilendirmeService).yeniKayitMailGonder(musteri);
    }

    @Test
    public void testMusteriSil() {
        musteriService.musteriKaydet(new Musteri(1234));
        musteriService.musteriSil(1234);
        assertNull(musteriRepository.bul(1234));

    }
}
