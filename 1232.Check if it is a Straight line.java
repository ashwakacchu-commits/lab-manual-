class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[1][0] - coordinates[0][0];
        int deltaY = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int currentDeltaX = coordinates[i][0] - coordinates[0][0];
            int currentDeltaY = coordinates[i][1] - coordinates[0][1];
            if (deltaY * currentDeltaX != currentDeltaY * deltaX) {
                return false;
            }
        }

        return true;
    }
}
