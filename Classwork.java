public class Classwork {
    public static void main(String[] args) {
        Queue <Character> q = new Queue<Character>();
        q.insert('a');
        q.insert('B');
        q.insert('d');
        q.insert('f');
        System.out.println(q);
        System.out.println(countCapitals(q));
        System.out.println(q);
    }

    public static int index3(int num) {
        int rv;
        rv = num % 10;
        if (num > 999) {
            rv *= index3(num / 1000);

        }
        return rv;
    }

    public static boolean igor(int days, double m, int k) {
        if (days == 0) {
            return (int) m > k;
        }
        return igor(days - 1, m * 1.2, k);
    }

    public static float secret(int[] a, int k) {
        float x;
        if (k == 1) {
            return a[0];
        }
        x = secret(a, k - 1) * (k - 1);
        return ((a[k - 1]+x)/k);
    }

    public static int countCapitals(Queue <Character> q)
    {
       int count = 0;
       char value = 'a';
       q.insert(null);
       while (q.head() != null) {
           value = q.remove();
           int charInt = (int)value;
           for (int i = 65; i<=90; i++) {
               if (charInt == i) {
                   count++;
               }
           }
           q.insert(value);
       }
        q.remove(); // should remove null;
        return count;
    }


}
