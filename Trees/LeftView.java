package Trees;

import java.util.*;
public class LeftView {
    static class Node {
        int data;
        Node left, right;
        
        Node(int n) {
            data = n;
        }
    }

    static void leftView(Node root) {
        if(root == null)
	        return;
    
        Queue<Node> q = new LinkedList<>();
        q.add(root);
   
        while(!q.isEmpty()) {
	        int size = q.size();
      
            for(int i=0; i<size; i++) {
                Node curr = q.poll();

                if(i == 0) 
                    System.out.println(curr.data+" ");

                if(curr.left != null)
                    q.add(curr.left);

                if(curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        leftView(root);
    }
}
