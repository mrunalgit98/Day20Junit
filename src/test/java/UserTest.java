import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {
    User m=new User();
    @Test
    public void Test() {
        boolean result =m.Rule1("abcdefghijkl");
        assertEquals(result,true);

    }


}