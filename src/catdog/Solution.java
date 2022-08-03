package catdog;
public class Solution {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Dog sharik = new Dog();
        murzik.sayHello();
        sharik.sayHello();
        sharik.catchCat(murzik);
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }
        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }
}
