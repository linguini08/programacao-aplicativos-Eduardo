/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_java_7_eduardo.amorim;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade_java_7_eduardoAmorim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // QUESTAO 1
        
        Scanner entrada = new Scanner(System.in);  

        System.out.print(" Digite um número N: ");
        int N = entrada.nextInt();                 

        int contadorr = 1;                          

        while (contadorr <= N) {                    
            System.out.println(contadorr);          
            contadorr++;
        }
       
        // QUESTAO 2 
        
        int numero = 0;
        int soma = 0;
        int contador = 0;
        
        System.out.println(" digite somente numeros inteiros: ");
        
        while (numero != -1) {
            numero = entrada.nextInt();
            
            if (numero != -1) {
                soma += numero;
                contador++;
                
        System.out.println("Soma dos números: " + soma);
        System.out.println("Quantidade de valores lidos: " + contador);
 
            }
        
        }
     
        // QUESTAO 3 
        
        String senha = " ";
        while (!senha.equals("Java123")) {
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();
            if (!senha.equals("Java123")) {
                System.out.println("Senha incorreta!");
                
        System.out.println("Acesso permitido.");
        
            }
        }  
        
        // QUESTAO 4 
        
        int opcao;
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            if (opcao != 0) {
                System.out.print("Digite o primeiro número: ");
                int a = entrada.nextInt();
                System.out.print("Digite o segundo número: ");
                int b = entrada.nextInt();
                
             

                if (opcao == 1) System.out.println("Resultado: " + (a + b));
                else if (opcao == 2) System.out.println("Resultado: " + (a - b));
                else if (opcao == 3) System.out.println("Resultado: " + (a * b));
                else System.out.println("Opção inválida.");
                
               
    
            }
        } while (opcao != 0);
        
        // QUESTAO 5 
        
         System.out.print("Digite um número inteiro >= 0: ");
        int n = entrada.nextInt();
        int i = 1;
        long fatorial = 1;
        while (i <= n) {
            fatorial *= i;
            i++;
            
        System.out.println(n + "! = " + fatorial);
        
        }
        
        //QUESTAO 6 
        
        System.out.print("Digite um número N (>=0): ");
        int nn = entrada.nextInt();
        int aa = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + aa);
        while (b <= nn) {
            System.out.print(", " + b);
            int proximo = aa + b;
            aa = b;
            b = proximo;
        }
        System.out.println();
        
        //QUESTAO 7
        
        System.out.print("Digite um número >= 2: ");
        int nnn = entrada.nextInt();
        int ii = 2; 
        boolean primo = true;
        while (ii * ii <= nnn) {
            if (nnn % ii == 0) {
                primo = false;
                break;
            }
            i++;
        }
        if (primo) System.out.println(n + " é primo.");
        else System.out.println(n + " não é primo.");
        
        // questao 8 
        
        int somaa = 0, numeroo;
        System.out.println("Digite números (negativo para parar):");
        numeroo = entrada.nextInt();
        while (numeroo >= 0) {
            somaa += numeroo;
            numeroo = entrada.nextInt();
        }
        System.out.println("Soma final: " + soma);
        
        // QUESTAO 9 
        
        System.out.print("Digite um número inteiro: ");
        int q = entrada.nextInt();
        int num = Math.abs(q);
        int som = 0, reverso = 0, qtdDigitos = 0;
        while (num > 0) {
            int digito = num % 10;
            som += digito;
            reverso = reverso * 10 + digito;
            num /= 10;
            qtdDigitos++;
        }
        System.out.println("Número de dígitos: " + qtdDigitos);
        System.out.println("Soma dos dígitos: " + soma);
        System.out.println("Reverso: " + reverso);
        
        // QUESTAO 10
        
        System.out.print("Digite um número inteiro >= 0: ");
        int u = entrada.nextInt();
        while (u != 1) {
            System.out.print(u + " ");
            if (u % 2 == 0) u = u / 2;
            else u = 3 * u + 1;
        }
        System.out.println("1");
    }
    
}
    
    

