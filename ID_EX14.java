public class ID_EX14 {
    public static int sumNegative(Queue<Integer> q) {
    /*
    O(n) - the queue's length is different everytime, which
    affects the while loop times triggered everytime
    */
        Queue<Integer> q2 = new Queue<Integer>();
        int sum = 0;
        while (!q.isEmpty()) {
            if (q.head() < 0) {
                sum += q.head();
            }
            q2.insert(q.remove());
        }
        while (!q2.isEmpty()) {
            q.insert(q2.remove());
        }
        return sum;


    }

    public static int sumEvenLocation(Queue<Integer> q) {
        /*
        O(n) - the queue's length is different everytime, which
        affects the while loop times triggered everytime
        */
        int sum = 0;
        int counter = 0;
        Queue<Integer> q2 = new Queue<Integer>();
        while (!q.isEmpty()) {
            if (counter % 2 == 1) {
                sum += q.head();
            }
            counter++;
            q2.insert(q.remove());
        }
        while (!q2.isEmpty()) {
            q.insert(q2.remove());
        }
        return sum;
    }

    public static void positiveFirst(Queue<Integer> q) {
            /*
                O(n) - the queue's length is different everytime, which
                affects the while loop times triggered everytime
             */
        Queue<Integer> z = new Queue<Integer>();
        Queue<Integer> b = new Queue<Integer>();
        while (!q.isEmpty()) {
            if (q.head() > 0) {
                z.insert(q.head());
            } else {
                b.insert(q.head());
            }
            q.remove();
        }
        while (!b.isEmpty()) {
            z.insert(b.head());
            b.remove();
        }
        while (!z.isEmpty()) {
            q.insert(z.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.insert(-7);
        q.insert(-12);
        q.insert(3);
        q.insert(-9);
        q.insert(67);
        q.insert(29);
        System.out.println(sumNegative(q));
        System.out.println(sumEvenLocation(q));
        positiveFirst(q);
        System.out.println(q);

    }

}