/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kb;

/**
 *
 * @author U53R
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchExample {

    private Queue<Node> queue;
    static ArrayList<Node> nodes = new ArrayList<Node>();

    static class Node {

        int data;
        boolean visited;

        Node(int data) {
            this.data = data;

        }
    }

    public BreadthFirstSearchExample() {
        queue = new LinkedList<Node>();
    }

 // find neighbors of node using adjacency matrix
    // if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
    public ArrayList<Node> findNeighbours(int adjacency_matrix[][], Node x) {
        int nodeIndex = -1;

        ArrayList<Node> neighbours = new ArrayList<Node>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(x)) {
                nodeIndex = i;
                break;
            }
        }

        if (nodeIndex != -1) {
            for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
                if (adjacency_matrix[nodeIndex][j] == 1) {
                    neighbours.add(nodes.get(j));
                }
            }
        }
        return neighbours;
    }

    public void bfs(int adjacency_matrix[][], Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {

            Node element = queue.remove();
            System.out.print(element.data + "\t");
            ArrayList<Node> neighbours = findNeighbours(adjacency_matrix, element);
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;

                }
            }

        }
    }

    public static void main(String arg[]) {

        Node node1 = new Node(40);
        Node node2 = new Node(10);
        Node node3 = new Node(20);
        Node node4 = new Node(30);
        Node node5 = new Node(60);
        Node node6 = new Node(50);
        Node node7 = new Node(70);

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        int adjacency_matrix[][] = {
            {0, 1, 1, 0, 0, 0, 0}, // Node 1: 40
            {0, 0, 0, 1, 0, 0, 0}, // Node 2 :10
            {0, 1, 0, 1, 1, 1, 0}, // Node 3: 20
            {0, 0, 0, 0, 1, 0, 0}, // Node 4: 30
            {0, 0, 0, 0, 0, 0, 1}, // Node 5: 60
            {0, 0, 0, 0, 0, 0, 1}, // Node 6: 50
            {0, 0, 0, 0, 0, 0, 0}, // Node 7: 70
        };
        System.out.println("The BFS of the graph is ");
        BreadthFirstSearchExample bfsExample = new BreadthFirstSearchExample();
        bfsExample.bfs(adjacency_matrix, node1);

    }
}
