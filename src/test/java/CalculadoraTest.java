/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Paquetes.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/** Pruebas unitarias
 *
 * @author envergador
 */
public class CalculadoraTest {
    
    @Test
    public void CalculadoraTest1() {
        
        Calculadora n=new Calculadora("3 4 5 * +");
        n.ingresarOperacion();
        n.verificarOperaciones();
        n.setResultado();
        String esperado= "23.0";
        String resultado=n.getResultado();        
        assertEquals(esperado,resultado);
    }
    @Test
    public void CalculadoraTest2() {
        
        Calculadora n=new Calculadora("3 4 5 + +");
        n.ingresarOperacion();
        n.verificarOperaciones();
        n.setResultado();
        String esperado= "12.0";
        String resultado=n.getResultado();        
        assertEquals(esperado,resultado);
    }
}
