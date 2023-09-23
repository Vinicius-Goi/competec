import java.util.Scanner;
public class Aula_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a primeira sequência de número: ");
        String num1 = ler.nextLine();

        System.out.print("Digite a outra sequência de número: ");
        String num2 = ler.nextLine();

        if (num1.length() >= 1000 && num2.length() >= 1000){
            System.out.println("O MALUCO N PODE N CARAI");
        }
        else {
            if (){
                System.out.println("Encaixa");
            }
            else{
                System.out.println("Não encaixa");
            }
        }
    }
}