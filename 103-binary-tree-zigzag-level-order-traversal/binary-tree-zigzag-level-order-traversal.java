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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> zigzag = new ArrayList<>();

        if (root == null) return zigzag;

        boolean rightToLeft = false;

        Queue <TreeNode> queue = new LinkedList<>();

        queue.offer (root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List <Integer> subList = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                 if (!rightToLeft) {
                    subList.add(node.val);
                }

                else {
                    subList.add(0, node.val);
                }
            }

            rightToLeft = !rightToLeft;
            zigzag.add(subList);
        }

        return zigzag;
    }
}