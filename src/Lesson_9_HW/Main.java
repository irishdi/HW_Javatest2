package Lesson_9_HW;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Alex", Arrays.asList(new Course("English"), new Course("Greek"), new Course("Spanish"))));
    studentList.add(new Student("John", Arrays.asList(new Course("French"), new Course("German"))));
    studentList.add(new Student("Mary", Arrays.asList(new Course("English"), new Course("Norwegian"), new Course("Polish"), new Course("Dutch") )));
    studentList.add(new Student("Michael", Arrays.asList(new Course("Hungarian"), new Course("Swedish"), new Course("Finish"), new Course("Russian"))));

        //System.out.println(Arrays.asList(studentList));
        System.out.println("Unique Courses: " + getUniqueCourses(studentList));
        System.out.println("The most inquisitive student: " + getMostInquisitiveStudent(studentList));
        Course checkCourse = new Course("English");
        System.out.println("Students taking "+ checkCourse.getCourseName() + " course: " + getCheckCourseStudents(studentList, checkCourse));
    }
    public static List<String> getUniqueCourses (List<Student> studentList){
        return studentList.stream()
                .map(Student::getCourseList)
                .flatMap(Collection::stream)
                .map(Course::getCourseName)
                .distinct()
                .collect(Collectors.toList());

    }

    public static List<String> getMostInquisitiveStudent(List<Student> studentList){
        return studentList.stream()
                .sorted()
                .limit(3)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getCheckCourseStudents (List<Student> studentList, Course checkCourse){
        return studentList.stream()
                .filter(student -> student.getCourseList().toString().contains(checkCourse.getCourseName()))
                .map(Student::getName)
                .collect(Collectors.toList());
    }
}
