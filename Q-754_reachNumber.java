class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int position = 0;
        int move = 1;

        while (position < target || (position - target) % 2 != 0) {
            position += move;
            move++;
        }

        return move - 1;
    }
}
