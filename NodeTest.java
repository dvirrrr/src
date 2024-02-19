public class NodeTest {
    public static void main(String[] args) {
        /*
        Node<Integer> n = new Node<>(7);
        Node<Integer> n1 = new Node<>(12, n);
        Node<Integer> n2 = new Node<>(17, n1);
        PrintListValuesBackR(n2);
        */
        Node<String> n = new Node<>("lebron");
        Node<String> n1 = new Node<>("antetokounmpo", n);
        Node<String> n2 = new Node<>("west", n1);
        System.out.println(LongestStringR(n2));

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
    public static String LongestStringR(Node <String> lst) {
        if (!lst.hasNext()) {
            return lst.getValue();
        } else {
            String rv = LongestStringR(lst.getNext());
            if (rv.length() > lst.getValue().length()) {
                return rv;
            } else {
                return lst.getValue();
            }

        }
    }
    public static int Sidra(Node <Integer> lst) {
        int count = 1;
        int rvCount = 0;
        while (lst.getValue() != null) {
            boolean check = lst.getValue() > lst.getNext().getValue();
            if (check) {
                while (check) {
                    count++;
                }
            }
            if (!check) {
                while (!check) {
                    count++;
                }
            }
            if (count >= 3) {
                rvCount++;
            }

        }
        return rvCount;
    }
}
