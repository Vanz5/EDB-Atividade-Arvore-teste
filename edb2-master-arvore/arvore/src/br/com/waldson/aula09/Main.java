package br.com.waldson.aula09;
public class Main {

    public static void main(String[] args) {
        Node root  = new Node("Raiz");
        Node child = root.addChild("Filho 1");

        Node child2 = new Node("Filho 2");
        root.addChild(child2);

        child.addChild(new Node("Neto 1"));

        System.out.println("Chamada 1, Grau esperado = 2");
        System.out.println("Grau da arvore: "+root.treeDegree());


        Node child4 = child.addChild("Neto 2");
        Node child5 = child.addChild("Neto 3");
        Node child6 = child.addChild("Neto 4");

        System.out.println("Chamada 2, Grau esperado = 4");
        System.out.println("Grau da arvore: "+child.treeDegree());

        System.out.println("Chamada 3, Grau esperado = 4");
        System.out.println("Grau da arvore: "+root.treeDegree());

        Node gchild1 = child4.addChild("Bisneto 1");
        Node gchild2 = child4.addChild("Bisneto 2");
        Node gchild3 = child4.addChild("Bisneto 3");
        Node gchild4 = child4.addChild("Bisneto 4");
        Node gchild5 = child4.addChild("Bisneto 5");

        System.out.println("Chamada 4, Grau esperado = 5");
        System.out.println("Grau da arvore: "+root.treeDegree());

        System.out.println("Chamada 5, , Grau esperado = 5");
        System.out.println("Grau da arvore: "+child.treeDegree());

    }
}
