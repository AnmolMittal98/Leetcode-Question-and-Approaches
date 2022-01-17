class Solution {
    public int uniqueLetterString(String s) {
          int[][] index = new int[26][2]; // {prevOfPrevI, prevI}
          for(int i=0;i<26;i++){
              Arrays.fill(index[i],-1);
          }
        
        int res=0;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-'A';
            res=(res+(i-index[c][1]) * (index[c][1]-index[c][0])%mod)%mod;
            index[c][0] = index[c][1];
            index[c][1] = i;
            
        }
        
        for(int c=0;c<26;c++){
          res=(res+(s.length()-index[c][1]) * (index[c][1] - index[c][0])%mod)%mod; 
        }
        return res;
        
    }
}