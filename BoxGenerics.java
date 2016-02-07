package lesson7_10.generics;


import java.util.ArrayList;
import java.util.List;

public class BoxGenerics<T>{

    private List<T> birdsList;

    public BoxGenerics() {

        birdsList = new ArrayList<T>();
    }

    public T getBird(int birdIndex) {

        return birdsList.get(birdIndex);
    }

    public List<T> getBirdsList() {

        return birdsList;
    }

    public void addBird(T bird) {

        birdsList.add(bird);
    }

    public void removeBird(T bird) {

        birdsList.remove(bird);
    }
}
