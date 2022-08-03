package human;

public class Solution {
    public static void main(String[] args) {
        Human gera = new Human();
        Human vera = new Human((byte) 18, "Vera", "Garage", "Ski");
        Human jeka = new Human((byte) 9, "Eugene", "Polyakov");
    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
