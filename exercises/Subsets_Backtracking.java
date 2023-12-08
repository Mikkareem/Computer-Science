import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Test {

    private void duplicateSubsets(List<String> ans, char[] chars, StringBuilder s, int index) {

        // With variable Lengths [0...chars.length)
        ans.add(s.toString());

        for(int i = index; i < chars.length; i++) {
            s.append(chars[i]);
            duplicateSubsets(ans, chars, s, i+1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    private void uniqueSubsets(Set<String> ans, char[] chars, StringBuilder s, int index) {
        // With variable Length subsets [0...chars.length)
        ans.add(s.toString());

        for(int i = index; i < chars.length; i++) {
            s.append(chars[i]);
            uniqueSubsets(ans, chars, s, i+1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    private void duplicateSubsetsLengthSpecified(List<String> ans, char[] chars, StringBuilder s, int index) {

        // Subsets which are length as chars.length
        if(s.length() == chars.length) {
            ans.add(s.toString());
        }

        // Subsets which are length less than chars.length
//        if(s.length() < chars.length) {
//            ans.add(s.toString());
//        }

        for(int i = index; i < chars.length; i++) {
            s.append(chars[i]);
            duplicateSubsetsLengthSpecified(ans, chars, s, i+1);
            s.deleteCharAt(s.length() - 1);
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
        String str = "AAC";
        List<String> result = new ArrayList<>();
        test.duplicateSubsets(result, str.toCharArray(), new StringBuilder(), 0);
        System.out.println(result);

        List<String> result2 = new ArrayList<>();
        test.duplicateSubsetsLengthSpecified(result2, str.toCharArray(), new StringBuilder(), 0);
        System.out.println(result2);

        Set<String> set = new HashSet<>();
        test.uniqueSubsets(set, str.toCharArray(), new StringBuilder(), 0);
        System.out.println(set);
    }
}

/*

Input: "ABC"
Output: ["", "A", "B", "C", "AB", "AC", "BC", "ABC"]

Input: "AAB"
Output: ["", "A", "A", "B", "AA", "AB", "AB", "AAB"] ---> (With duplicates)
Output: ["", "A", "B", "AA", "AB", "AAB"] ----> (Without duplicates)

*/
