class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();

        if (digits.length() == 0) {
            return res;
        }

        HashMap<Character, String> map = new HashMap<Character, String>();
        StringBuilder sb = new StringBuilder();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        res = printCombo (map, 0, digits, res, sb);

        return res;
    }

    public List<String> printCombo (HashMap<Character, String> map, int index, String digits, List<String> res, StringBuilder sb) {

        if (index == digits.length()) {
            res.add (sb.toString());
            return res;
        }

        String currLetters = map.get(digits.charAt(index));

        for (int i = 0; i < currLetters.length(); i++) {
            sb.append (currLetters.charAt(i));
            printCombo (map, index + 1, digits, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }

        return res;
    }
}