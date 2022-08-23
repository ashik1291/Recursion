package com.recursionPractice;

public class HeightOfBinaryTree {
    Node root;
    HeightOfBinaryTree(){ root = null;}
    public void insertNode(int value){
        root = insertNodeRec(root, value);
    }

    private Node insertNodeRec(Node currentNode, int value){
        if(currentNode == null) return new Node(value);

        if(value < currentNode.value)
            currentNode.leftNode = insertNodeRec(currentNode.leftNode, value);
        else if(value > currentNode.value)
            currentNode.rightNode  = insertNodeRec(currentNode.rightNode, value);
        else
            return currentNode;

        return currentNode;
    }

    public void height(){
        System.out.println(heightRec(root));
    }

    private int heightRec(Node currentNode){
        if(currentNode == null) return 0;

       int leftHeight =  heightRec(currentNode.leftNode);
       int rightHeight = heightRec(currentNode.rightNode);

       return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String[] args) {
        var binaryTree = new HeightOfBinaryTree();

        binaryTree.insertNode(70);
        binaryTree.insertNode(6);
        binaryTree.insertNode(20);
        binaryTree.insertNode(10);
        binaryTree.insertNode(30);

        binaryTree.height();
    }
}
