class Solution{
    static int minJumps(int[] arr)
    {
        int noOfJumps = 0, i=0;
        while(i<arr.length-1)
        {
            i += arr[i];
            noOfJumps++;
        }
        return ((arr.length==0)?-1:noOfJumps);
    }
}
