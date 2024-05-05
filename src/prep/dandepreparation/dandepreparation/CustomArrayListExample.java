package dandepreparation;


public class CustomArrayListExample {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);

        System.out.println("Size after removal: " + list.size());
    }
}