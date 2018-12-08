public class seventh {
    public void flatten(TreeNode root) {
        if(root==null||(root.right==null&&root.left==null)) return;
        TreeNode right = root.right;
        flatten(right);
        flatten(root.left);
        root.right = root.left;
        root.left = null;
        TreeNode p = root;
        while(p.right!=null){
            p = p.right;
        }
        p.right = right;
    }
}
/* ideal:not used
    d7: so the recurive solition pops out clearly when i first see this but basicly the base case is simple 1 node on
    its own is flat, and if you flaten right and left on any other note and put left flat point to right flat you are done.
    the question then becomes simply finding the end of left and watching out for null pointer problems.
    Q:no question here seams clearly defined
 */