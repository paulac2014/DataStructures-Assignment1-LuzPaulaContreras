package indiana;

public class LabyrinthPath {

	class Node {
	    String location;
	    Node next;

	    public Node(String location) {
	        this.location = location;
	        this.next = null;
	    }
	}

	    private Node head;

	    public LabyrinthPath() {
	        this.head = null;
	    }

	    public void addLocation(String location) {
	        Node newNode = new Node(location);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    public void removeLastLocation() {
	        if (head == null) return;
	        if (head.next == null) {
	            head = null;
	            return;
	        }
	        Node temp = head;
	        while (temp.next.next != null) {
	            temp = temp.next;
	        }
	        temp.next = null;
	    }

	    public boolean containsLoop() {
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void printPath() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.location + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("End");
	    }
	
}
