class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
         int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int xi = points[i][0];
                int yi = points[i][1];
                int xj = points[j][0];
                int yj = points[j][1];
                int equationValue = yi + yj + Math.abs(xi - xj);

                if (Math.abs(xi - xj) <= k && equationValue > maxValue) {
                    maxValue = equationValue;
                }
            }
        }

        return maxValue;
    }
}
