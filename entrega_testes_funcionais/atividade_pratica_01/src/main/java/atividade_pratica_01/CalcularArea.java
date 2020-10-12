package atividade_pratica_01;

import java.util.Scanner;
import org.apache.commons.math3.*;

public class CalcularArea {
    public int calculoQuadrado(int base, int altura){
        if (base < 0 || base > 99 & altura < 0 || altura > 99){
            return 0;
        }
        else {
            return Math.multiplyExact(base, altura);
        }
    }
    public int calculoCubico(int lado1, int lado2, int lado3){
        if (lado1 < 0 || lado1 > 99 & lado2 < 0 || lado2 > 99 & lado3 < 0 || lado3 > 99){
            return 0;
        }
        else {
            return lado1 * lado2 * lado3;
        }
    }

    public static void main(String args[]) throws Exception {
        CalcularArea calc = new CalcularArea();

        int opc;
        int base, altura;
        int lado1, lado2, lado3;

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha a operação a ser realizada");
        System.out.println("1. Calcular Area Quadrada");
        System.out.println("2. Calcular Area Cubica");
        System.out.println("3. Sair");
        System.out.println("Operação: ");

        opc = input.nextInt();  
        if (opc == 1) {
            Scanner input1 = new Scanner(System.in);    
			
			System.out.println("Qual o valor da Base: ");  
			base = input1.nextInt();  
			System.out.println("Qual o valor da Altura: ");  
            altura = input1.nextInt();
            if(base == 0 || altura == 0){
                System.out.println("Nenhum valor pode ser igual a 0, Refaça a operação.");  
            }
            else{
                int operacao = calc.calculoQuadrado(base, altura);
                System.out.printf("Area de %d unidade de medida\n", operacao);
            }
        }

        else if(opc ==  2){
            Scanner input1 = new Scanner(System.in);    
			
			System.out.println("Qual o valor do Lado 1: ");  
			lado1 = input1.nextInt();  
			System.out.println("Qual o valor da Lado 2: ");  
            lado2 = input1.nextInt();
            System.out.println("Qual o valor do Lado 3: ");  
            lado3 = input1.nextInt();
            if(lado1 == 0 || lado2 == 0 || lado3 == 0){
                System.out.println("Nenhum valor pode ser igual a 0, Refaça a operação.");  
            }
            else{
            int operacao = calc.calculoCubico(lado1, lado2, lado3);
            System.out.printf("Area de %d unidade de medida\n", operacao);
            }
        }
        else if(opc == 3){
            System.out.printf("Ate logo!\n");
        }
    }
}