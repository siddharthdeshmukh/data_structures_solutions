package hackerrank.java;

import java.util.Scanner;

public class LargestRegionSolution {

	private static int rows;
	private static int cols;

	public static int getBiggestRegion(int[][] matrix) {
		int maxRegion = 0;

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				/* Find the largest region from the current cell */
				if (matrix[row][col] == 1) {
					int size = findLargestRegion(matrix, row, col);
					maxRegion = Math.max(maxRegion, size);
				}
			}
		}
		return maxRegion;
	}

	private static int findLargestRegion(int[][] grid, int row, int col) {
		/*
		 * Put boundary checks here (at top of recursive call), instead of before doing
		 * recursive call
		 */
		if (row < 0 || row >= rows || col < 0 || col >= cols || grid == null || grid[row][col] == 0) {
			return 0;
		}

		grid[row][col] = 0; // we alter the original matrix here
		int size = 1; // 1 accounts for our size

		/* Recursively search neighbors */
		for (int r = row - 1; r <= row + 1; r++) {
			for (int c = col - 1; c <= col + 1; c++) {
				if (!(r == row && c == col)) {
					size += findLargestRegion(grid, r, c);
				}
			}
		}

		return size;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
		int grid[][] = new int[rows][cols];
		for (int grid_i = 0; grid_i < rows; grid_i++) {
			for (int grid_j = 0; grid_j < cols; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}
		System.out.println(getBiggestRegion(grid));
	}

}
