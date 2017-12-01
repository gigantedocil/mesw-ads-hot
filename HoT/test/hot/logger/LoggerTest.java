/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joao
 */
public class LoggerTest {
    
    public LoggerTest() {
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

    /**
     * Test of log method, of class Logger.
     */
    @Test
    public void testLogger() {                        
        Logger.getInstance().log("Test logging");
        
        //TODO: open file check for string and assert
    }
    
    /**
     * Test of log method, of class Logger.
     */
    @Test
    public void testLoggerSingleton() {                                 
        assertEquals(
                Logger.getInstance(), 
                Logger.getInstance()
        );                
    }
    
}
