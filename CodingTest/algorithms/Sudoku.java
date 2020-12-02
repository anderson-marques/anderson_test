

public class Sudoku {

	/*
	Problem: Sudoku solver

	Given this sudoku, write a program that would solve it.

	    grid = [
	        [8,0,0,0,0,0,0,0,0],
	        [0,0,3,6,0,0,0,0,0],
	        [0,7,0,0,9,0,2,0,0],
	        [0,5,0,0,0,7,0,0,0],
	        [0,0,0,0,4,5,7,0,0],
	        [0,0,0,1,0,0,0,3,0],
	        [0,0,1,0,0,0,0,6,8],
	        [0,0,8,5,0,0,0,1,0],
	        [0,9,0,0,0,0,4,0,0]]

	The rules of the game are simple, each of the nine boxes has to contain all the numbers from 1 to 9 within its squares.
	Each number can only appear once in a row, column or box.
	*/

	public static void main(String[] args) {
		 int[][] grid =  {
				{8,0,0,0,0,0,0,0,0},
				{0,0,3,6,0,0,0,0,0},
				{0,7,0,0,9,0,2,0,0},
				{0,5,0,0,0,7,0,0,0},
				{0,0,0,0,4,5,7,0,0},
				{0,0,0,1,0,0,0,3,0},
				{0,0,1,0,0,0,0,6,8},
				{0,0,8,5,0,0,0,1,0},
				{0,9,0,0,0,0,4,0,0}};

		 solve(grid);
	}

	public static void solve(int[][] grid) {
		for (int j = 0; j < 9; i++) {
			// Test if given
			int current = grid[i][j];
			boolean isGiven = current > 0

			if (!isGive) {
				// Varer a linha
				for (int i = 0; i < 9; i++) {
					// get lista de alternativas (a)
				}

				// Percorrer a coluna removendo items da lista de alternativas de (b)
				for (int i = 0; i < 9; i++) {
					// Gerar lista de alternativas final
				}

				// Se lista de alternativas tamanho = 1 >> Achamos a solucao

				// Posso criar um novo grid e comecar novamente para evitar processar ate o final

			}
		}


		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; i++) {
				// Test if given
				int current = grid[i][j];
				boolean isGiven = current > 0

				if (!isGive) {
					// Varer a linha
					for (int i = 0; i < 9; i++) {
						// get lista de alternativas (a)
					}

					// Percorrer a coluna removendo items da lista de alternativas de (b)
					for (int i = 0; i < 9; i++) {
						// Gerar lista de alternativas final
					}

					// Se lista de alternativas tamanho = 1 >> Achamos a solucao

					// Posso criar um novo grid e comecar novamente para evitar processar ate o final

				}
			}
		}
		// Linhas com mais numeros dados

		// Colunas com mais numeros dados

		//

	}
}
