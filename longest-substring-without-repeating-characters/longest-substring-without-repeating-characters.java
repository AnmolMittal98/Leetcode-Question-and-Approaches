class Solution {
      public static int lengthOfLongestSubstring(String s) {
          if(s.length()==0) {
        	return 0;
        }
        if(s.length()==1) {
        	return 1;
        }
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        int left=0;
        int right=1;
        
        int count=1;
        int tcount=0;
        
        hm.put(s.charAt(0), 0);
        
        while(right<s.length()) {
        	if(hm.containsKey(s.charAt(right))){
        		if(hm.get(s.charAt(right))>=left && hm.get(s.charAt(right))<right) {
        			left=hm.get(s.charAt(right))+1;
        		}
        		
        	}
        		tcount=Math.max(tcount, right-left+1);
        		hm.put(s.charAt(right), right);
        		right++;
        }
      
      return tcount;  

    }
}