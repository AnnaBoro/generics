package lesson7_10.generics;


public class BoxDemo {

    public static void main(String[] args) {

        Box<Bird> birds = new Box<Bird>();
        Bird bird1= new Eagle();
        bird1.setName("eagle");
        Bird bird2 = new Duck();
        bird2.setName("duck");
        birds.addBird(bird1);
        birds.addBird(bird2);

        for (Bird b : birds.getBirdsList()) {
            System.out.println(b.toString());
        }
    }
}
