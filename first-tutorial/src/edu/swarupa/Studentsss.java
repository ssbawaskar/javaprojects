package edu.swarupa;

public class Studentsss implements Comparable<Studentsss> {
    String name;
    int rollno;

    public String getname() {
        return name;
    }

    public int getrollno() {
        return rollno;
    }

    public void set(String s, int n) {
        name = s;
        rollno = n;
    }

    public void Display() {
        System.out.println(name + "  " + rollno);
    }


    public static void main(String[] args) {

        Studentsss[] obj = new Studentsss[3];
        obj[0] = new Studentsss();
        obj[1] = new Studentsss();
        obj[2] = new Studentsss();


        obj[0].set("swara", 12);
        obj[1].set("asdf", 234);
        obj[2].set("werty", 2345);
        for (int i = 0; i < 3; i++) {
            obj[i].Display();
        }
        System.out.println(obj[1].compareTo(obj[2]));
    }


    @Override
    public int compareTo(Studentsss studentsss) {
        return this.name.compareTo(studentsss.name);
    }

}
