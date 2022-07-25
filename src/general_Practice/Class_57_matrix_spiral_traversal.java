package general_Practice;
import java.util.*;
/*
 * 
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
 * */
public class Class_57_matrix_spiral_traversal {
	public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        
        int starti = 0;
        int startj = 0;
        int endi = n-1;
        int endj = m-1;

        while(starti <= endi && startj <= endj){
             for(int i = starti; i <= endi; i++){
                 System.out.println(matrix[i][startj]);
             }

             for(int i = startj+1; i <= endj; i++){
                 System.out.println(matrix[endi][i]);
             }

             for(int i = endi-1; i >= starti; i--){
                 System.out.println(matrix[i][endj]);
             }

             for(int i = endj-1; i >= startj+1; i--){
                 System.out.println(matrix[starti][i]);
             }
//            System.out.println("Hello");
            starti++;
            startj++;
            endi--;
            endj--;
        }

    }
}
