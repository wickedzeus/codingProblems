public class NodeDepths {
    static int totalDepth = 0;
    public static int nodeDepths(BinaryTree root) {
        transverse(root, 0);

        int outputDepth = totalDepth;

        totalDepth = 0;

        return outputDepth;
    }

    static void transverse(BinaryTree tree, int nodeDepth) {
        int currentDepth = nodeDepth + 1;
        if(tree.left != null) transverse(tree.left, currentDepth);
        if(tree.right != null) transverse(tree.right, currentDepth);

        totalDepth += nodeDepth;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
