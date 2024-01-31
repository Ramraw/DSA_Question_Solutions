import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class GFG {
    // Function to store the zig-zag order traversal of the tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true; // Flag to alternate the order of traversal

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = (leftToRight) ? queue.poll() : queue.poll();
                if (leftToRight) {
                    levelNodes.add(node.data);
                } else {
                    levelNodes.add(0, node.data); // Add at the beginning for right-to-left traversal
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.addAll(levelNodes);
            leftToRight = !leftToRight;
        }

        return result;
    }
}
