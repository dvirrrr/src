public class NodeTest {
    public static void main(String[] args) {
        Node<Integer> n = new Node<>(7);
        Node<Integer> n1 = new Node<>(12, n);
        Node<Integer> n2 = new Node<>(17, n1);
        PrintListValuesBackR(n2);


    }

    public static void PrintListValues(Node<Integer> lst) {
        while (lst != null) {
            System.out.println(lst.getValue());
            lst = lst.getNext();
        }
    }
    public static void PrintListValuesR(Node<Integer> lst) {
        if (lst == null) {
            return;
        }
        else {
            System.out.println(lst.getValue());
            PrintListValuesR(lst.getNext());
        }
    }
    public static void PrintListValuesBackR(Node<Integer> lst) {
        if (lst == null) {
            return;
        }
        else {
            PrintListValuesBackR(lst.getNext());
            System.out.println(lst.getValue());
        }
    }
}
