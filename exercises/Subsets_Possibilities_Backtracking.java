import java.util.HashSet;
import java.util.Set;

class Test {

    private void allPossibilities(Set<String> set, char[] chars, boolean[] freq, StringBuilder s) {
        // Here we get the all possibilities (subsets), may contain duplicates if we have duplicate characters in input
        System.out.println(s);

        // If we want only unique possibilities (subsets), add it to the set.
        set.add(s.toString());

        for(int i = 0; i < chars.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                s.append(chars[i]);
                allPossibilities(set, chars, freq, s);
                s.deleteCharAt(s.length() - 1);
                freq[i] = false;
            }
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
        String str = "ABC";
        Set<String> set = new HashSet<>();
        test.allPossibilities(set, str.toCharArray(), new boolean[str.length()], new StringBuilder());
        System.out.println(set);
    }
}

/*

Input: "ABC"
Output: ["", "A", "B", "C", "AB", "BC", "CA", "AC", "BA", "CB", "ABC", "ACB", "BAC", "BCA", "CBA", "CAB"]

Input: "AAB"
Output: ["", "A", "A", "B", "AA", "AA", "AB", "BA", "AB", "BA", "AAB", "AAB", "ABA", "ABA", "BAA", "BAA"] ---> (With duplicates)
Output: ["", "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA"] -----> (Without duplicates)

*/
