package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.Student;
import src.com.vivamostoles.homework03.service.*;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetCreator {
    public static TreeSet<Student> generation(int numberOfStudentToCreate){
        TreeSet<Student> students = new TreeSet<Student>();
        String [] studentFirstName = StudentsInfo.firstNames;
        String [] studentLastName = StudentsInfo.lastNames;
        String [] studentDepartmentOfStudy = StudentsInfo.department;
        String [] studentNativeCity = StudentsInfo.nativeCity;
        for (int i = 0; i <numberOfStudentToCreate; i++){
            int randomValueOfFirstName = new Random().nextInt(studentFirstName.length);
            int randomValueOfLastName = new Random().nextInt(studentLastName.length);
            int randomValueOfDepartmentOfStudy = new Random().nextInt(studentDepartmentOfStudy.length);
            int randomValueOfNativeCity = new Random().nextInt(studentNativeCity.length);
            Student asd = new Student("sad","dasd","dasdsa", "asdsa");
            Student asasd = new Student("adassad","qwdasd","dvxcasdsa", "asdfesa");
          /*  Student studentFromGenerator = new Student(studentFirstName[randomValueOfFirstName],
                    studentLastName[randomValueOfLastName], studentDepartmentOfStudy[randomValueOfDepartmentOfStudy],
                    studentNativeCity[randomValueOfNativeCity]);
            students.add(studentFromGenerator);*/
            students.add(asd);
            students.add(asasd);

            System.out.println(students);
        }
        return students;

    }}


