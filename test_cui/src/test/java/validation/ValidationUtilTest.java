package validation;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class ValidationUtilTest {

    @BeforeClass
    public static void beforeClass() {
        new ValidationUtil();
    }

    @Test
    public void isHankakuTest() {
        boolean val = ValidationUtil.isHankaku('か');
        assertThat(val, is(false));
        val = ValidationUtil.isHankaku('ｶ');
    }
}
