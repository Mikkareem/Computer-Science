import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        List<int[]> result = new ArrayList<>();

        // Case 1: no overlapping case before the merge intervals
        // Compare ending point of intervals to starting point of newInterval
        while(i < n && newInterval[0] > intervals[i][1]) {
            result.add(intervals[i]);
            i++;
        }

        // Case 2: overlapping case and merging of intervals
        while(i < n && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Case 3: no overlapping of intervals after newinterval being merged
        while(i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][2]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][] {
                {1, 3}, {6, 9}
        };
        int[] newinterval = new int[] {2, 5};


        int[][] result = (new InsertInterval()).insert(intervals, newinterval);
        Arrays.stream(result).forEach(a -> {
            Arrays.stream(a).forEach(b -> System.out.print(b + " "));
            System.out.println();
        });
    }
}
