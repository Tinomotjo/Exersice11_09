package Exersice11_9;

import java.util.HashSet;
import java.util.Set;

/*
 Write a method hasEven that accepts a set of integers as a parameter and returns
 true if the set contains at least one even integer and false otherwise.
 If passed the empty set, your method should return false.
 */
public class Run
{

    public static void main(String[] args)
    {
        Set<Integer> list1 = new HashSet<>();
        list1.add(1);
        list1.add(102);

        System.out.println(hasEven(list1));

    }

    public static boolean hasEven(Set<Integer> list)
    {

        for (int i : list)
        {
            if (i % 2 == 0)
            {
                return true;

            }
        }
        return false;
    }
}
