/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.college;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

/**
 *
 * @author ubuntu
 */
public class MatrixMutiplication {

    public static void main(String args[]) {
        System.out.println("This program was made by Rupal Malhotra.");
        System.out.println("Enter no. of rows and columns for first matrix");
        Scanner scan = new Scanner(System.in);
        int row1 = scan.nextInt();
        int col1 = scan.nextInt();
        System.out.println("Enter no. of rows and columns for first matrix");
        int row2 = scan.nextInt();
        int col2 = scan.nextInt();
        if (col1 == row2) {
            int[][] mat1 = new int[row1][col1];
            int[][] mat2 = new int[row2][col2];
            System.out.println("Enter elements in first matrix : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    mat1[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter elements in second matrix : ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    mat2[i][j] = scan.nextInt();
                }
            }
            int[][] mat3 = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row1; k++) {
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of first and second matrix is : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(mat3[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplications of these matrices is not possible.");
        }
    }
}
