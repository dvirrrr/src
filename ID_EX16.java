public class ID_EX16 {
    public static int countNegativesR(Queue<Integer> q) {
        if (!q.isEmpty()) {
            if (q.remove() < 0) {
                return countNegativesR(q) + 1;
            } else {
                return countNegativesR(q);
            }
        }

        return 0;
    }
    public static int sumEvensR(Queue<Integer> q)
    {
       q.insert(null);
       return sumEvensRR(q);
    }

    public static int sumEvensRR(Queue<Integer> q) {
        int rv = 0;
        int sum = 0;
        int i;
        if (q.head() != null) {
            i = q.remove();
            if (i % 2 == 0) {
                sum += i;
            }
            q.insert(i);
            rv = sum + sumEvensRR(q);
        }
        else {
            q.remove();
        }
        return rv;
    }

    public static void reverseR(Queue <String> q) {
        if (!q.isEmpty()) {
            String value = q.remove();
            reverseR(q);
            q.insert(value);
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        Queue<String> q2 = new Queue<>();
        q2.insert("Amir");
        q2.insert("Shachal");
        q2.insert("Best");
        q2.insert("Teacher");
        System.out.println(q2);
        reverseR(q2);
        System.out.println(q2);

        q.insert(-7);
        q.insert(-12);
        q.insert(24);
        q.insert(-9);
        q.insert(67);
        q.insert(-29);
        System.out.println(sumEvensR(q));
        //System.out.println(countNegativesR(q));
    }
}
