import java.util.*;

public class binaryTree {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static ArrayList<Integer> sums = new ArrayList<>();

    public static void transverse(BinaryTree tree, int currentSum) {

        if(tree.left != null) transverse(tree.left, currentSum);
        if(tree.right != null) transverse(tree.right, currentSum);

        if(tree.left == null && tree.right == null) sums.add(currentSum);
    }

    public static List<Integer> branchSums(BinaryTree root) {
        transverse(root, 0);

        ArrayList<Integer> outputSums = sums;

        sums = new ArrayList<>();

        return outputSums;
    }
}
