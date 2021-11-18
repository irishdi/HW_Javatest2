package Lesson_9.HW;

import com.sun.istack.internal.NotNull;

import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private List<Course> courseList;

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public Student (String name, List<Course> courseList){
        this.name = name;
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseList=" + courseList.toArray().toString() +
                '}';
    }

    @Override
    public int hashCode(){
        return 0;
    }
    @Override
    public int compareTo(@NotNull Student o) {
        return o.getCourseList().size() - this.getCourseList().size();
    }
}
