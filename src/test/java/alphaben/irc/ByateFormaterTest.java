/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package alphaben.irc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ebennamr
 */
public class ByateFormaterTest {
    
    public ByateFormaterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    
     @Test
     public void ByteForamterTest() {
     
         long size = 1024;
         assertEquals("1.00 KB",ByteFormater.formatBytes(size));
         
         
          size = 1024 * 1024;
         assertEquals("1.00 MB",ByteFormater.formatBytes(size));
     
     
     
     }


}