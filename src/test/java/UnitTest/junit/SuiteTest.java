package UnitTest.junit;

import junitparams.Parameters;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertTest.class,
        YasamDöngüsüTest.class,
        ParametreTest.class,
        JUnitParamsTest.class
})
public class SuiteTest {
}
