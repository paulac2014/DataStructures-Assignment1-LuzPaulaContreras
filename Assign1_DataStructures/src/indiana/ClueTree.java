package indiana;

public class ClueTree {
	
	class ClueNode {
	    String clue;
	    ClueNode left, right;

	    public ClueNode(String clue) {
	        this.clue = clue;
	        this.left = this.right = null;
	    }
	}
	
	    private ClueNode root;

	    public ClueTree() {
	        this.root = null;
	    }

	    public void insert(String clue) {
	        root = insertRec(root, clue);
	    }

	    private ClueNode insertRec(ClueNode root, String clue) {
	        if (root == null) {
	            root = new ClueNode(clue);
	            return root;
	        }
	        if (clue.compareTo(root.clue) < 0) {
	            root.left = insertRec(root.left, clue);
	        } else if (clue.compareTo(root.clue) > 0) {
	            root.right = insertRec(root.right, clue);
	        }
	        return root;
	    }

	    public void inOrder() {
	        inOrderRec(root);
	    }

	    private void inOrderRec(ClueNode root) {
	        if (root != null) {
	            inOrderRec(root.left);
	            System.out.println(root.clue);
	            inOrderRec(root.right);
	        }
	    }

	    public void preOrder() {
	        preOrderRec(root);
	    }

	    private void preOrderRec(ClueNode root) {
	        if (root != null) {
	            System.out.println(root.clue);
	            preOrderRec(root.left);
	            preOrderRec(root.right);
	        }
	    }

	    public void postOrder() {
	        postOrderRec(root);
	    }

	    private void postOrderRec(ClueNode root) {
	        if (root != null) {
	            postOrderRec(root.left);
	            postOrderRec(root.right);
	            System.out.println(root.clue);
	        }
	    }

	    public boolean findClue(String clue) {
	        return findClueRec(root, clue) != null;
	    }

	    private ClueNode findClueRec(ClueNode root, String clue) {
	        if (root == null || root.clue.equals(clue)) {
	            return root;
	        }
	        if (clue.compareTo(root.clue) < 0) {
	            return findClueRec(root.left, clue);
	        }
	        return findClueRec(root.right, clue);
	    }

	    public int countClues() {
	        return countCluesRec(root);
	    }

	    private int countCluesRec(ClueNode root) {
	        if (root == null) {
	            return 0;
	        }
	        return 1 + countCluesRec(root.left) + countCluesRec(root.right);
	    }
	

}
