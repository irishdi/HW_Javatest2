package Lesson_1;

public class Team {
    int id;
    public String nameMember;
    int maxDistance;
    public float speed;
    boolean onDistance;

    //Конструктор команды
    public Team(int id, String nameMember, int maxDistance, float speed, boolean onDistance) {
        this.id = id;
        this.nameMember = nameMember;
        this.maxDistance = maxDistance;
        this.speed = speed;
        this.onDistance = onDistance;

    }


    //Метод getInfo
    String getInfo() {
        return this.id + "." + this.nameMember + "- speed " + this.speed + " m/s";
    }

    //Геттер
    public String getNameMember() {
        return this.nameMember;
    }

    public float getSpeed() {
        return this.speed;
    }


}
