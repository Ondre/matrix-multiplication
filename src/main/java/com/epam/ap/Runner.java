package com.epam.ap;

public class Runner {
    public static void main(String[] args) {
        double[][] a = new double[][]
                {       {1,2,3},
                        {4,5,6},
                        {4,5,6.5},
                        {1,3,5}
                };
        double[][] b = new double[][]
                {       {1,2,3,5},
                        {4,5,6,4},
                        {4,5,6.5,8}
                };

        Matrix A = new Matrix(a);
        Matrix B = new Matrix(b);
        System.out.println(A);
        System.out.println(B);
        System.out.println(MatrixMultiplicator.multiply(A,B));

    }
}
