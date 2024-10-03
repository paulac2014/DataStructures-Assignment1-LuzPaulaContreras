package indiana;

public class Main {
    public static void main(String[] args) {
        // Testing the Array Artifact functionality
        System.out.println("=== Testing ArtifactVault ===");
        ArtifactVault vault = new ArtifactVault(5);
        vault.addArtifact("Golden Idol");
        vault.addArtifact("Crystal Skull");
        vault.addArtifact("Holy Grail");
        System.out.println("Linear Search for 'Crystal Skull': " + vault.linearSearch("Crystal Skull"));
        System.out.println("Binary Search for 'Holy Grail': " + vault.binarySearch("Holy Grail"));
        vault.removeArtifact("Crystal Skull");
        System.out.println("Linear Search after removal for 'Crystal Skull': " + vault.linearSearch("Crystal Skull"));

        // Testing the Linked List Labyrinth functionality
        System.out.println("\n=== Testing LabyrinthPath ===");
        LabyrinthPath path = new LabyrinthPath();
        path.addLocation("Entrance");
        path.addLocation("Cavern");
        path.addLocation("Bridge");
        path.printPath();
        path.removeLastLocation();
        path.printPath();
        System.out.println("Loop in the path: " + path.containsLoop());

        // Testing the Stack of Ancient Texts functionality
        System.out.println("\n=== Testing ScrollStack ===");
        ScrollStack scrollStack = new ScrollStack();
        scrollStack.push("Scroll of Fire");
        scrollStack.push("Scroll of Water");
        scrollStack.push("Scroll of Earth");
        System.out.println("Peek at the top scroll: " + scrollStack.peek());
        System.out.println("Pop the top scroll: " + scrollStack.pop());
        System.out.println("Contains 'Scroll of Fire': " + scrollStack.contains("Scroll of Fire"));

        // Testing the Queue of Explorers functionality
        System.out.println("\n=== Testing ExplorerQueue ===");
        ExplorerQueue explorerQueue = new ExplorerQueue(3);
        explorerQueue.enqueue("Indiana Jones");
        explorerQueue.enqueue("Lara Croft");
        explorerQueue.enqueue("Nathan Drake");
        System.out.println("Next Explorer: " + explorerQueue.nextExplorer());
        explorerQueue.dequeue();
        System.out.println("Next Explorer after dequeue: " + explorerQueue.nextExplorer());
        System.out.println("Is queue full: " + explorerQueue.isFull());
        explorerQueue.enqueue("Rick O'Connell");
        System.out.println("Next Explorer after enqueue: " + explorerQueue.nextExplorer());

        // Testing the Binary Tree of Clues functionality
        System.out.println("\n=== Testing ClueTree ===");
        ClueTree clueTree = new ClueTree();
        clueTree.insert("First Clue");
        clueTree.insert("Second Clue");
        clueTree.insert("Third Clue");
        System.out.println("In-order traversal:");
        clueTree.inOrder();
        System.out.println("Pre-order traversal:");
        clueTree.preOrder();
        System.out.println("Post-order traversal:");
        clueTree.postOrder();
        System.out.println("Clue found ('Second Clue'): " + clueTree.findClue("Second Clue"));
        System.out.println("Total clues in the tree: " + clueTree.countClues());
    }
}
