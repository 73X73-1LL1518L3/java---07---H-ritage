public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("clio", 125);
        System.out.println(clio.doStuff());

        Boat queenElizabeth2 = new Boat("Queen Elizabeth 2", 45665);
        System.out.println(queenElizabeth2.doStuff());
    }
}