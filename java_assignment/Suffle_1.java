import java.util.*;

public class Suffle_1{

    public static void main(String args[])
    {
        List<Integer> list  = new ArrayList<>();
            for(int i=1;i<=7;i++)
            {
                list.add(i);
            }

            Collections.shuffle(list);

            for(int number:list)
            {
                System.out.print(number + " ");
            }


    }
}