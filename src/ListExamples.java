import java.util.ArrayList;

/**
 * Created by joris on 30.03.17.
 */
public class ListExamples {

    public static void main(String[] args) {
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.add(5);
        numberlist.add(7);
        numberlist.add(3);
        numberlist.add(2);
        numberlist.add(10);
        numberlist.add(11);
        numberlist.add(15);


        numberlist.sort((a,b) -> b.compareTo(a));


        System.out.println(numberlist);
    }
}
