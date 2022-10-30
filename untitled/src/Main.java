import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main implements test{

    public static void main(String ... args) {
        List<Integer> s1 = new ArrayList<Integer>();
        s1.add(5);
        s1.add(8);
        s1.add(1,2);
        List <Integer> s2 = new ArrayList<Integer>(s1.subList(1,2));
        s1.addAll(s2);
        System.out.println(s1);
    }

    @Override
    public int getN(int a) {
        return n*a;
    }
}