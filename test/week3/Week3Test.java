package week3;

import static org.junit.Assert.*;
import org.junit.Test;
public class Week3Test {

    /*public static void main(String[] args) {

        // TODO: Viết 5 testcase cho phương thức max()
        assertEquals(9, Week3.max(6, 9));
        assertEquals(3, Week3.max(3, 2));
        assertEquals(35, Week3.max(35, 21));
        assertEquals(11, Week3.max(6, 11));
        assertEquals(8, Week3.max(4, 8));
        
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        // TODO: Viết 5 testcase cho phương thức calculateBMI() 
    }
        */
    /**
     * Test of max method, of class Week3.
     */
    @Test
    public void testMax() {
        // TODO: Viết 5 testcase cho phương thức max()
        assertEquals(9, Week3.max(6, 9));
        assertEquals(3, Week3.max(3, 2));
        assertEquals(35, Week3.max(35, 21));
        assertEquals(11, Week3.max(6, 11));
        assertEquals(8, Week3.max(4, 8));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of minOfArray method, of class Week3.
     */
    @Test
    public void testMinOfArray() {
        
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        int[] array = {5, 6, 2, 7, 3};
        assertEquals(2, Week3.minOfArray(array));
        int[] array1 = {6, 13, 24, 3, 64};
        assertEquals(3, Week3.minOfArray(array1));
        int[] array2 = {51, 62, 24, 73, 31};
        assertEquals(24, Week3.minOfArray(array2));
        int[] array3 = {61, 13, 242, 37, 55};
        assertEquals(13, Week3.minOfArray(array3));
        int[] array4 = {87, 66, 23, 71, 38};
        assertEquals(23, Week3.minOfArray(array4));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI() {
        // TODO: Viết 5 testcase cho phương thức calculateBMI() 
        assertEquals("Thieu can", Week3.calculateBMI(48, 1.68));
        assertEquals("Binh thuong", Week3.calculateBMI(59, 1.65));
        assertEquals("Thua can", Week3.calculateBMI(63, 1.6));
        assertEquals("Beo phi", Week3.calculateBMI(75, 1.62));
        assertEquals("Binh thuong", Week3.calculateBMI(60, 1.8));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
