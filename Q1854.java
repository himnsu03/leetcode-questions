class Solution {
    public int maximumPopulation(int[][] logs) {
         int[] population = new int[2051];

        for (int[] log : logs) {
            population[log[0]]++;
            population[log[1]]--;
        }

        int maxPopulation = 0;
        int maxPopulationYear = 0;
        int currPopulation = 0;

        for (int i = 1950; i <= 2050; i++) {
            currPopulation += population[i];
            if (currPopulation > maxPopulation) {
                maxPopulation = currPopulation;
                maxPopulationYear = i;
            }
        }

        return maxPopulationYear;
    }
}
