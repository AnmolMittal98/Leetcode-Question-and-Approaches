class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        int i=0;
         int prev=0;
        while(i<s.length()){
            
            int total=0;
            while(i<s.length() && s.charAt(i)=='1'){
                total++;
                i++;
            }
            if(total>0){
                ans+=Math.min(prev,total);
                prev=total; 
            }
            
            total=0;
            while(i<s.length() && s.charAt(i)=='0'){
                total++;
                i++;
            }
            if(total>0){
                ans+=Math.min(prev,total);
                prev=total; 
            }
        }
        return ans;
        
    }
}