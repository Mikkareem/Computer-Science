class Test {
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

    public static void main(String[] args) {
        Test test = new Test();
        String str = "AAB";
        List<List<String>> answer = new ArrayList<>();

        // METHOD: 1
//        test.permute(answer, new ArrayList<>(), str.toCharArray(), new boolean[str.length()]);
//        answer.forEach(System.out::println);

        // METHOD: 2
        int[] count = new int[26];
        for (char c: str.toCharArray()) count[c - 'A']++;
        test.permute(answer, new ArrayList<>(), str.length(), count);
        answer.forEach(System.out::println);
    }
}


/*

Input: "ABC"
Output: "ABC", "ACB", "BAC", "BCA", "CAB", "CBA"

Input: "AAB"
Output: "AAB", "ABA", "BAA"

*/

