/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_java_5_eduardo.amorim;

/**
 *
 * @author Aluno
 */
public class Atividade_java_5_eduardoAmorim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada = new Scanner (System.in);
        
        // Questao 1
        
        int num,cont;
        
        System.out.print("Digite um numero: ");
        num = entrada.nextInt();
        cont = 0;        
        while (cont < num) {
        cont++;
        System.out.print(cont+"\n");}
        
        // Questao 2
        
        int soma,num;
        num = 0;
        soma = 0;
        while (num != -1) {
        System.out.println("-1 para sair.\nDigite um numero: ");
        num = entrada.nextInt();
        if (num != -1) {
        soma = soma + num;}
        }
        System.out.println("Soma: "+soma);

        // Questao 3
        
        String chute,senha;
        senha = "Java123";
        System.out.print("Digite a senha: ");
        chute = entrada.nextLine();
        while (!chute.equals(senha)) {
        System.out.println("Senha incorreta\nTente novamente");
        System.out.print("Digite a senha: ");
        chute = entrada.nextLine();}
        System.out.println("Acesso permitido");

        // Questao 4
        
        int opcao = 1,num1,num2,soma,subt,mult;
        while (opcao != 0) {
        System.out.println("Menu \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n0 - Sair");
        System.out.print("Digite a opcao desejada: ");
        opcao = entrada.nextInt();
        switch (opcao){
        case 1: System.out.print("Digite um numero: ");
       num1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
       num2 = entrada.nextInt();
        soma = num1 + num2;
        System.out.println("Soma: "+soma);
        break;
        case 2: System.out.print("Digite um numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = entrada.nextInt();
        subt = num1 - num2;
        System.out.println("Subtracao: "+subt);
        break;
        case 3: System.out.print("Digite um numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = entrada.nextInt();
        mult = num1 * num2;
        System.out.println("Multiplicacao: "+mult);
        break;
        case 0: System.out.println("Saindo...");
        break;}}

        // Questao 5
        
        int num,fatorial;
        System.out.print("Digite um numero, para fazer o fatorial: ");
        num = entrada.nextInt();
        fatorial = 1;
        while (num > 1) {
        fatorial = fatorial * num;
        num--;}
        System.out.println("Fatorial: "+fatorial);

        // Questao 6
        
        int num1,num2,contador,quantidade,proximo;
        System.out.print("Digite quantos numeros deseja ver da sequancia Fibonacci: ");
        quantidade = entrada.nextInt();
        num1= 0;
        num2= 1;
        contador= 0;
        System.out.println("Sequencia Fibonacci: ");
        while (contador < quantidade){
            System.out.println(num1 +"");
            proximo = num1 + num2;
            num1= num2;
            num2= proximo;
            
            contador++;          
        }
               
        
        //Questao 7
        
        int num,i;
        
        System.out.print("Digite um numero maior ou igual a 2: ");
        num= entrada.nextInt();
        while (num < 2){
        System.out.print("Erro!! Digite um numero maior ou igual a 2: ");
        num = entrada.nextInt();
        }
        
        if (num == 2 ){
        System.out.print(num+" e um numero primo");
        }else if (num % 2 == 0){
        System.out.print(num+" nao e um numero primo (divisivel por 2)");}
        else {
            for (i = 3;i * i <= num; i +=2){
            if (num % i == 0 ){
                break;
            }
           }
            
           if  (i *i > num){
               System.out.println(num+" numero primo");
           }else {
           System.out.println(num+" nao e um numero primo");}
       } 
            
        
        


        //Questao 8
        

        int num, soma = 0;
        int contador = 1;

        while (contador <= 10) {
            System.out.print("Digite o número " + contador + ": ");
            num = entrada.nextInt();

            if (num < 1) {
                System.out.println("Erro!! Digite um número maior que 1");
                continue; 
            }

            soma += num;
            contador++; 
        }

        System.out.println("O valor da soma dos números foi: " + soma);

           //Questao 9
           int num,i,soma;
           i = 1;
           soma = 0;
           while (i < 6){
           System.out.print("Diite "+i+" numero: ");
           num = entrada.nextInt();
           soma += num;
           num = i++;
           }
           
           System.out.println("A quantidade de numeros digitados foi de: "+i);
           System.out.println("A soma dos numeros e: "+soma);
           
        
            //Questao 10
            
            int num;
            System.out.print("Digite um numero positivo: ");
            num = entrada.nextInt();
            if (num <= 0) {
            System.out.print("Digite um número positivo.");
            num = entrada.nextInt();}
            while (num != 1) {
           
           if (num % 2 == 0) {
            num = num / 2;
            System.out.println(num + " Par: " + num + " / 2 = ");}
            else {
            num = 3 * num + 1;
            System.out.println(num + " Impar: 3 * " + num + " + 1 = ");}
            }
            System.out.println(num);
            

    }
    
}

    
    

