public class ClassAndObjectDemo {
    String brand = "Toyota";
    int year = 2020;

    void start() {
        System.out.println(brand + " car is starting...");
    }

    public static void main(String[] args) {
        ClassAndObjectDemo car = new ClassAndObjectDemo();
        car.start();
    }
}
