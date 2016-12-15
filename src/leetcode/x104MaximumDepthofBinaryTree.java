package leetcode;

import javax.swing.tree.TreeNode;

/**
 * Given a binary tree, find its maximum depth.The maximum depth is the number of nodes
 * along the longest path from the root node down to the farthest leaf node.
 */
public class x104MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null )return 0;
        else{
            int m=maxDepth(root.left);
            int n=maxDepth(root.right);
            if(m>n){
                return m+1;
            }
            else{
                return n+1;
            }
        }
    }

}
