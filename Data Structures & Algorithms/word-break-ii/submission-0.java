class Solution {
    List<String> res;
    Set<String> wordSet;
    public List<String> wordBreak(String s, List<String> wordDict) {
        res=new ArrayList<>();
        wordSet=new HashSet<>(wordDict);
        List<String> cur=new ArrayList<>();
        dfs(0,s,cur);
        return res;
    }
    void dfs(int i,String s,List<String> cur){
        if(i==s.length()){
            res.add(String .join(" ",cur));
            return;
        }
        for(int j=i;j<s.length();j++){
            String w=s.substring(i,j+1);
            if(wordSet.contains(w)){
                cur.add(w);
                dfs(j+1,s,cur);
                cur.remove(cur.size()-1);
            }
        }
    }
}