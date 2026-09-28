class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();

        int n = s.length();
        int m = t.length();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       if(m!=n){
        return false;
       }


       for(int i=0;i<n;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }

       }

       return true;

    
}
}
