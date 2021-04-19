package algorithm.chn.leecode.tree;


import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class problem101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return process(root.left).equals(rprocess(root.right));
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

    public List<Integer> rprocess(TreeNode head) {
        List<Integer> res = new ArrayList<>();

        if (head == null){
            res.add(null);
            return res;
        }

        res.add(head.val);
        List<Integer> left = rprocess(head.left);
        List<Integer> right = rprocess(head.right);
        res.addAll(right);
        res.addAll(left);

        return res;
    }

    /**
     * 方法2 通过两个指针同时向下遍历比较
     * @param p
     * @param q
     * @return
     */
    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

}
