public class FindClosestValueInBst {
    static int closestNode = 0;
    static int closestDiff = Integer.MAX_VALUE;
    public static int findClosestValueInBst(BST tree, int target) {
        transverse(tree, target);

        int outputNode = closestNode;

        closestNode = 0;
        closestDiff = Integer.MAX_VALUE;
        return outputNode;
    }

    public static void transverse(BST tree, int target) {
        int closeness = Math.abs(target - tree.value);
        if(closeness < closestDiff) {
            closestNode = tree.value;
            closestDiff = closeness;
        }

        if(tree.left != null) transverse(tree.left, target);
        if(tree.right != null) transverse(tree.right, target);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
