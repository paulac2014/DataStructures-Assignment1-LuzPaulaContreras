# DataStructuresAdventure: Indiana Jones and the Template of Infinite Recursions
Author
**Name: Luz Paula Contreras Murcia
**Student ID: C0912404

## Overview
This project implements five data structure-based challenges inspired by "Indiana Jones and the Template of Infinite Recursions." Each challenge is designed to test fundamental data structures and algorithms, with a focus on arrays, linked lists, stacks, queues, and binary trees. 

## Coding Challenges

### The Array Artifact (ArtifactVault)

-**Description:** This challenge involves implementing an array-based vault to store artifacts. The vault allows adding, removing, and searching artifacts using both linear and binary search techniques.
-**Approach:** I implemented the ArtifactVault class, utilizing an array to store artifacts. The linear search was straightforward, and for binary search, I assumed the array would be sorted. I handled null values when artifacts are removed and ensured proper array shifting after deletions.
-**Assumptions:**
The array has a fixed size, and elements are added in sequence until the vault is full.
The array must be kept sorted for binary search to work.
Artifacts can be removed by name, and the array will be re-organized after removal.

###The Linked List Labyrinth (LabyrinthPath)

-**Description:** This challenge focuses on a singly linked list that represents a path in a labyrinth. Locations can be added, removed, and the path can be checked for loops.
-**Approach:** I implemented the LabyrinthPath class with nodes representing locations. Adding and removing nodes were handled using the traditional linked list operations. For detecting loops, I used Floyd's Cycle Detection Algorithm.
-**Assumptions:**
A singly linked list is sufficient to represent the path.
The containsLoop method assumes the possibility of a circular reference in the list.

###The Stack of Ancient Texts (ScrollStack)

-**Description:** This challenge requires implementing a stack to manage scrolls. The stack supports standard stack operations, including push, pop, and peek, and allows checking for a specific scroll.
-**Approach:** I implemented the ScrollStack class using a dynamic array internally to manage the stack. All stack operations followed the LIFO (Last In, First Out) principle.
-**Assumptions:**
The stack size can grow dynamically as scrolls are added.
Stack operations should perform in constant time, with contains being an O(n) operation.

###The Queue of Explorers (ExplorerQueue)

-**Description:** This challenge involves implementing a circular queue to manage a line of explorers entering the temple. The queue supports enqueue, dequeue, and peek operations, as well as checks for full or empty status.
-**Approach:** I used a circular queue implementation, where both front and rear pointers are adjusted using modular arithmetic to wrap around the queue array.
-**Assumptions:**
The queue has a fixed size.
The queue operates in a circular manner, wrapping around when the rear reaches the end of the array.

###The Binary Tree of Clues (ClueTree)

-**Description:** This challenge focuses on a binary tree structure to store clues. The binary tree supports insertion, search, and traversal methods, as well as counting the total number of clues.
-**Approach:** I implemented a binary search tree (BST) where each node contains a clue. The tree allows standard operations like insertion and search, and I implemented in-order, pre-order, and post-order traversal methods for tree exploration.
-**Assumptions:**
The tree is a binary search tree (BST), meaning clues are inserted in sorted order based on their natural lexicographical comparison.
Traversal operations return the clues in the respective traversal order.

##Assumptions and Design Decisions

-**Data Structures:** I opted to use traditional data structures (arrays, linked lists, stacks, queues, and binary trees) for simplicity and efficiency. Each data structure is tailored to the specific needs of the challenge.
-**Error Handling:** I assumed that invalid operations (e.g., trying to dequeue from an empty queue) would be handled gracefully, either by returning default values (e.g., null) or printing error messages.
-**Sorting:** For the ArtifactVault, I assumed that artifacts would be manually sorted before using binary search, as sorting was not specified as part of the assignment.

#How to Run the Code

## Prerequisites
Java Development Kit (JDK) 8 or later.
A Java IDE (IntelliJ IDEA, Eclipse, Theia) or a text editor with Java support.

##Compilation
###Using an IDE:
- Open your preferred IDE and import the project.
- Find the Main class, and run it directly from the IDE.

###Using Command Line:
- Navigate to the src/ directory and compile the Java files:
javac indiana/Main.java indiana/ArtifactVault.java indiana/LabyrinthPath.java indiana/ScrollStack.java indiana/ExplorerQueue.java indiana/ClueTree.java

- Run the program:
java indiana.Main

###Example Output
=== Testing ArtifactVault ===
Linear Search for 'Crystal Skull': 1
Binary Search for 'Holy Grail': 2
Linear Search after removal for 'Crystal Skull': -1

=== Testing LabyrinthPath ===
Entrance -> Cavern -> Bridge -> End
Entrance -> Cavern -> End
Loop in the path: false

=== Testing ScrollStack ===
Peek at the top scroll: Scroll of Earth
Pop the top scroll: Scroll of Earth
Contains 'Scroll of Fire': true

=== Testing ExplorerQueue ===
Next Explorer: Indiana Jones
Next Explorer after dequeue: Lara Croft
Is queue full: true
Queue is full
Next Explorer after enqueue: Lara Croft

=== Testing ClueTree ===
In-order traversal:
First Clue
Second Clue
Third Clue
Pre-order traversal:
First Clue
Second Clue
Third Clue
Post-order traversal:
Second Clue
Third Clue
First Clue
Clue found ('Second Clue'): true
Total clues in the tree: 3