package edu.swarupa;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            Student student = new Student("name" + j, j);
            i++;
            System.out.println(student);
        }
        System.out.println(i);
    }
}
