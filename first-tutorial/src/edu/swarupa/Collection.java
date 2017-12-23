package edu.swarupa;

import java.util.ArrayList;
import java.util.Collections;
public class Collection implements Comparable {
    public static void main(String[] args)
    {

        ArrayList<String> value=new ArrayList() ;
        value.add("asd");
        value.add("asdfh");
        value.add("zxcv");
        value.add("qwerty");
        System.out.println(value);
        Collections.sort(value);
        System.out.println(value);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
