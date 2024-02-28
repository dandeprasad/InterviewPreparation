package Interview.paypay;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

Main data = new Main();
data.solution(4,5,new String[]{"v 1 2", "x 2 2", "v 1 2", "> 2 1", "x 2 3", "> 2 1", "< 2 0"});
   System.out.println(data);
    }


     List<int[]> solution(int h, int w, String[] queries) {

        List<int[]> result = new Vector<>();

        int position = 0;
        int[][] rect_board = new int[w][h];
        for (String query : queries) {

            String[] inputData = query.split(" ");

            int a = Integer.parseInt(inputData[1]);
            int b = Integer.parseInt(inputData[2]);

            if (inputData[0].equals("x")) {

                rect_board[a][b] = 1;
                result.add(new int[]{a, b});


            } else if (inputData[0].equals(">")) {

                if (rect_board[w-1][b] == 1) {

                    result.add(new int[]{-1, -1});

                } else {
                    rect_board[w-1][b] = 1;

                    result.add(new int[]{w-2, b});


                }


            } else if (inputData[0].equals("<")) {

                if (rect_board[0][b] == 1) {

                    result.add(new int[]{-1, -1});



                } else {
                    rect_board[0][b] = 1;
                    result.add(new int[]{1, b});


                }

            } else if (inputData[0].equals("v")) {
                if (rect_board[a][h-1] == 1) {

                    result.add(new int[]{-1, -1});



                } else {
                    rect_board[a][h-1] = 1;
                    result.add(new int[]{a, h-2});


                }

            } else if (inputData[0].equals("^")) {
                if (rect_board[a][0] == 1) {
                    result.add(new int[]{-1, -1});

                } else {
                    rect_board[a][0] = 1;
                    result.add(new int[]{a, 1});
                }

            }



        }
        return result;
    }

}
