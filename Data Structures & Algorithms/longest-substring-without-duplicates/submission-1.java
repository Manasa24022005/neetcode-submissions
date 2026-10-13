class Solution {
    public int lengthOfLongestSubstring(String s) {


       
        int len=0;
        int maxlen=0;

    

        for(int i=0;i<s.length();i++){
           
            int[] hash = new int [256];
            for(int j=i;j<s.length();j++){
            
            if(hash[s.charAt(j)]==1){
                break;
            }
            hash[s.charAt(j)]=1;
            len=j-i+1;
            maxlen=Math.max(maxlen,len);



            }
        }
        return maxlen;
        
    }
}
