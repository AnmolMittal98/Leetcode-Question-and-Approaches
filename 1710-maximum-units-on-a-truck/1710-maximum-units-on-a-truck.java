class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int dp=0;
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        for(int i=0;i<boxTypes.length;i++){
                if(boxTypes[i][0]<=truckSize){
                        dp+= boxTypes[i][0]*boxTypes[i][1];
                        truckSize-=boxTypes[i][0];
                }
                else{
                    dp+=truckSize*boxTypes[i][1];
                    return dp;
                }
        }
        return dp;
        
    }
}