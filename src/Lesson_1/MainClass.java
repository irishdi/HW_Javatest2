package Lesson_1;


public class MainClass {
    public static void main(String[] args) {
        String teamName = "The Best";
        System.out.println("Team name: " + "*" + teamName + "*");

        Team[] teams = new Team[4];
        teams[0] = new Team(1, "James", 100, 2, true);
        teams[1] = new Team(2, "John", 100, 2, true);
        teams[2] = new Team(3, "Tom", 200, 2, false);
        teams[3] = new Team(4, "Michael", 200, 2, true);

        Course c = new Course();

        System.out.println("All team members: ");
        getAllTeam(teams);
        System.out.println("****************");
        System.out.println("Run the distances:");
        c.doIt(teams);
        System.out.println("****************");
        System.out.println("Team member's results: ");
        c.showResults(teams);
    }

//     Вывод информации о всех членах команды
    public static void getAllTeam (Team[] teams){
        for (Team team : teams) System.out.println(team.getInfo());
    }

}
