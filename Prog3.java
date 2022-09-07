public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        int min =0, max = 100000;
        return IsBST(root, min, max);
    }
    
    boolean IsBST(Node root, int min, int max)
    {
        boolean IsBSTLeft1 = true, IsBSTRight1 = true, IsBSTLeft2 = true, IsBSTRight2 = true, IsLeftBST = true, IsRightBST = true;
        
        if(root.left==null && root.right==null)
            return true;
        
        if(root.left != null){
            IsBSTLeft2 = root.data<max?true:false;
            max = root.data;
            IsLeftBST = IsBST(root.left, min, max);
            IsBSTLeft1 = root.left.data <= root.data ? true:false;
        }
        
        if(root.right != null){
            IsBSTRight2 = root.data>min?true:false;
            min = root.data;
            IsRightBST = IsBST(root.right, min, max);
            IsBSTRight1 = root.right.data >= root.data ? true:false;
        }
        
        if(IsBSTLeft1 && IsBSTRight1 && IsBSTLeft2 && IsBSTRight2 && IsLeftBST && IsRightBST)
            return true;
        else
            return false;
    }
}
