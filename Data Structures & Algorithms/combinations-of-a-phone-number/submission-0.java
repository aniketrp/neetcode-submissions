class Solution {
    List<String> res =new ArrayList<>();
    String[] digitChar={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        dfs(0,"",digits);
        return res;
    }
    void dfs(int i,String curS,String digits){
        if(curS.length()==digits.length()){
            res.add(curS);
            return;
        }
        String chars=digitChar[digits.charAt(i)-'0'];
        for(char c:chars.toCharArray()){
            dfs(i+1,curS+c,digits);
        }
    }
}
