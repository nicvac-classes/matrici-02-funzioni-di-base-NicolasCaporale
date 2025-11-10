//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice( int[][] M, int nR, int nC, int v ) {
        for (int i=0; i <= nR-1; i=i+1 ) {
            for (int j=0; j <= nC-1; j=j+1) {
                M[i][j] = v;
            }
        }
    }

    public static void azzeraMatrice( int[][] M, int nR, int nC) {
        assegnaMatrice(M, nR, nC, 0);
    }

    public static void riempiCasuale( int[][] M, int nR, int nC, int vM, int vMax) {
        Random rand = new Random();
        for (int i=0; i <= nR-1; i=i+1 ) {
            for (int j=0; j <= nC-1; j=j+1) {
                M[i][j] = vM + rand.nextInt((vMax+1)-vM);
            }
        }
    }

    public static void main(String args[]) {
        int nR = 3;
        int nC = 5;
        int v;
        int[][] mat1 = new int[nR][nC];
        System.out.println("Ins v");
        v = Integer.parseInt(in.nextLine());
        assegnaMatrice(mat1, nR, nC, v);
        UtilsMatrice.visualizza(mat1);

        int[][] mat2 = new int[nR][nC];
        azzeraMatrice(mat2, nR, nC);
        UtilsMatrice.visualizza(mat2);

        int[][] mat3 = new int[nR][nC];
        int vM = 25;
        int vMax = nR*nC+vM;
        riempiCasuale(mat3, nR, nC, vM, vMax);
        UtilsMatrice.visualizza(mat3);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md