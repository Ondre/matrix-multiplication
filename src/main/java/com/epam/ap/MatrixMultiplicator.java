package com.epam.ap;

public class MatrixMultiplicator {
    public static Matrix multiply(Matrix m1, Matrix m2) {

        if (m1.getCols() != m2.getRows()) {
            System.err.println("Unable to multiply. Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return null;
        }

        double[][] result = new double[m1.getRows()][m2.getCols()];

        for (int i = 0; i < m1.getRows(); i++) {
            for (int j = 0; j < m2.getCols(); j++) {
                for (int k = 0; k < m2.getRows(); k++) {
                    result[i][j] += m1.get(i, k) * m2.get(k, j);
                }
            }
        }
        return new Matrix(result);
    }
}
