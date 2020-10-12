package atividade_pratica_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcularAreaTeste {
    @Test //calcula a area quadrada
    public void calculoQuadrado() throws Exception {
        int base = 30;
        int altura = 10;
        int calculo = 0;

        assertEquals(300, calculo);
    }

    @Test //calcula a area quadrada
    public void calculoQuadrado2() throws Exception {
        int base = -30; // < 0
        int altura = 10;
        int calculo = 0;

        assertEquals(300, calculo);
    }

    @Test //calcula a area quadrada
    public void calculoQuadrado3() throws Exception {
        int base = 30;
        int altura = 100; // > 99
        int calculo = 0;

        assertEquals(300, calculo);
    }
    
    @Test //calcula a area cubica
    public void calculoCubico() throws Exception{
        int lado1 = 20;
        int lado2 = 10;
        int lado3 = 5;
        int calculo = 0;

        assertEquals(1000, calculo);
    }
 }
