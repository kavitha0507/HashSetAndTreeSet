import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        Iterator<Integer> it = ts.iterator();
        System.out.println("TreeSet using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());

        }


    }
}
