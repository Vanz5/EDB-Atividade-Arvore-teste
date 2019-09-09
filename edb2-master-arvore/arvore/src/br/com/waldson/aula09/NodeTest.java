package br.com.waldson.aula09;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NodeTest {
    private Node root  = new Node("Raiz");
    private Node child1 = root.addChild("Filho 1");
    private Node child2 = root.addChild("Filho 2");


    @org.junit.Test
    public void getChildren() {
        ArrayList<Node> childrenTest = new ArrayList<>();
        childrenTest.add(child1);
        childrenTest.add(child2);
        assertEquals(root.getChildren(),childrenTest);
    }



    @org.junit.Test
    public void isLeaf() {
        assertEquals(root.isLeaf(),false);
        assertEquals(child1.isLeaf(),true);
    }

    @org.junit.Test
    public void nodeDegree() {
        assertEquals(root.nodeDegree(), 2);
    }

    @org.junit.Test
    public void isSibling() {
        assertEquals(child1.isSibling(root),false);
        assertEquals(child1.isSibling(child2),true);
    }

    /*
    @org.junit.Test
    public void treeDegree() {
    }
    //A função não esta funcionando quando existem "bisnetos do nó" como não consegui resolver o problema
    //não criei os testes, apesar de existir um esboço do teste no main
     */

    @org.junit.Test
    public void addChild() {
        Node testAddChild = new Node("test");
        Node testChild1 = testAddChild.addChild("Teste Filho1");
        Node testChild2 = new Node("Teste Filho2");
        testAddChild.addChild(testChild2);
        assertEquals(testChild1.isSibling(testChild2),true);
        //Gostaria de ter feito um teste comparando o pai do node criado com o primeiro, mas não temos
        // um método de getParent() e não sabia se deviamos criar novos métodos ou apenas trabalhar com os existentes
    }

    @org.junit.Test
    public void getName() {
        assertEquals(root.getName(),"Raiz");
    }

    @org.junit.Test
    public void setName() {
        Node test = new Node("test");
        test.setName("test2");
        assertEquals(test.getName(),"test2");
    }
}