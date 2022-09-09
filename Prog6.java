class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i:arr)
        {
            if(array.contains(i) && !result.contains(i))
                result.add(i);
            else
                array.add(i);
        }
        if(result.isEmpty())
            result.add(-1);
        Collections.sort(result);
        return (result);
        
        // for (int i = 0; i < n; i++) {
        //     int index = arr[i] % n;
        //     arr[index] += n;
        // }
    
        // // Now check which value exists more
        // // than once by dividing with the size
        // // of array
        // bool flag = false;
        // vector<int> ans;
        // for (int i = 0; i < n; i++) {
        //     if ((arr[i] / n) > 1) {
        //         ans.push_back(i);
        //         flag = true;
        //     }
        // }
        // if (!flag) ans.push_back(-1);
        // return ans;
    }
}
