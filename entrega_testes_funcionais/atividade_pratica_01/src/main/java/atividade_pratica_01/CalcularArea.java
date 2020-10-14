package atividade_pratica_01;

import java.util.Scanner;
import org.apache.commons.math3.util.FastMath;

public class CalcularArea {
    public int calculoQuadrado(int base, int altura){
        if (base < 1 || base > 99 & altura < 1 || altura > 99){
            return 0;
        }
        else {
            return Math.multiplyExact(base, altura);
        }
    }
    public int calculoCubico(int lado1, int lado2, int lado3){
        if (lado1 < 1 || lado1 > 99 & lado2 < 1 || lado2 > 99 & lado3 < 1 || lado3 > 99){
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
        while (opc == 0 || opc > 3){
            System.out.println("Selecione operacoes disponiveis.");
            opc = input.nextInt();
        }
        switch (opc){
            case 1:
                Scanner input1 = new Scanner(System.in);    
                System.out.println("Qual o valor da Base: ");  
                base = input1.nextInt();
                while(base <= 0 || base > 99){
                    System.out.println("Valor invalido, selecione valores entre 1 a 99. Qual o valor da Base: ");  
                    base = input1.nextInt();
                } 
                System.out.println("Qual o valor da Altura: ");  
                altura = input1.nextInt();
                while(altura <= 0 || altura > 99){
                    System.out.println("Valor invalido, selecione valores entre 1 a 99. Qual o valor da Altura: ");  
                    altura = input1.nextInt();
                }
                    int operacao = calc.calculoQuadrado(base, altura);
                    System.out.printf("Area de %d unidade de medida\n", operacao);
                break;
            case 2:
                Scanner input2 = new Scanner(System.in);    
                
                    System.out.println("Qual o valor do Lado 1: ");
                    lado1 = input2.nextInt();  
                    while(lado1 <= 0 || lado1 > 99){
                        System.out.println("Valor invalido, selecione valores entre 1 a 99. Qual o valor do Lado 1: ");  
                        altura = input2.nextInt();
                    }
                    System.out.println("Qual o valor da Lado 2: ");  
                    lado2 = input2.nextInt();
                    while(lado2 <= 0 || lado2 > 99){
                        System.out.println("Valor invalido, selecione valores entre 1 a 99. Qual o valor do Lado 2: ");  
                        altura = input2.nextInt();
                    }
                    System.out.println("Qual o valor do Lado 3: ");  
                    lado3 = input2.nextInt();
                    while(lado3 <= 0 || lado3 > 99){
                        System.out.println("Valor invalido, selecione valores entre 1 a 99. Qual o valor d0 Lado 3: ");  
                        altura = input2.nextInt();
                    }
                    
                    break;    
            case 3:
                System.out.println("Ate Logo!");
                break;
        }
    }
}
