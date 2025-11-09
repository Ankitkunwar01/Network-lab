class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        Student s = (Student)o;
        return this.id == s.id && this.name.equals(s.name);
    }

    public int hashCode() {
        return id + name.hashCode();
    }

    public String toString() {
        return id + " " + name;
    }
}

public class thirteen {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sharad");
        Student s2 = new Student(1, "Ankit");

        System.out.println("Equal? " + s1.equals(s2));
        System.out.println("hashCode1: " + s1.hashCode());
        System.out.println("toString: " + s1.toString());
        System.out.println("hashCode2: " + s2.hashCode());
        System.out.println("toString: " + s2.toString());

    }
}
