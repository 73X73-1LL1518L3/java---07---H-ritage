public class Hangar {
    public static void main(String[] args) {
        Car Clio = new Car("Clio", 125);
        System.out.println(Clio.doStuff());

        Boat Queen_Elizabeth_2 = new Boat("Queen Elizabeth 2", 45665);
        System.out.println(Queen_Elizabeth_2.doStuff());
    }
}