package com.example;

public class GameOfLifeAT {

	public static void main(String[] args) {

		GameOfLifeAT gameOfLifeAt = new GameOfLifeAT();

		int seed[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
		int rowLength = 10;
		int columnLength = 5;

		int newGeneration[][] = new int[10][5];

		for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnLength; columnIndex++) {
				int neighbourCountResult = gameOfLifeAt.findNeighbourCount(seed, rowIndex + 1, columnIndex + 1,
						rowIndex - 1, columnIndex - 1);
				if (gameOfLifeAt.applyRules(neighbourCountResult-seed[rowIndex][columnIndex], seed[rowIndex][columnIndex])) {
					newGeneration[rowIndex][columnIndex] = 1;
				}
				newGeneration[rowIndex][columnIndex] = 0;
			}

		}
		System.out.println("given array");
		gameOfLifeAt.displayGeneration(seed, rowLength, columnLength, 0, 0);
		System.out.println("resultant array");
		gameOfLifeAt.displayGeneration(newGeneration, rowLength, columnLength, 0, 0);

	}

	private int findNeighbourCount(int[][] seed, int rowLength, int columnLength, int row, int column) {
		int neighbourCount = 0;
		for (int rowIndex = row; rowIndex <= rowLength; rowIndex++) {
			for (int columnIndex = column; columnIndex <= columnLength; columnIndex++) {
				if (checkBoundryCondition(rowIndex,columnIndex)) {
					neighbourCount++;
				}
			}
		}

		return neighbourCount;
	}

	private boolean applyRules(int totalNiegbours, int currentState) {

		if ((totalNiegbours == 2 || totalNiegbours == 3) && currentState == 1) {
			return true;
		}
		if (totalNiegbours == 3 && currentState == 0) {
			return true;
		}
		if(totalNiegbours>3  && currentState == 1)
		{
			return true;
		}
		return false;

	}

	private boolean checkBoundryCondition(int row, int column) {
		if (row < 0 || row > 10 - 1) {
			return false;
		}
		if (column < 0 || column > 5 - 1)

		{
			return false;
		}
		return true;

	}

	private void displayGeneration(int[][] generation, int rowLength, int columnLength, int row, int column) {

		for (int rowIndex = row; rowIndex < rowLength; rowIndex++) {

			for (int columnIndex = column; columnIndex < columnLength; columnIndex++) {
				System.out.print(generation[rowIndex][columnIndex] + "\t");
			}
			System.out.println();

		}
	}
}
