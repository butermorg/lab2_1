/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author badca
 */
public class FileWorkTest {

    @Test
    public void testRead() throws Exception {
        System.out.println("Read");
        FileWork instance = new FileWork();
        String a =instance.Read();
        assertNotNull(a);
        //fail("The test case is a prototype.");
    }
    
}
