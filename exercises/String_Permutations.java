import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    // Method: 1
    private void permute(List<List<String>> answer, List<String> ds, char[] str, boolean[] freq) {
        if(ds.size() == str.length) {
            answer.add(new ArrayList<>(ds));
        }

        for(int i = 0; i < str.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(String.valueOf(str[i]));
                permute(answer, ds, str, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    // Method: 2
    private void permute(List<List<String>> answer, List<String> ds, int n, int[] count) {
        if(ds.size() == n) {
            answer.add(new ArrayList<>(ds));
        }

        for (int i = 0; i < 26; i++) {
            if(count[i] > 0) {
                count[i]--;
                ds.add(String.valueOf((char)(i+'A')));
                permute(answer, ds, n, count);
                ds.remove(ds.size() - 1);
                count[i]++;
            }
        }
    }

    // Method: 3(Space Optimized)
    private void permute(List<List<String>> ans, int index, char[] chars) {
        if(index >= chars.length) {
            ans.add(List.of(Arrays.toString(chars)));
            return;
        }

        for(int i = index; i < chars.length; i++) {
            // If we found duplicate elements, ignore it
            if(i != index && chars[i] == chars[index]) {
                continue;
            }

            swap(chars, i, index);
            permute(ans, index+1, chars);
            swap(chars, i, index);
        }
    }

    private void swap(char[] chars, int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

    public static void main(String[] args) {
        Test test = new Test();
        String str = "AAA";
        List<List<String>> answer = new ArrayList<>();

        // METHOD: 1
//        test.permute(answer, new ArrayList<>(), str.toCharArray(), new boolean[str.length()]);
//        answer.forEach(System.out::println);

        // METHOD: 2
//        int[] count = new int[26];
//        for (char c: str.toCharArray()) count[c - 'A']++;
//        test.permute(answer, new ArrayList<>(), str.length(), count);
//        answer.forEach(System.out::println);

        // METHOD: 3 (Space Optimized)
        test.permute(answer, 0, str.toCharArray());
        answer.forEach(System.out::println);
    }
}

/*

Input: "ABC"
Output: "ABC", "ACB", "BAC", "BCA", "CAB", "CBA"

Input: "AAB"
Output: "AAB", "ABA", "BAA"

*/

