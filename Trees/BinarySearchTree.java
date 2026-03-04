package Trees;

import java.util.*;
public class BinarySearchTree {
    static class Node {
        int data;
        Node left, right;

        Node(int n) {
            this.data = n;

            left = right = null;
        }
    }

    static class Bst {
        Node root;
        Node insert(Node root, int key) {
            if(root == null) {
                return new Node(key);
            }

            if(key < root.data) {
                root.left = insert(root.left, key);
            }

            else if(key > root.data) {
                root.right = insert(root.right, key);
            }

            return root;
        }

        boolean search(Node root, int key) {
            if(root == null) {
                return false;
            }

            if(root.data == key) return true;

            if(key < root.data) {
                return search(root.left, key);
            }
            else {
                return search(root.right, key);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bst b = new Bst();

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int val = sc.nextInt();
            b.root = b.insert(b.root, val);
        }
        int key = sc.nextInt();

        boolean found = b.search(b.root, key);

        if(found) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
