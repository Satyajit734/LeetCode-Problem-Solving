class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String strs1=strs[0];
        String strs2=strs[strs.length-1];
        int i=0;
        while(i<strs1.length()){
            if(strs1.charAt(i)==strs2.charAt(i)){
                i++;
            }
            else{
                break;
            }

        }
        return i==0 ? "" : strs1.substring(0,i);
        
    }
}