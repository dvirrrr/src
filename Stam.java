public class Stam
{
    public static void q1q2() {
        Queue<Integer> q1 = new Queue<Integer>();
        Queue<Integer> q2 = new Queue<Integer>();

        q1.insert(17);
        q1.insert(-7);
        q2.insert(q1.head());
        q1.insert(q1.remove() + q1.remove());
        if (q1.isEmpty())
        {
            q1.insert(5);
        }
        else
        {
            q2.insert(123);
        }
        System.out.println(q1);
        System.out.println(q2);
    }
    public static void main(String[] args)
    {
        q1q2();
    }
}

