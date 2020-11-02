package UnitTest.junit;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void testAssertion() {
        Dummy d1 = new Dummy(10);
        Dummy d2 = new Dummy(10);
//        Dummy d2 = d1;
//        assertEquals(d1,d2); //bu method equals metoduna bakarak  ıkısı aynımı dıye kontrol eder
//        assertSame("Vermek istedigin hata mesajını verıyorsun",d1,d2); // bu method equals metoduna bakmaksızın ıkı nesne aynımı dıye kontrol eder
//        assertNull(d1);
//        assertNotNull(d2);
        assertTrue(d1.equals(d2));
    }
    public static class Dummy{
        private int id;

        public Dummy(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            return this.id == ((Dummy)obj).getId();
        }
    }
}
