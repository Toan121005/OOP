import java.util.Scanner;

class InvalidGPAException extends RuntimeException {
    public InvalidGPAException(String message) {
        super(message);
    }
}

class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {

        if (gpa < 0) {
            throw new InvalidGPAException("Error: GPA can not be negative number");
        }
        this.name = name;
        this.gpa = gpa;
    }

    public void register() {
        if (gpa < 2.0) {
            throw new InvalidGPAException("failed register: your GPA is" + gpa);
        }
        System.out.println("Success register" + name);
    }
}

public class ExceptionMain {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.print("enter your gpa: ");
        double gpa = sc.nextDouble();

        try {
            Student student = new Student(name, gpa);
            student.register();
        } catch (InvalidGPAException e) {
            System.err.println(e.getMessage());
        }
    }
}