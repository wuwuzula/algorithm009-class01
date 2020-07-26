class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        int len = words.length;
        StringBuilder ans = new StringBuilder();
        ans.append(words[len - 1]);
        for (int i = len - 2; i >= 0; i --) {
            if (words[i].equals(""))
                continue;
            ans.append(" " + words[i]);
        }
        return ans.toString();
    }
}
