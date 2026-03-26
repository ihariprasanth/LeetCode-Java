class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(s.length()<p.length()) return result;
        int[] count=new int[26];
        for(char c:p.toCharArray()){
            count[c-'a']++;
        }
        int left=0;
        int right=0;
        int match=0;
        int k=p.length();
        while(right<s.length()){
            char rchar=s.charAt(right);
            count[rchar-'a']--;
            if(count[rchar-'a']>=0){
                match++;
            }
            if(right-left+1>k){
                char lchar=s.charAt(left);
                if(count[lchar-'a']>=0){
                    match--;
                }
                count[lchar-'a']++;
                left++;
            }
            if(match==k){
                result.add(left);
            }
            right++;
        }
        return result;
    }
}
