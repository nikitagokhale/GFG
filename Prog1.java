class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum=0;
        boolean equationSatisfied = false;
        for(int i=0;i<arr.length;i++)
        {
            result.add(i);
            sum += arr[i];
            while(sum>s)
            {
                sum -= arr[result.get(0)];
                result.remove(0);
            }
            if(sum==s)
            {
                equationSatisfied = true;
                break;
            }
            
            if(i==arr.length-1)
                equationSatisfied = false;
            
        }
        if(!result.isEmpty() && equationSatisfied)
        {
            int first = result.get(0);
            int last = result.get(result.size()-1);
            result.clear();
            result.add(first+1);
            result.add(last+1);
        }
        else
        {
            result.clear();
            result.add(-1);
        }
        return (result);
    }
}
