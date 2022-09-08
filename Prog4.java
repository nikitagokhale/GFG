class Solution {
    int MissingNumber(int array[], int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
            sum+=i;
        for(int e:array)
            sum-=e;
        return sum;
    }
}
