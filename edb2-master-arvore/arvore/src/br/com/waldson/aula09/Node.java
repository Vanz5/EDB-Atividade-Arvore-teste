package br.com.waldson.aula09;

import java.util.ArrayList;
import java.util.Iterator;

public class Node {

    private ArrayList<Node> children;
    private String name;
    private Node parent = null;

    public Node(String name) {
        this.name = name;
        children  = new ArrayList<>();
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    public int nodeDegree() {
        return children.size();
    }

    public boolean isSibling(Node other) {
        if (other == null) {
            return false;
        }
        return this.parent == other.parent;
    }

    private int treeDegree = 1;

    public int treeDegree() {
        if (treeDegree<this.nodeDegree()){
            treeDegree = this.nodeDegree();
        }
        for (Node n: children) {
            n.treeDegree();
            if (treeDegree<n.nodeDegree()){
                treeDegree = n.nodeDegree();
            }
        }
        return treeDegree;
    }

    public Node addChild(String s) {
        Node node = new Node(s);
        return addChild(node);
    }

    public Node addChild(Node node) {
        children.add(node);
        node.parent = this;
        return node;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





































































































