package try_with_resources;

public class Solution {
    public static class Car implements AutoCloseable {

        public void drive() {
            System.out.println("Машина поехала.");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }
    }

    public static void main(String[] args) throws Exception {
        try (Car audi = new Car()) {
            audi.drive();
        } catch (RuntimeException e) {

        }
    }
}
