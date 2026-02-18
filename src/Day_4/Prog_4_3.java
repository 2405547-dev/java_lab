package Day_4;

class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj;

        return roll == s.roll && name.equals(s.name);
    }
}

public class Prog_4_3 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rohan");
        Student s2 = new Student(101, "Rohan");

        if (s1.equals(s2))
            System.out.println("Students are equal");
        else
            System.out.println("Students are not equal");
    }
}
