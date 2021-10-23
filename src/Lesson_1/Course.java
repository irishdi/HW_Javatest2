package Lesson_1;

public class Course {

    public int[] course = {100,200,300,100};

//    public int[] getCourse() {
//        return course;
//    }
    //Прохождение дистанции
    public void doIt(Team[] teams){
        for (Team team : teams) {
            if (team.onDistance) {
                System.out.println(team.getNameMember());
            }
        }
    }

    //Результаты всей команды
    public void showResults(Team[] teams) {
        double result = 0;
        double total = 0;
        for (int i = 0; i < course.length; i++) {
            for (Team team : teams) {
                if (team.onDistance);
                result = course[i] / teams[i].getSpeed();
            }
            System.out.println(teams[i].getNameMember() + " runs distance at " + result + " sec");
            total += result;
        }
        System.out.println("**********");
        System.out.println("Team runs totally at " + total + " sec");
    }


}
