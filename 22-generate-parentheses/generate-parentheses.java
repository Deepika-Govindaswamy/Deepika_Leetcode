class Solution {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        
        StringBuilder sb = new StringBuilder();
        int open = 0, close = 0;

        generate (n, open, close, res, sb);

        return res;
    }

    public void generate (int n, int open, int close, List<String> res, StringBuilder sb) {

        if (open == n && close == n) {
            res.add(sb.toString());
            return ;
        }

        if (open < n) {
            sb.append("(");
            generate (n, open+1, close, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }


        if (close < n && close < open) {
            sb.append(")");
            generate (n, open, close+1, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}