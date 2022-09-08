class Tree
{
    int height(Node root)
    {
        int hl, hr;
        if(root==NULL)
            return 0;
        if(root.left==NULL && root.right==NULL)
            return 0;
        hl = height(root.left);
        hr = height(root.right);
        if(hl>hr)
            return hl+1;
        else
            return hr+1;
    }
    
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        Node temp = root;
        int height = height(root);
        ArrayList<Integer> result= new ArrayList<Integer>();
        if(root==null)
            return (result);
        while(temp.left != null || temp.right != null)
        {
            result.add(temp.data);
            temp = temp.left==null?temp.right:temp.left;
        }
        result.add(temp.data);
        return (result);
    }
}
