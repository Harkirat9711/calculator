package com.flexon.calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Appsum()
    { 
		System.out.println("sum");
     int x = 15;
     int y = 15;
     
     
     int expResult = 30;
     int result = App.Appsum(x, y);
     assertEquals(expResult, result);

     assertEquals(15, App.Appsum(15, 0));

     assertEquals(15, App.Appsum(0, 15));

     assertEquals(0, App.Appsum(0, 0));
     
    }
    @Test
    public void Appsub()
    { 
		System.out.println("sum");
     int x = 15;
     int y = 15;
     
     
     int expResult = 0;
     int result = App.Appsub(x, y);
     assertEquals(expResult, result);

     assertEquals(15, App.Appsub(15, 0));

     assertEquals(15, App.Appsub(0, 15));

     assertEquals(0, App.Appsub(0, 0));
     
    }
    @Test
    public void Appmul()
    { 
		System.out.println("sum");
     int x = 15;
     int y = 15;
     
   
     int expResult = 225;
     int result = App.Appmul(x, y);
     assertEquals(expResult, result);

     assertEquals(0, App.Appmul(15, 0));

     assertEquals(0, App.Appmul(0, 15));

     assertEquals(0, App.Appmul(0, 0));
     
    
    }
   
    
    
}
