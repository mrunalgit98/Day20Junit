import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {
    User m=new User();
    @Test
    public void Test() {
        boolean result =m.Firstname("Aua");
        assertEquals(result,true);

    }


}