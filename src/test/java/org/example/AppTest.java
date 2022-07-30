package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Before
    public void before(){
        System.out.println("before");
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("hello world");
    }
    @After
    public void after(){
        System.out.println("after");
    }
}
