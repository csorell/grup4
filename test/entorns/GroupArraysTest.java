package entorns;

import org.junit.Test;
import static org.junit.Assert.*;

public class GroupArraysTest {
    

	//Entra en els dos bucles
	@Test
	public void testGroupArrays1() {
    	System.out.println("Dos bucles");
    	int[] array1 = {1,2,3};
    	int[] array2 = {4,5,6};
    	int[] expResult = {1,2,3,4,5,6};
    	int[] result = GroupArrays.groupArrays(array1, array2);
    	assertArrayEquals(expResult, result);

	}
    
	//Entra en el primer bucle
	@Test
	public void testGroupArrays2() {
    	System.out.println("Primer Bucle");
    	int[] array1 = {1,2,3};
    	int[] array2 = {};
    	int[] expResult = {1,2,3};
    	int[] result = GroupArrays.groupArrays(array1, array2);
    	assertArrayEquals(expResult, result);

	}
    
	//Entra en el segon bucle
	@Test
	public void testGroupArrays3() {
    	System.out.println("Segon Bucle");
    	int[] array1 = {};
    	int[] array2 = {4,5,6};
    	int[] expResult = {4,5,6};
    	int[] result = GroupArrays.groupArrays(array1, array2);
    	assertArrayEquals(expResult, result);

	}
    
	//No entra a cap bucle
	@Test
	public void testGroupArrays4() {
    	System.out.println("Cap Bucle");
    	int[] array1 = {};
    	int[] array2 = {};
    	int[] expResult = {};
    	int[] result = GroupArrays.groupArrays(array1, array2);
    	assertArrayEquals(expResult, result);

	}
    
	//Entra al if
    	@Test
	public void testGroupArrays5() {
    	System.out.println("Desordenat");
    	int[] array1 = {1,2,3};
    	int[] array2 = {4,6,5};
    	int[] expResult = {1,2,3,4,5,6};
    	int[] result = GroupArrays.groupArrays(array1, array2);
    	assertArrayEquals(expResult, result);

	}
    
}
