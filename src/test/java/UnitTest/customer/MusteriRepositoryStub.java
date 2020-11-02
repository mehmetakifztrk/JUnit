package UnitTest.customer;

import java.util.HashMap;
import java.util.Map;

public class MusteriRepositoryStub extends MusteriRepository {

    private Map<Integer, Musteri> musteriListesi = new HashMap<Integer, Musteri>();

    @Override
    public void kaydet(Musteri musteri) {
        musteriListesi.put(musteri.getId(),musteri);
    }

    @Override
    public void sil(Integer id) {
        musteriListesi.remove(id);
    }

    @Override
    public Musteri bul(Integer musteriId) {
        return musteriListesi.get(musteriId);
    }

    public Map<Integer, Musteri> getMusteriListesi() {
        return musteriListesi;
    }
}
