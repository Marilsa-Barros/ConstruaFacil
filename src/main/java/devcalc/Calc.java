// 1 - Pacote
package devcalc;
// 2 - Biblioteca

import java.sql.SQLOutput;
import java.util.Scanner;

// 3 - Classe
public class Calc {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // entrada = input

    // 3.1 - Métodos e funções
    public static void main(String[] args) {
        // Exibe o menu da calculadora
        System.out.println(">>> Calculadora <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("Escolha o Calculo Desejado: ");

        // Recebe  a opção desejada
        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

        //Pergunta os valores a serem usados no calculo
        if (opcao >= 1 && opcao <= 4) {
            System.out.print("Entre o 1º número: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o 2º número: ");
            num2 = entrada.nextInt();
            System.out.print("O resultado é: ");
        }

        // Chama a função do calculo desejado
        switch (opcao) {
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;
            case 2:
                System.out.println(subtrairDoisNumeros(num1, num2));
                break;
            case 3:
                System.out.println(multiplicarDoisNumeros(num1, num2));
                break;
            case 4:
                System.out.println(dividirDoisNumeros(num1, num2));
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }


    }

    public static int somarDoisNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrairDoisNumeros(int num1, int num2) {
        return num1 - num2;

    }
    public static int multiplicarDoisNumeros(int num1, int num2) {
        return num1 * num2;

    }
    public static int dividirDoisNumeros(int num1, int num2) {
        return num1 / num2;

    }

}
