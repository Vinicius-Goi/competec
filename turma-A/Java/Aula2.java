import java.util.Scanner;
public class Aula2{
    public static void main(String[] args) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Scanner ler = new Scanner(System.in);

        class ConsoleColors {
            // Reset
            public static final String RESET = "\033[0m";  // Text Reset
        
            // Regular Colors
            public static final String BLACK = "\033[0;30m";   // BLACK
            public static final String RED = "\033[0;31m";     // RED
            public static final String GREEN = "\033[0;32m";   // GREEN
            public static final String YELLOW = "\033[0;33m";  // YELLOW
            public static final String BLUE = "\033[0;34m";    // BLUE
            public static final String PURPLE = "\033[0;35m";  // PURPLE
            public static final String CYAN = "\033[0;36m";    // CYAN
            public static final String WHITE = "\033[0;37m";   // WHITE
        
            // Bold
            public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
            public static final String RED_BOLD = "\033[1;31m";    // RED
            public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
            public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
            public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
            public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
            public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
            public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
        
            // Underline
            public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
            public static final String RED_UNDERLINED = "\033[4;31m";    // RED
            public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
            public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
            public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
            public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
            public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
            public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE
        }

        /*
        int soma = 0;
        int i = 1;

        while(i < 101){
            soma += i;
            System.out.println("Soma atual: "+soma);
            i++;
        }
        */

        //==========================================================================

        /*
        int senha = 0;
        
        System.out.print("Digite uma senha: ");
        senha = ler.nextInt();

        while (senha != 61976){
            System.out.println("Senha "+ConsoleColors.RED+"Invalida"+ConsoleColors.RESET+"!");
            System.out.println("-=-=-=-=-=--=-=-=-");
            System.out.print("Digite uma senha: ");
            senha = ler.nextInt();
        }

        System.out.println("Acesso "+ConsoleColors.GREEN+"Permitido"+ConsoleColors.RESET+"!");
        */
    
        //==========================================================================
        
        /*
        System.out.print("Digite um número: ");
        int num = ler.nextInt();


        for (int i=1; i<11; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        */

        //==========================================================================

        /*
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        int i;
        for (i=0;i <= num; i++){
            if (i % 2 == 1) System.out.print(i" ");
        }
        */
}
}
