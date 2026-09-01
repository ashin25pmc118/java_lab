class Student {
    void displayStudent() {
        System.out.println("Student Class");
    }
}

class Teacher {
    void displayTeacher() {
        System.out.println("Teacher Class");
    }
}

public class MultipleClasses {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.displayStudent();
        t.displayTeacher();
    }
}