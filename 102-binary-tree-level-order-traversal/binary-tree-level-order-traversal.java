/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        int index = 0;

        while (index < list.size()) {

            int size = list.size() - index;
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = list.get(index++);

                level.add(node.val);

                if (node.left != null) {
                    list.add(node.left);
                }

                if (node.right != null) {
                    list.add(node.right);
                }
            }

            result.add(level);
        }
        return result;
    }
}