package algorithm.chn.leecode.tree;

import java.util.ArrayList;
import java.util.List;

public class problem100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> process1 = process(p);
        List<Integer> process2 = process(q);
        return process1.equals(process2);
    }

    public List<Integer> process(TreeNode head) {
        List<Integer> res = new ArrayList<>();
        if (head == null){
            res.add(null);
            return res;
        }

        res.add(head.val);
        List<Integer> left = process(head.left);
        List<Integer> right = process(head.right);
        res.addAll(left);
        res.addAll(right);

        return res;
    }
}
