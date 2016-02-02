package com.epam.ap;

public class Matrix {

    private final double[][] arr;
    private final int rows;
    private final int cols;

    public Matrix(double[][] arr) {
        boolean isValid = true;
        cols = arr[0].length;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length != cols) {
                System.err.println("Unable to create matrix: number of rows is not equal to the number of columns.");
                isValid = false;
                break;
            }
        }

        if (isValid) {
            rows = arr.length;
            this.arr = deepCopyDoubleArray(arr);
        } else {
            rows = 0;
            this.arr = null;
        }
    }

    public double get(int row, int column) {
        if (row < 0 || row >= rows) throw new IndexOutOfBoundsException("Incorrect row index: out of bounds");
        if (column < 0 || column >= cols) throw new IndexOutOfBoundsException("Incorrect column index: Out of bounds");
        return arr[row][column];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double[][] getMatrixAsDoubleArray() {
        return deepCopyDoubleArray(arr);
    }

    private double[][] deepCopyDoubleArray(double[][] arr) {
        if (arr == null) return null;

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
