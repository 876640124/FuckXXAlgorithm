package algorithm.chn.leecode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class problem94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        return process(root);
    }

    public List<Integer> process(TreeNode root) {
        if (null == root){
            return new LinkedList<>();
        }
        List<Integer> res = new LinkedList<>();
        List<Integer> leftList = process(root.left);
        List<Integer> rightList = process(root.right);
        res.addAll(leftList);
        res.add(root.val);
        res.addAll(rightList);
        return res;
    }
}
