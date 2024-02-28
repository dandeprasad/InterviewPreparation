package Interview.paypay;

import java.util.Arrays;

public class BoardQueries {

    public static void main(String[] args) {
        int h = 3;
        int w = 5;
        String[] queries = {"v 1 2", "x 2 2", "v 1 2", "> 2 1", "x 2 3", "> 2 1", "< 2 0"};

        int[][] result = solution(h, w, queries);

        // Print the result
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] solution(int h, int w, String[] queries) {
        int[][] board = new int[h][w];
        int[][] result = new int[queries.length][2];
        int queryIndex = 0;

        for (String query : queries) {
            String[] parts = query.split(" ");
            char operation = parts[0].charAt(0);
            int a = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]);

            switch (operation) {
                case 'x':
                    board[a][b] = 1; // color the cell black
                    break;
                case '>':
                    result[queryIndex++] = findRightmostWhiteCell(board, a, b);
                    break;
                case '<':
                    result[queryIndex++] = findLeftmostWhiteCell(board, a, b);
                    break;
                case 'v':
                    result[queryIndex++] = findDownwardWhiteCell(board, a, b);
                    break;
                case '^':
                    result[queryIndex++] = findUpwardWhiteCell(board, a, b);
                    break;
            }
        }

        return result;
    }

    private static int[] findRightmostWhiteCell(int[][] board, int row, int col) {
        for (int j = col + 1; j < board[0].length; j++) {
            if (board[row][j] == 0) {
                return new int[]{row, j};
            }
        }
        return new int[]{-1, -1}; // No white cell found
    }

    private static int[] findLeftmostWhiteCell(int[][] board, int row, int col) {
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 0) {
                return new int[]{row, j};
            }
        }
        return new int[]{-1, -1}; // No white cell found
    }

    private static int[] findDownwardWhiteCell(int[][] board, int row, int col) {
        for (int i = row + 1; i < board.length; i++) {
            if (board[i][col] == 0) {
                return new int[]{i, col};
            }
        }
        return new int[]{-1, -1}; // No white cell found
    }

    private static int[] findUpwardWhiteCell(int[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 0) {
                return new int[]{i, col};
            }
        }
        return new int[]{-1, -1}; // No white cell found
    }
}
