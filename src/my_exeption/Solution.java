package my_exeption;

public class Solution {
static class MyNewException extends Exception {

}

    public static void main(String[] args) {
        try {
            testExp();
        } catch (MyNewException e) {
            throw new RuntimeException(e);
        }
    }

    public static void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
