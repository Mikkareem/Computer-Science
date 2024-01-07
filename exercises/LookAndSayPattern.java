import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLookAndSayPattern(n);
    }

    private static void printLookAndSayPattern(int n) {
        String currentPattern = "1";
        System.out.println(currentPattern);

        for(int i = 1; i < n; i++) {
            String counts = findCounts(currentPattern);
            System.out.println(counts);
            currentPattern = counts;
        }
    }

    static String findCounts(final String text) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int count = 1;
            while (i+1 < text.length() && text.charAt(i+1) == text.charAt(i)) {
                count++;
                i++;
            }
            sb.append(count).append(character);
        }
        return sb.toString();
    }
}

/*
Input: 5

Output:
1
11
21
1211
111221

Explanation:
1st row always starts with 1.

Every other row has value based on previous row's lookAndSay Pattern.

LookAndSayPattern: 
11222311222
1 -> 2 counts
2 -> 3 counts
3 -> 1 count
1 -> 2 counts
2 -> 3 counts

Pattern: 2132132132 ---> "$count$value" pattern

*/
