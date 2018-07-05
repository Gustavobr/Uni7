/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Maven.UNI7;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavoscipiao
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        double a = 2;
        double b = 2;
        Calculadora calc = new Calculadora();
        double expresul = 4;
        double resultado = calc.somar(a, b);
        assertEquals(4, 4, 4);

    }

    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        double a = 5;
        double b = 3;
        Calculadora instance = new Calculadora();
        double expResult = 2;
        double result = instance.subtrair(a, b);
        assertEquals(2, 2, 2);
    }
}
/*
    
    @Test
        public void testMultiplicar(){
               double a = 10;
               double b = 10;
               Calculadora calc = new Calculadora();
               double expResult = 100;
               double resultado = (calc.multiplicar(a, b));
               assertEquals(expResult, resultado, 100);
        }
}

 */
