class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        result[0] = new int[]{rStart, cStart};
        int steps = 1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};  // right, down, left, up
        int index = 1;

        while (index < rows * cols) {
            for (int i = 0; i < steps; i++) {
                rStart += directions[0][0];
                cStart += directions[0][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[index++] = new int[]{rStart, cStart};
                }
            }

            int[] temp = directions[0];
            for (int i = 0; i < 3; i++) {
                directions[i] = directions[i + 1];
            }
            directions[3] = temp;

            if (directions[0][0] == directions[2][0]) {  // vertical movement
                steps++;
            }
        }

        return result;
    }
}
