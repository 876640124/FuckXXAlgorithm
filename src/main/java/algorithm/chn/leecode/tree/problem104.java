package algorithm.chn.leecode.tree;

import sun.reflect.generics.tree.Tree;

public class problem104 {
    public int maxDepth(TreeNode root) {
        return process(root);
    }

    public int process(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(process(root.left),process(root.right))+1;
    }
}
