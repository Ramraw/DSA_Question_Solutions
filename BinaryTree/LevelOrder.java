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
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return finalAns;
        }

        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> subList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curNode = q.poll();
                subList.add(curNode.val);

                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }

            finalAns.add(subList);
        }

        return finalAns;
    }
}
