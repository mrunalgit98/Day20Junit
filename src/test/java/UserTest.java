import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {
    User m=new User();
    @Test
    public void Test() {
        boolean result =m.Rule3("A1bcdefghijkl");
        assertEquals(result,true);

    }


}