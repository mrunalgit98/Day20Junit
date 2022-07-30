import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserTest {
    User m = new User();

    String email;
    boolean expResult;

    public UserTest(String email,boolean expResult){
        this.email=email;
        this.expResult=expResult;
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", true } });
    }
    @Test
    public void testEmail(){
        User user=new User();
        Assert.assertEquals(expResult,user.email(email));
    }
}
