public class NodeTest {
    public static void main(String[] args) {
        Node<Integer> n = new Node<>(7);
        Node<Integer> n1 = new Node<>(12, n);
        Node<Integer> n2 = new Node<>(17, n1);
        PrintListValues(n2);


    }

    public static void PrintListValues(Node<Integer> lst) {
        while (lst != null) {
            System.out.println(lst.getValue());
            lst = lst.getNext();
        }

    }
}
