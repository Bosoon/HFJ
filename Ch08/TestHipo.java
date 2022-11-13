public class TestHipo {
    public static void main(String[] args) {
        System.out.println("Starting ...");
        Hipo h = new Hipo();
        System.out.println("New one with name");
        Hipo h2 = new Hipo("Buffy");
        System.out.println(h2.getName());
    }
}
