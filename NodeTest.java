public class NodeTest {
    public static void main(String[] args) {

        Node <Integer> n = new Node<>(2);
        Node <Integer> n1 = new Node<>(3, n);
        Node <Integer> n2 = new Node<>(6, n1);
        Node <Integer> n3 = new Node<>(7, n2);
        Node <Integer> n4 = new Node<>(-99, n3);
        Node <Integer> n5 = new Node<>(7, n4);
        Node <Integer> n6 = new Node<>(8, n5);
        Node <Integer> n7 = new Node<>(9, n6);
        Node <Integer> n8 = new Node<>(10, n7);
        Node <Integer> n9 = new Node<>(-99, n8);
        Node <Integer> n10 = new Node<>(5, n9);
        Node <Integer> n11 = new Node<>(2, n10);
        Node <Integer> n12 = new Node<>(1, n11);
        System.out.println(SidraAmir(n12));


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

    public static int SidraAmir(Node <Integer> lst) {
        int rv = 0;
        Integer first = -99, second = -99;
        boolean isGood = true;
        int last = 0;
        while(lst !=null) {
            if (first == -99)
                // set first
                first = lst.getValue();
            else
                if (second == -99) {
                    // set second
                    second = lst.getValue();
                }

                else {
                    // first and second are set

                    if (lst.getValue() == -99) {
                        // we reached end of sequence
                        if (isGood)
                            rv++;

                        isGood = true;
                        first = second = -99;
                    }
                    else {
                        // within the sequence
                        if ((second - first) * (lst.getValue() - last) < 0) {
                            // change of direction
                            isGood = false;
                        }
                    }
                }
            last = lst.getValue();
            lst = lst.getNext();

        }

        if (isGood)
            rv++;

        return rv;
    }

    public static int Sidra(Node <Integer> lst) {
        int count = 1;
        int rvCount = 0;
        while (lst.getValue() != null) {
            boolean check = lst.getValue() > lst.getNext().getValue();
            boolean oppCheck = lst.getValue() < lst.getNext().getValue();
            if (check) {
                check = lst.getValue() > lst.getNext().getValue();
                while (check) {
                    count++;
                    check = lst.getValue() > lst.getNext().getValue();
                }
            }
            if (oppCheck) {
                oppCheck = lst.getValue() > lst.getNext().getValue();
                while (oppCheck) {
                    count++;
                    oppCheck = lst.getValue() > lst.getNext().getValue();
                }
            }
            if (count >= 3) {
                rvCount++;
            }
            count = 1;
        }
        return rvCount;
    }
}
