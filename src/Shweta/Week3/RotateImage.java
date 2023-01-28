package Shweta.Week3;

import java.util.Arrays;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 *
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 *
 * Constraints:
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 *
 * https://leetcode.com/problems/rotate-image/description/
 */
public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
        for(int row=0; row<=matrix.length-1; row++){
            for(int col=row+1; col<=matrix[row].length-1; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        for(int row=0; row<=matrix.length-1; row++){
            for(int col=0; col<matrix[row].length/2; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix[row].length-1-col];
                matrix[row][matrix[row].length-1-col] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
