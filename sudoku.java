package sudokuu;

import java.util.Random;

public class sd {
	public static void Trocas(int[][] Prob) {
	int I, J, NT;
	Random T = new Random();
	for (int K = 1; K <= 3; K++) {
	I = T.nextInt(9);
	NT = (I + 1) % 3 + 3 * (int) Math.rint(I / 3);
	TrocaLinCol(Prob, I, NT, "Linhas");
	}
	for (int K = 1; K <= 3; K++) {
	J = T.nextInt(9);
	NT = (J + 1) % 3 + 3 * (int) Math.rint(J / 3);
	TrocaLinCol(Prob, J, NT, "Colunas");
	}
	}

	public static void TrocaLinCol(int[][] Prob, int X, int NT, String OP) {
	int Temp;
	if (OP.compareTo("Linhas") == 0)
	for (int J = 0; J <= Prob.length - 1; J++) {
	Temp = Prob[X][J];
	Prob[X][J] = Prob[NT][J];
	Prob[NT][J] = Temp;
	}
	else
	for (int I = 0; I <= Prob.length - 1; I++) {
	Temp = Prob[I][X];
	Prob[I][X] = Prob[I][NT];
	Prob[I][NT] = Temp;
	}
	}

	public static void CriarSolucao(int[][] Prob, int[][] Sol) {
	for (int I = 0; I <= 3 * 3 - 1; I++)
	for (int J = 0; J <= 3 * 3 - 1; J++)
	Sol[I][J] = Prob[I][J];
	}

	public static void CriarProblema(int[][] Prob, int Kt) {
	Random T = new Random();
	int K = 0, Ki, Kj;
	while (K < Kt) {
	Ki = T.nextInt(9);
	Kj = T.nextInt(9);
	if (Prob[Ki][Kj] != 0) {
	Prob[Ki][Kj] = 0;
	K++;
	}
	}
	}

	public static void EscreverMatriz(String Tit, int[][] X) {
	final String S = "---------";
	final String SeparaLin = String.format("|%1$s|%1$s|%1$s|\n", S);
	System.out.printf("%s\n", Tit);
	for (int I = 0; I <= 3 * 3 - 1; I++) {
	if (I % 3 == 0)
	System.out.print(SeparaLin);
	for (int J = 0; J <= 3 * 3 - 1; J++) {
	if (J % 3 == 0)
	System.out.print("|");
	if (X[I][J] != 0)
	System.out.printf("%3d", X[I][J]);
	else
	System.out.printf("%3c", ' ');
	}
	System.out.print("|\n");
	}
	System.out.print(SeparaLin);
	}

	public static void main(String[] args) {
	final int N = 3;
	int[][] Prob = new int[9][9];
	int[][] Sol = new int[9][9];
	int N2 = (int) Math.pow(N, 2);
	int Ver = 32;
	for (int I = 0; I <= N * N - 1; I++)
	for (int J = 0; J <= N * N - 1; J++)
	Prob[I][J] = (I * N + I / N + J) % N2 + 1;
	Trocas(Prob);
	CriarSolucao(Prob, Sol);
	CriarProblema(Prob, N2 * N2 - Ver);
	EscreverMatriz("Problema", Prob);
	EscreverMatriz("Solução", Sol);
	}
}
