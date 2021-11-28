package Lesson_9_HW;

public class Course {
    private final String courseName;

    public Course(String courseName){
        this.courseName = courseName;

    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString(){
        return "Course {" + "courseName '" + courseName + '\'' + '}';
    }


}
