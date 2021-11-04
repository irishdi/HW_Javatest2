package Lesson_3;


import java.util.ArrayList;
import java.util.Arrays;

public class Box <E extends Fruit>{
    private ArrayList<E> items;

    public Box(E... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public ArrayList<E> getItems() {
        return new ArrayList<>(items);
    }

    public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (E item: items) weight += item.getWeight();
        return weight;

    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

//    public void clear() {
//        items.clear();
//    }

    public void transfer(Box<? super E> box) {
        box.items.addAll(this.items);
        System.out.println("done");
//        box.clear();

    }

}



