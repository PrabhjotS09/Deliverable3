package cardproject;


import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testGetNameGood() { 
        System.out.println("check name");
         String name = "Tom Smith";
        boolean expResult = true;
        
        boolean actualResult = cardproject.Player.getName(name);

        assertEquals(expResult, actualResult);
        
        assertTrue(actualResult);
    }
    
    
    @Test
    public void testGetNameBad() { 
        System.out.println("check name");
       String name="";
        boolean expResult = false;
        
        boolean actualResult = cardproject.Player.getName(name);

        assertEquals(expResult, actualResult);
        
        assertFalse(actualResult);
    }
    
    
    @Test
    public void testGetNameBoundary() { 
        System.out.println("check name");
        String name = "Smith" ;
        boolean expResult = true;
        
        boolean actualResult =cardproject.Player.getName(name);

        assertEquals(expResult, actualResult);
        
        assertTrue(actualResult);
    }


}