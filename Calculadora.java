package CalculadoraSimples;
import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Numeros cal = new Numeros();
        
        System.out.print("Digite o primeiro valor: ");
        double n1 = input.nextDouble();
        System.out.print("[1] Adição [2] Subtração [3] Multiplicação [4] Divisão: ");
        int operacao = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        double n2 = input.nextDouble();
        switch (operacao){
            case 1:
                cal.setNumeros(n1, n2);
                System.out.println("A soma é " + cal.Soma());
                break;
            case 2:
                cal.setNumeros(n1, n2);
                System.out.println("A subtração é " + cal.Subtração());
                break;
            case 3:
                cal.setNumeros(n1, n2);
                System.out.println("A multiplicação é " + cal.Multiplicação());
                break;
            case 4:
                cal.setNumeros(n1, n2);
                System.out.println("A divisão é " + cal.Divisão());
                break;
            default:
                System.out.println("Operação Invalida");
        }
    }
}