/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.logger;

import hot.logger.concrete.LogFileLogger;
import hot.logger.concrete.TxtFileLogger;
import hot.logger.concrete.CsvFileLogger;
import java.util.ArrayList;
import java.util.List;
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
     * Test of log method, of class AbstractLogger.
     */
    @Test
    public void testLogger() {                        
        //Logger.getInstance().log("Test logging");
        
        List<AbstractLogger> loggers = new ArrayList<AbstractLogger>() {{
            add(LogFileLogger.getInstance());
            add(CsvFileLogger.getInstance());
            add(TxtFileLogger.getInstance());
        }};                
        
        loggers.forEach((logger) -> {
            logger.log("Testing this test for testing purposes");
        }); 
        //TODO: open file check for string and assert
    }
    
    /**
     * Test of log method, of class AbstractLogger.
     */
    @Test
    public void testLoggerSingleton() {                                 
        assertEquals(
                LogFileLogger.getInstance(), 
                LogFileLogger.getInstance()
        );                
    }
    
}
