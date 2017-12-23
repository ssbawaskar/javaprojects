package edu.swarupa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Why this class?
 */
public class M {
    /**
     * No logic in main function.
     *
     * @param args
     */
    public static void main(String[] args) {
        tutorialMethod();
    }

    /**
     * This method represents actual tutorial.
     */
    private static void tutorialMethod() {
        List<Integer> a = new ArrayList();
        // a.addAll(12,23,34,56,57,32,79,43,47,76);
        //int[] marks={12,23,34,56,57,32,79,43,47,76};
        //int x= 0;
        for (int j = 91; j < 100; j++) {
            a.add(j);
        }

        Iterator<Integer> i = a.iterator();
        int x = i.next();
        while (i.hasNext()) {
            if (x < i.next()) {
                x = i.next();
            }
            //System.out.println(i.next());
        }
        System.out.println(x);
    }
}

