/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entorns.Empleas;

import com.sun.jmx.snmp.BerException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joana
 */
public class AdministrarEmpleadosTest {
    
    public AdministrarEmpleadosTest() {
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

    //test amb venedor primer if
    @Test
    public void testCalcularSalarioBruto() throws Exception {
        System.out.println("calcularSalarioBruto primer if venedor");
        TipoEmpleat e = new Vendedor(0, 0);
        float expResult = 1000;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }

    //test amb venedor primer i segon if
    @Test
    public void testCalcularSalarioBruto2() throws Exception {
        System.out.println("calcularSalarioBruto primer i segon if venedor");
        TipoEmpleat e = new Vendedor(1000, 0);
        float expResult = 1100.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }
    
    //test amb venedor primer i segon if
    @Test
    public void testCalcularSalarioBruto21() throws Exception {
        System.out.println("calcularSalarioBruto primer i segon if venedor(segona opcio)");
        TipoEmpleat e = new Vendedor(1500, 0);
        float expResult = 1200.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }
    
    //test amb venedor complet
    @Test
    public void testCalcularSalarioBruto3() throws Exception {
        System.out.println("calcularSalarioBruto primer i segon if venedor");
        TipoEmpleat e = new Vendedor(1000, 10);
        float expResult = 1300.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }
    
    //test amb Encaragat primer if
    @Test
    public void testCalcularSalarioBruto4() throws Exception {
        System.out.println("calcularSalarioBruto primer if Encaragat");
        TipoEmpleat e = new Encargado(0, 0);
        float expResult = 1500;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }

    //test amb Encaragat primer i segon if
    @Test
    public void testCalcularSalarioBruto5() throws Exception {
        System.out.println("calcularSalarioBruto primer i segon if Encaragat");
        TipoEmpleat e = new Encargado(1000, 0);
        float expResult = 1600.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }
    
    //test amb Encaragat primer i segon if
    @Test
    public void testCalcularSalarioBruto55() throws Exception {
        System.out.println("calcularSalarioBruto primer i segon if Encaragat(Segona opcio)");
        TipoEmpleat e = new Encargado(1500, 0);
        float expResult = 1700.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }
    
    //test amb Encaragat complet
    @Test
    public void testCalcularSalarioBruto6() throws Exception {
        System.out.println("calcularSalarioBruto primer i segon if Encaragat");
        TipoEmpleat e = new Encargado(1000, 10);
        float expResult = 1800.0F;
        float result = AdministrarEmpleados.calcularSalarioBruto(e);
        assertEquals(expResult, result, 0.0);
    }

    // primer if
    @Test
    public void testCalcularSalariNet() throws BerException {
        System.out.println("calcularSalariNet primer if");
        TipoEmpleat e = new Encargado(0,0);
        e.setSalarioBruto(1500);
        float expResult = 1230.0F;
        float result = AdministrarEmpleados.calcularSalariNet(e);
        assertEquals(expResult, result, 0.0);
    }
    
    // segon if
    @Test
    public void testCalcularSalariNet2() throws BerException {
        System.out.println("calcularSalariNet primer if");
        TipoEmpleat e = new Encargado(0,0);
        e.setSalarioBruto(1000);
        float expResult = 840.0F;
        float result = AdministrarEmpleados.calcularSalariNet(e);
        assertEquals(expResult, result, 0.0);
    }
    
    // cap if
    @Test
    public void testCalcularSalariNet3() throws BerException {
        System.out.println("calcularSalariNet primer if");
        TipoEmpleat e = new Encargado(0,0);
        e.setSalarioBruto(500);
        float expResult = 500.0F;
        float result = AdministrarEmpleados.calcularSalariNet(e);
        assertEquals(expResult, result, 0.0);
    }
    
}
