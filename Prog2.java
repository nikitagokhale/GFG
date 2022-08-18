class Solution{
    static int minJumps(int[] arr)
    {
        int noOfJumps = 0, i=0;
        if(arr.length == 0)
            return -1;
        while(i<arr.length)
        {
            i += arr[i];
            noOfJumps++;
        }
    }
}
