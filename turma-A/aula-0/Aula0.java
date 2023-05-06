import java.util.Scanner;
public class Aula0{
    public static void main(String[] args){
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
         
        Scanner ler = new Scanner(System.in);
        /*double precouva, precolaranja; 
        System.out.print("Informe o preço da laranja: R$");
        precolaranja = ler.nextDouble(); 
        System.out.print("Informe o preço da uva: R$");
        precouva = ler.nextDouble();

        double total = precolaranja + precouva; 
        System.out.printf("Total: R$%,.2f \n",total);*/

        //System.out.println("Teste");

        /*int idade = 16;
        String nome = "Goi";

        System.out.println("Olá "+ nome +"! Seja bem vindo a COMPETEC!");
        System.out.println("Você tem "+idade);
        boolean cafe = true;
        System.out.println("Tomou café? "+ cafe);*/

        /*String apresentacao = "Nome: Vinícius Goi Sanchez";
        String idade = "Idade: 16 anos";
        System.out.print(apresentacao + " / " + idade);*/

        /*char[] nome = {'G', 'o', 'i'};
        System.out.println(nome);*/

        /*int n1 = 14;
        int n2 = 20;
        int soma = n1 + n2;
        long somar = 989283928 + 9230920;
        System.out.println(soma);*/
        //System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        /*System.out.println(somar);*/

        /*double laranja = 9.8;
        double uva = 5.5;

        laranja++;
        uva += laranja;


        //double somar = laranja + uva;
        System.out.printf("Total: R$%,.2f ",uva);*/

        /* 
        //String:
        String nome1, nome2;

        System.out.print("Digite um nome: ");
        nome1 = ler.nextLine();

        System.out.print("Digite outro nome: ");
        nome2 = ler.nextLine();

        System.out.printf("%s e %s \n", nome1, nome2);
        */

        /*
        //Double:
        double v1, v2;
        
        System.out.print("Digite o valor: ");
        v1 = ler.nextDouble();

        System.out.print("Digite outro valor: ");
        v2 = ler.nextDouble();

        double somar = v1+v2;

        System.out.printf("A soma entre %,.2f e %,.2f é igual à: %,.2f \n",v1,v2,somar);
        */

        /*
        //float
        float v1, v2;
        
        System.out.print("Digite o valor: ");
        v1 = ler.nextFloat();

        System.out.print("Digite outro valor: ");
        v2 = ler.nextFloat();

        float somar = v1+v2;

        System.out.printf("A soma entre %,.2f e %,.2f é igual à: %,.2f \n",v1,v2,somar);
        */

        //Exercicio
        String nome;
        int idade;

        System.out.print("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.printf("Nome: %s \nIdade: %d\n", nome, idade);


        ler.close();
    }
} 