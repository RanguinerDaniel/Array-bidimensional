import java.util.*;
import java.util.Locale;

public class App {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero de linhas de sua matriz: ");
        int linha = sc.nextInt();

        System.out.print("Informe o numero de colunas de sua matriz: ");
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random rnd = new Random();
                int value = rnd.nextInt(50);
                matriz[i][j] = value;
            }
        }
        System.out.println("Produto da matriz ");
        for(int i=0; i < matriz.length; i++){
            for(int j = 0; j < matriz[j].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}

