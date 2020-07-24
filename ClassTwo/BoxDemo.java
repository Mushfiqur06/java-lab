class Box {
    int length, height, width;
}

public class BoxDemo {
    public static void main(String[] aStrings) {
        Box box1 = new Box();
        box1.length = 5;

        Box box2 = box1;
        System.out.println("Box One " + box1);
        System.out.println(box2.length);
    }
}