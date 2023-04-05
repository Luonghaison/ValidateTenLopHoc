import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassNameValidator validator = new ClassNameValidator();

        System.out.println("Nhap vao class name");
        String className = new Scanner(System.in).nextLine();
        System.out.println(className);
        //kiem tra hop le
        System.out.println(validator.validate(className));
    }
}