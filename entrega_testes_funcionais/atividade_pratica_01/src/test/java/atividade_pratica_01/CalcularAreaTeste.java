package atividade_pratica_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcularAreaTeste {
    @Test //calcula a area quadrada
    public void calculoQuadrado() throws Exception {
        CalcularArea calculo = new CalcularArea();
        int base = 30;
        int altura = 10;
        int calculoQuadrado = calculo.calculoQuadrado(base, altura);

        assertEquals(300, calculoQuadrado);
    }

    @Test //calcula a area quadrada
    public void calculoQuadrado2() throws Exception {
        CalcularArea calculo = new CalcularArea();
        int base = -30;
        int altura = 10;
        int calculoQuadrado = calculo.calculoQuadrado(base, altura);

        assertEquals(0, calculoQuadrado);
    }

    @Test //calcula a area quadrada
    public void calculoQuadrado3() throws Exception {
        CalcularArea calculo = new CalcularArea();
        int base = 30;
        int altura = 100;
        int calculoQuadrado = calculo.calculoQuadrado(base, altura);

        assertEquals(0, calculoQuadrado);
    }
    
    @Test //calcula a area cubica
    public void calculoCubico() throws Exception{
        CalcularArea calculo = new CalcularArea();
        int lado1 = 20;
        int lado2 = 10;
        int lado3 = 5;
        int calculoCubico = calculo.calculoCubico(lado1, lado2, lado3);

        assertEquals(1000, calculoCubico);
    }
 }
