/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class fourth {
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode not=new TreeNode(0);
        TreeNode taken=new TreeNode(0);
        rob(root,not,taken);
        return Math.max(not.val,taken.val);
    }
    public void rob(TreeNode rob,TreeNode not,TreeNode taken){
        if(rob.right==null && rob.left==null){
            taken.val=rob.val;
            not.val=0;
        }else if(rob.left==null){
            not.right=new TreeNode(0);
            taken.right=new TreeNode(0);

            rob(rob.right,not.right,taken.right);

            taken.val=rob.val+not.right.val;
            not.val=Math.max(taken.right.val,not.right.val);
        }else if(rob.right==null){
            not.left=new TreeNode(0);
            taken.left=new TreeNode(0);

            rob(rob.left,not.left,taken.left);

            taken.val=rob.val+not.left.val;
            not.val=Math.max(taken.left.val,not.left.val);

        }else{
            not.right=new TreeNode(0);
            not.left=new TreeNode(0);
            taken.right=new TreeNode(0);
            taken.left=new TreeNode(0);

            rob(rob.right,not.right,taken.right);
            rob(rob.left,not.left,taken.left);

            taken.val=rob.val+not.left.val+not.right.val;
            not.val=Math.max(taken.left.val,not.left.val)
                    +Math.max(taken.right.val,not.right.val);

        }
    }
}

/*  ideal: did not seam useful here
    d7: what i saw was whats that we need to remember at every point what happens from the 2 choices before.
    so the question is do i rob or do i not is not done until you have every point in the tree stored some how
    so i make 2 trees to follow the first tree and i build them from bottem to top, one storeing what happens if i take
    and the second what if i dont.
 */