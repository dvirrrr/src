public class NodeTest {
    public static void main(String[] args) {
        Node<Integer> n = new Node<>(4);
        Node<Integer> n1 = new Node<>(3, n);
        Node<Integer> n2 = new Node<>(2, n1);
        Node<Integer> n3 = new Node<>(1, n2);
        /*
        Node <Integer> n4 = new Node<>(9, n3);
        Node <Integer> n5 = new Node<>(7, n4);
        Node <Integer> n6 = new Node<>(8, n5);
        Node <Integer> n7 = new Node<>(9, n6);
        Node <Integer> n8 = new Node<>(10, n7);
        Node <Integer> n9 = new Node<>(7, n8);
        Node <Integer> n10 = new Node<>(5, n9);
        Node <Integer> n11 = new Node<>(2, n10);
        Node <Integer> n12 = new Node<>(1, n11);
        */
        PrintListValues(n3);
        reverse(n3);
        System.out.println("-----------");
        PrintListValues(n3);
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
        } else {
            System.out.println(lst.getValue());
            PrintListValuesR(lst.getNext());
        }
    }

    public static void PrintListValuesBackR(Node<Integer> lst) {
        if (lst == null) {
            return;
        } else {
            PrintListValuesBackR(lst.getNext());
            System.out.println(lst.getValue());
        }
    }

    public static String LongestStringR(Node<String> lst) {
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

    public static int SidraAmir(Node<Integer> lst) {
        int rv = 0;
        Integer first = -99, second = -99;
        boolean isGood = true;
        int last = 0;
        while (lst != null) {
            if (first == -99)
                // set first
                first = lst.getValue();
            else if (second == -99) {
                // set second
                second = lst.getValue();
            } else {
                // first and second are set

                if (lst.getValue() == -99) {
                    // we reached end of sequence
                    if (isGood)
                        rv++;

                    isGood = true;
                    first = second = -99;
                } else {
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

    public static void sod(Node<Integer> n) {
        if (n == null || !n.hasNext()) {
            return;
        }
        Node<Integer> p = n.getNext();
        n.setNext(p.getNext());
        p.setNext(null);
        sod(n.getNext());
    }

    public static Node<Integer> addFirstNode(int x, Node<Integer> lst) {
        Node<Integer> newNode = new Node<Integer>(x);
        newNode.setNext(lst);
        lst = newNode;
        return newNode;
    }

    public static double avgList(Node<Integer> lst) {
        double total = 0;
        double counter = 0;
        while (lst != null) {
            total += lst.getValue();
            counter++;
            lst = lst.getNext();
        }
        double avg = total / counter;
        return avg;

    }

    public static Node<Integer> shigra(Node<Integer> lst) {
        double avg = avgList(lst);
        while (lst.getValue() > avg) {
            lst = lst.getNext();
        }
        Node<Integer> n = new Node<Integer>(lst.getValue());
        while (lst != null) {
            if (lst.getValue() < avg) {
                n = addFirstNode(lst.getValue(), n);
            }
        }
        return n;
    }

    public static int zeroes(int num) {
        if (num == 0) {
            return 1;
        } else if (num < 0) {
            return zeroes(-num);
        } else if (num < 10) {
            return 0;
        } else {
            if (num % 10 == 0) {
                return zeroes(num / 10) + 1;
            } else {
                return zeroes(num / 10);
            }
        }
    }

    public static void doubleList(Node<Integer> lst) {
        while (lst.hasNext()) {
            int val = lst.getValue();
            Node<Integer> n = new Node<>(val);
            n.setNext(lst.getNext());
            lst.setNext(n);
            lst = lst.getNext().getNext();
        }
    }
    public static Node <Integer> reverse(Node <Integer> lst) {
        // until lastnode
        Node <Integer> rv;
        Node <Integer> n;
        if (lst.hasNext()) {
            rv = reverse(lst.getNext());
            n = new Node<>(lst.getValue());
            rv.setNext(n);
            return rv.getNext();
        }
        else {
            rv = new Node<>(lst.getValue());
            return rv;
        }




    }

}

