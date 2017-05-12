package ConstructorChapter;

/**
 * Created by Mihnea on 06.05.2017.
 */
public class Flower {
    int petalCount=0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = "+petalCount);
    }
    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = "+ss);
        s=ss;
    }
    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
    }
    void printPetalCount() {
        System.out.println("petalCount = "+petalCount+" s = "+s);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        System.out.println();
        Flower flower1 = new Flower(100);
        System.out.println();
        Flower flower2 = new Flower("hello");
        System.out.println();
        flower.printPetalCount();
        flower1.printPetalCount();
        flower2.printPetalCount();
    }
}
