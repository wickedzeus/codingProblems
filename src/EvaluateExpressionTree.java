public class EvaluateExpressionTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static int traverse(BinaryTree tree) {
        int left = 0;
        int right = 0;

        if(tree.left.value > 0 && tree.right.value > 0) {
            switch(tree.value) {
                case -1: return tree.left.value + tree.right.value;
                case -2: return tree.left.value - tree.right.value;
                case -3: return tree.left.value / tree.right.value;
                case -4: return tree.left.value * tree.right.value;
            }
        }

        if(tree.left.value < 0) {
            left = traverse(tree.left);
        } else {
            left = tree.left.value;
        }
        if(tree.right.value < 0) {
            right = traverse(tree.right);
        } else {
            right = tree.right.value;
        }

        return switch (tree.value) {
            case -1 -> left + right;
            case -2 -> left - right;
            case -3 -> left / right;
            case -4 -> left * right;
            default -> left;
        };
    }

    public int evaluateExpressionTree(BinaryTree tree) {

        return traverse(tree);
    }
}
