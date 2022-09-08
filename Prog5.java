class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        Node temp = root;
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
