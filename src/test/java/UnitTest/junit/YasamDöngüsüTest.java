package UnitTest.junit;

import org.junit.*;

public class YasamDöngüsüTest {

    @BeforeClass
    public static void beforeCls(){
        System.out.println("Her test sınıfı icin ilk çalışır");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("Her test methodu öncesi");
    }
    @Test
    public void testHelloWorld1() {
        System.out.println("Hello World 1");
    }
    @Test
    @
    public void testHelloWorld2() {
        System.out.println("Hello World 2");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("Her test methodu sonrasi");
    }
    @AfterClass
    public static void AfterCls(){
        System.out.println("Her test sinifi için son çalışır");
    }
}
