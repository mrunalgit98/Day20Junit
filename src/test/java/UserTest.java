import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class UserTest {
    User m = new User();

    @Test
    public void Test() {
        boolean result = m.Firstname("Mrunal");
        assertEquals(result, true);

    }

    @Test
    public void TestFalse() {
        boolean result = m.Firstname("mrunal");
        assertEquals(result, false);

    }


    @Test
    public void Test1() {
        boolean result = m.Lastname("Bhoir");
        assertEquals(result, true);
    }

    @Test
    public void Test1False() {
        boolean result = m.Lastname("bhoir");
        assertEquals(result, false);
    }



    @Test
    public void Test3() {
        boolean result =m.email("abc.xyz@bl.co.in");
        assertEquals(result,true);

    }


    @Test
    public void Test3False() {
        boolean result =m.email("abc.xyz.bl.co.in");
        assertEquals(result,false);

    }

    @Test
    public void Test4() {
        boolean result =m.MobileNo("91-9892820222");
        assertEquals(result,true);

    }

    @Test
    public void Test4False() {
        boolean result =m.MobileNo("91-989282022243");
        assertEquals(result,false);

    }

    @Test
    public void Test5(){
        boolean result=m.Password("A1@aamsmads");
        assertEquals(result,true);
    }

    @Test
    public void Test5False(){
        boolean result=m.Password("A1aamsmads");
        assertEquals(result,false);
    }

    public void  moodanalyserTest_happy(){
        User user=new User();
        String isHappy=user.moodAnalyzer("Mrunal","Bhoir","abc.xyz@bl.co.in","91-9892820222","A1@aamsmads");
        Assert.assertEquals("Happy",isHappy);

      }

      public void moodanalyserTest_sad(){
        User user=new User();
        String isSad=user.moodAnalyzer("mrunal","bhoir","abc.xyz.bl.co.in","91-989282022243","A1aamsmads");
        Assert.assertEquals("Sad",isSad);
    }
    }

