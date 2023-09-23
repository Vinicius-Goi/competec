import java.util.Scanner;
public class VelhaComVelhas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int jogo [] [] = new int[3][3];
        System.out.println("Digite um possível jogo da velha: ");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                jogo[i][j] = scn.nextInt();
                
            }
        }
        if (jogo[0][0] == 1 && jogo[1][1] == 1 && jogo[2][2] == 1 || jogo[0][0] == 1 && jogo[0][1] == 1 && jogo[0][2] == 1 || jogo[1][0] == 1 && jogo[1][1] == 1 && jogo[1][2] == 1 || jogo[2][0] == 1 && jogo[2][1] == 1 && jogo[2][2] == 1 || jogo[0][0] == 1 && jogo[1][0] == 1 && jogo[2][0] == 1 || jogo[0][1] == 1 && jogo[1][1] == 1 && jogo[2][1] == 1 || jogo[0][2] == 1 && jogo[1][2] == 1 && jogo[2][2] == 1){

        }
        else if (jogo[0][0] == 0 && jogo[1][1] == 0 && jogo[2][2] == 0 || jogo[0][0] == 0 && jogo[0][1] == 0 && jogo[0][2] == 0 || jogo[1][0] == 0 && jogo[1][1] == 0 && jogo[1][2] == 0 || jogo[2][0] == 0 && jogo[2][1] == 0 && jogo[2][2] == 0 || jogo[0][0] == 0 && jogo[1][0] == 0 && jogo[2][0] == 0 || jogo[0][1] == 0 && jogo[1][1] == 0 && jogo[2][1] == 0 || jogo[0][2] == 0 && jogo[1][2] == 0 && jogo[2][2] == 0) {

        }
        else {

        }

    }
}
