import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {
    User m=new User();
    @Test
    public void Test() {
        boolean result =m.Rule4("A1@bcdefghijkl");
        assertEquals(result,true);

    }


}