1266. Minimum Time Visiting All Points

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length == 1) return 0;
        int totalPoints = points.length;
        int distance = 0;

        for(int i = 0; i < totalPoints-1; i++) {
            int[] currentPoint = points[i];
            int[] nextPoint = points[i+1];

            distance += Math.max(Math.abs(nextPoint[0] - currentPoint[0]), Math.abs(nextPoint[1] - currentPoint[1]));
        }
        return distance;
    }
}
