class Student {
    int marks;

    boolean checkPass(int marks) {
        if (marks >= 40)
            return true;

        return false;
    }
}

public class ControlStm {
    int findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                return a;
            else
                return b;
        } else {
            if (b > c)
                return b;
            else
                return c;
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        boolean result = student.checkPass(45);
        if (result == true)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        ControlStm Max = new ControlStm();
        int max = Max.findMax(10, 20, 30);
        System.out.println(max);

        char c = 'c';

        switch (c) {
            case 'a':
                System.out.println("Hi i'm a");
                break;
            case 'b':
                System.out.println("hi i'm b");
                break;
            case 'c':
                System.out.println("hi i'm c");
                break;
            default:
                System.out.println("Invalid");
                break;

        }

    }

}
