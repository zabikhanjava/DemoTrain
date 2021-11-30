package com.example.DemoTRain;

public class GameOFLife {
	public static void main(String[] args) {

		int Generations[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(Generations[i][j] + "\t");

			}
			System.out.println();
		}

		for (int k = 0; k <= 3; k++) {
			System.out.println("begining of " + k + "generation");
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 5; j++) {
					int neighbour = 0;

					if (i == 0 || j == 0) {
						for (int tempi = i; tempi < i; tempi++) {
							for (int tempj = j; tempj < j; tempj++) {
								if (Generations[tempi][tempj] == 1) {
									neighbour++;
								} else if (Generations[tempj][tempi] == 1) {
									neighbour++;
								}
							}
						}
					} else if (i == 10 || j == 10) {
						for (int tempi = i-1; tempi < i; tempi++) {
							for (int tempj = j-1; tempj < j; tempj++) {
								if (Generations[tempi][tempj] == 1) {
									neighbour++;
								} else if (Generations[tempj][tempi] == 1) {
									neighbour++;
								}
							}
						}
					} else {
						for (int tempi = i-1; tempi < i+1; tempi++) {
							for (int tempj = j-1; tempj < j+1; tempj++) {
								if (Generations[tempi][tempj] == 1) {
									neighbour++;
								} else if (Generations[tempj][tempi] == 1) {
									neighbour++;
								}
							}
						}
					}
					if (Generations[i][j] == 1 && neighbour < 2) {
						Generations[i][j] = 0;
					} else if (Generations[i][j] == 1 && neighbour >= 2) {
						Generations[i][j] = 1;
					} else if (Generations[i][j] == 1 && neighbour >= 3) {
						Generations[i][j] = 0;

					} else if (Generations[i][j] == 0 && neighbour == 3) {
						Generations[i][j] = 1;
					}
					System.out.print(Generations[i][j] + "\t");
				}
				System.out.println();

			}
			System.out.println("ending of " + k + "generation");

		}
	}
}
