package entorns;

import org.junit.Test;
import static org.junit.Assert.*;

public class GroupArraysTest {
    

    //Entre en els dos bucles
    @Test
    public void testGroupArrays1() {
        System.out.println("Dos bucles");
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] expResult = {1,2,3,4,5,6};
        int[] result = GroupArrays.groupArrays(array1, array2);
        assertArrayEquals(expResult, result);

    }
    
    //Entre en el primer bucle
    @Test
    public void testGroupArrays2() {
        System.out.println("Primer Bucle");
        int[] array1 = {1,2,3};
        int[] array2 = {};
        int[] expResult = {1,2,3};
        int[] result = GroupArrays.groupArrays(array1, array2);
        assertArrayEquals(expResult, result);

    }
    
    //Entre en el segon bucle 
    @Test
    public void testGroupArrays3() {
        System.out.println("Segon Bucle");
        int[] array1 = {};
        int[] array2 = {4,5,6};
        int[] expResult = {4,5,6};
        int[] result = GroupArrays.groupArrays(array1, array2);
        assertArrayEquals(expResult, result);

    }
    
    //Entre en el segon bucle 
    @Test
    public void testGroupArrays4() {
        System.out.println("Cap Bucle");
        int[] array1 = {};
        int[] array2 = {};
        int[] expResult = {};
        int[] result = GroupArrays.groupArrays(array1, array2);
        assertArrayEquals(expResult, result);

    }
    
    
    
}
