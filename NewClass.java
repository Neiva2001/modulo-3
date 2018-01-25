
package modulo3;

import java.util.Scanner;

public class modulo3 {

    static int Maiorde3(int X, int Y, int Z) {
        if (X < Y) {
            X = Y;
        }
        if (X < Z) {
            X = Z;
        }
        return X;
    }

    public static void main(String[] args) {
        {
            int X, Y, Z;
            Scanner LerS = new Scanner(System.in);
            System.out.print("Digite o 1º valor (X)");
            X = LerS.nextInt();
            System.out.print("Digite o 2º valor (Y)");
            Y = LerS.nextInt();
            System.out.print("Digite o 3º valor (Z)");
            Z = LerS.nextInt();
            System.out.println("Maior = " + Maiorde3(X, Y, Z));
        }

    }

}{
 
}   
