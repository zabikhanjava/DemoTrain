package com.example.DemoTRain;

public class GameOfLife {
	public static void main(String[] args) {

		int generations[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 1, 0 },
				{ 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(generations[i][j] + "\t");
			}
			System.out.println();
		}
		int newGenerations[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };

		System.out.println("begining of " + "generation");

		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 4; j++) {
				{
					int neighbour = 0;

					if ((i - 1 >= 0 && j - 1 >= 0) && (generations[i - 1][j - 1] == 1)) {
						neighbour++;
					}
					if ((i - 1 >= 0) && generations[i - 1][j] == 1) {
						neighbour++;
					}
					if ((i - 1 >= 0) && (j + 1 <= 4) && (generations[i - 1][j + 1] == 1)) {
						neighbour++;
					}
					if ((j - 1 >= 0) && (generations[i][j - 1] == 1)) {
						neighbour++;
					}
					if ((j + 1 <= 4) && (generations[i][j + 1] == 1)) {
						neighbour++;
					}
					if (((i + 1 <= 9) && (j - 1 >= 0)) && (generations[i + 1][j - 1] == 1)) {
						neighbour++;
					}
					if ((i + 1 <= 9) && (generations[i + 1][j] == 1)) {
						neighbour++;
					}
					if (((i + 1 <= 9) && (j + 1 <= 4)) && (generations[i + 1][j + 1] == 1)) {
						neighbour++;
					}

					if (generations[i][j] == 1 && neighbour < 2) {
						newGenerations[i][j] = 0;
					} else if (generations[i][j] == 1 && (neighbour == 2 || neighbour == 3)) {
						newGenerations[i][j] = 1;
					} else if (generations[i][j] == 1 && neighbour > 3) {
						newGenerations[i][j] = 0;

					} else if (generations[i][j] == 0 && neighbour == 3) {
						newGenerations[i][j] = 1;
					}
				}
			}

		}
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(newGenerations[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("ending of " + "generation");

	}
}
