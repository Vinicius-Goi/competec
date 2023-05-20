import java.util.Scanner;
public class Aula2{
    public static void main(String[] args) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Scanner ler = new Scanner(System.in);
        /*
        int soma = 0;
        int i = 1;

        while(i < 101){
            soma += i;
            System.out.println("Soma atual: "+soma);
            i++;
        }
        */
        int senha = 0;
        System.out.print("Digite uma senha: ");
        senha = ler.nextInt();
        while (senha != 61976){
            System.out.println("Senha Invalida!");
            System.out.println("-=-=-=-=-=--=-=-=-");
            System.out.print("Digite uma senha: ");
            senha = ler.nextInt();
        }
        System.out.println("Acesso Permitido!");
    }
}