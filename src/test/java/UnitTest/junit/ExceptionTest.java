package UnitTest.junit;

import UnitTest.customer.BilgilendirmeService;
import UnitTest.customer.exception.MailServerUnavailableException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
public class ExceptionTest {

    private BilgilendirmeService bilgilendirmeService = new BilgilendirmeService();

    @Test
    public void testTryCatchException() {
        try{
            bilgilendirmeService.haftalikMailGonder();
        }catch (Exception e){
            assertTrue(e instanceof MailServerUnavailableException);
            assertEquals("mail server hata veriyor", e.getMessage());
        }
    }

    @Test(expected = MailServerUnavailableException.class)
    public void testExpectedException() {
        bilgilendirmeService.haftalikMailGonder();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testRuleException() throws Exception {
        thrown.expect(MailServerUnavailableException.class);
        thrown.expectMessage("mail server hata veriyor");

        bilgilendirmeService.haftalikMailGonder();
    }

    @Rule
    public Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    public void testCatchExceptionFramework(){
        catchException(bilgilendirmeService).haftalikMailGonder();

        assertTrue(caughtException() instanceof MailServerUnavailableException);
        assertEquals("mail server hata veriyor",caughtException().getMessage());
    }
}
