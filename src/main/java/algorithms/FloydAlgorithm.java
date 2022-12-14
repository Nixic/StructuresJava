package algorithms;

import java.util.Random;

/**
 * Floyd's algorithm example.
 * Алгоритм Флойда, пример.
 TODO add javadoc!
 */

public class FloydAlgorithm {

    private static final int MATRIX_SIZE = 5;
    private static final int NO_RELATION_FLAG = -1;
    private static final int WEIGHT_SUPPLEMENT_LIMIT = 10;

    public static void main(String[] args) {
        int[][] weightMatrix = getWeightMatrix(MATRIX_SIZE);
        printMatrix("Weight", weightMatrix);

        int[][] historyMatrix = getHistoryMatrix(weightMatrix);
        printMatrix("History", historyMatrix);

        int[][] historyMatrixAfterFloydAlgorithm = floydAlgorithmRun(weightMatrix, historyMatrix);
        printMatrix("Weight after floyd", historyMatrixAfterFloydAlgorithm);
        printPaths(historyMatrixAfterFloydAlgorithm);
    }

    private static int[][] getWeightMatrix(int matrixSize) {
        int[][] w = new int[matrixSize][matrixSize];

        Random r = new Random();

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    w[i][j] = 0;
                } else {
                    if (i > 0 && j <= i - 1) {
                        w[i][j] = w[j][i];
                    } else {
                        if (r.nextInt() % 2 > 0) {
//                            w[i][j] = NO_RELATION_FLAG; // -1
                            w[i][j] = r.nextInt(matrixSize + WEIGHT_SUPPLEMENT_LIMIT);
                        } else {
                            int rndVal = r.nextInt(matrixSize + WEIGHT_SUPPLEMENT_LIMIT);
                            while (rndVal == 0) {
                                rndVal = r.nextInt(matrixSize + WEIGHT_SUPPLEMENT_LIMIT);
                            }
                            w[i][j] = rndVal;
                        }
                    }
                }
            }
        }
        return w;
    }

    private static int[][] getHistoryMatrix(int[][] weightMatrix) {
        int matrixSize = weightMatrix.length;
        int[][] h = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            int[] ints = weightMatrix[i];
            for (int j = 0; j < ints.length; j++) {
                if (weightMatrix[i][j] == NO_RELATION_FLAG || i == j) {
                    h[i][j] = 0;
                } else {
                    h[i][j] = j + 1;
                }
            }
        }
        return h;
    }

    private static void printMatrix(String matrixName, int[][] matrix) {
        System.out.printf("----------- %s matrix -----------\n", matrixName);
        System.out.print("\t");
        for (int i = 0; i < matrix.length; ++i) {
            System.out.print(i + 1 + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            System.out.print(i + 1 + "| \t");
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static int[][] floydAlgorithmRun(int[][] w, int[][] h) {
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w.length; j++) {
                if (w[i][j] != NO_RELATION_FLAG) {
                    for (int k = 0; k < w.length; k++) {
                        if (w[i][k] > w[i][j] + w[j][k]) {
                            w[i][k] = w[i][j] + w[j][k];
                            h[i][k] = h[i][j];
                        }
                    }
                }
            }
        }
        return h;
    }

    private static void printPaths(int[][] h) {
        // TODO need to finish(and fix) printing of paths
        for (int i = 0; i < h.length; i++) {
            int[] points = h[i];
            for (int j = 0; j < points.length; j++) {
                int point = points[j];
                if (h[i][j] != 0 && h[i][j] != j + 1) {
                    System.out.printf("From %s to %s via %s\n", i + 1, j + 1, h[i][j]);
                } else {
                    if (i != j) {
                        System.out.printf("Direct way from %s to %s\n", i + 1, j + 1);
                    }
                }
            }
        }
    }

}
