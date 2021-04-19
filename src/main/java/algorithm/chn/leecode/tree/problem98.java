package algorithm.chn.leecode.tree;

import java.util.Map;

/**
 * 验证是否是二叉搜索树
 */
public class problem98 {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(4);
        TreeNode r = new TreeNode(6);
        head.right = r;
        r.left = new TreeNode(3);
        r.right = new TreeNode(7);
        boolean validBST = new problem98().isValidBST(head);
    }

    public boolean isValidBST(TreeNode root) {
        return process(root).isBST;
    }

    public static class NodeInfo{
        int max;
        int min;
        boolean isBST;

        public NodeInfo(int max, int min, boolean isBST) {
            this.max = max;
            this.min = min;
            this.isBST = isBST;
        }
    }

    public NodeInfo process(TreeNode root){
        if (root == null){
            return null;
        }

        int x = root.val;
        int max = root.val;
        int min = root.val;

        NodeInfo leftInfo = process(root.left);
        NodeInfo rightInfo = process(root.right);

        boolean isBST = (leftInfo==null||leftInfo.isBST) && (rightInfo==null||rightInfo.isBST);
        if (isBST){
            if (null!=leftInfo){
                min = Math.min(min,leftInfo.min);
                max = Math.max(max,leftInfo.max);
                if (root.val <= leftInfo.max){
                    isBST = false;
                }
            }

            if (null!=rightInfo){
                min = Math.min(min,rightInfo.min);
                max = Math.max(max,rightInfo.max);
                if (root.val >= rightInfo.min){
                    isBST = false;
                }
            }
        }

        return new NodeInfo(max,min,isBST);
    }
}
