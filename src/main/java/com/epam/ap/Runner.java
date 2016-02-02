package com.epam.ap;

public class Runner {
    public static void main(String[] args) {
        double[][] a = new double[][]
                {       {1, 2, 3},
                        {4, 5, 6},
                        {4, 5, 6.5},
                        {1, 3, 5}
                };
        double[][] b = new double[][]
                {       {1, 2, 3, 5},
                        {4, 5, 6, 4},
                        {4, 5, 6.5, 8}
                };

        Matrix aMatrix = new Matrix(a);
        Matrix bMatrix = new Matrix(b);

        System.out.println(aMatrix);
        System.out.println(bMatrix);

        System.out.println(MatrixMultiplicator.multiply(aMatrix, bMatrix));

    }
}
