import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RunMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Luu danh sach Student o day
            List<Student> studentList = new ArrayList<>();

            String next;
            do {
                //Nhap mot Student
                Student student = new Student();
                student.inputStudent();

                //Dua Student moi nhap vao danh sach
                studentList.add(student);

                //Bat nguoi dung nhap Y hoac N
                do {
                    System.out.print("Enter a next Student(Y/N)?: ");
                    next = scanner.next().trim();
                    next = next.toLowerCase();
                } while ((!next.equals("y")) && (!next.equals("n")));


            } while (next.equals("y"));

            for (Student student : studentList)
                student.printStudent();

            for (Student student : studentList)
                System.out.println(student);
    }
}
