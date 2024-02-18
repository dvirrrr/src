public class Classwork {
    public static void main(String[] args) {
        Queue <Integer> q = new Queue<Integer>();
        q.insert(2);
        q.insert(3);
        q.insert(1);
        q.insert(10);
        q.insert(3);
        q.insert(3);
        q.insert(2);
        q.insert(18);
        q.insert(10);
        System.out.println(q);
        resortThor(q);
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
    public static int countCapitalss(Queue <Character> q)
    {
        int count = 0;
        char value = 'a';
        q.insert(null);
        while (q.head() != null) {
            value = q.remove();
            if (value >= 'A' && value <= 'Z') {
                count++;
            }
            q.insert(value);
        }
        q.remove(); // should remove null;
        return count;
    }
    public static void upSideDown(Queue <String> q)
    {
        q.insert(null);
        int count=0;
        while (q.head() != null) {
            String value = q.remove();
            q.insert(value);
            count++;
        }
        q.remove();
        String [] thor = new String[count];
        for (int i=0; i<count; i++) {
            thor[i] = q.remove();
        }
        for (int j = count-1; j > -1; j--) {
            q.insert(thor[j]);
        }
    }
    public static void upSideDownR(Queue <String> q) {
        if(q.isEmpty()) {
            return;
        }
        else {
            String value = q.remove();
            upSideDown(q);
            q.insert(value);
        }
    }
    public static void resortThor(Queue <Integer> q) {
        q.insert(null);
        while (q.head() != null) {
            int value = q.remove();
            int count = 0;
            while (q.head() != null) {
                int value2 = q.remove();
                if (value2 == value) {
                    count++;
                }
                else {
                    q.insert(value2);
                }
            }
            while (count != 0) {
                q.insert(value);
            }
            q.remove();
            q.insert(null);
            q.insert(value);
        }
    }
}