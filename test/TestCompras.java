/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exemplotestejunit.Calculo;
import exemplotestejunit.CompraModel;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author leonaardo vieia barfkldfkasjfkasl as
 * adslkfjaslkfjas
 * 
 */
public class TestCompras extends TestCase {
    
    public TestCompras() {
    }

@Test
    public void teste() {
        CompraModel compraDesc10 = new CompraModel();
        CompraModel compraDesc1 = new CompraModel();
        Calculo calc = new Calculo();
        System.out.println("Leonado");

        compraDesc10.setValor(1000);
        compraDesc10.setIdade(80);
        compraDesc10.setDesconto(calc.calcularDesconto(compraDesc10.getValor(), compraDesc10.getIdade()));
        compraDesc10.setTotal(calc.calculartotal(compraDesc10.getValor(), compraDesc10.getDesconto()));
        
        compraDesc1.setValor(1000);
        compraDesc1.setIdade(20);
        compraDesc1.setDesconto(calc.calcularDesconto(compraDesc1.getValor(), compraDesc1.getIdade()));
        compraDesc1.setTotal(calc.calculartotal(compraDesc1.getValor(), compraDesc1.getDesconto()));

        Assert.assertEquals(900, compraDesc10.getTotal());
        Assert.assertEquals(990, compraDesc1.getTotal());
       
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
