package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
    public static void main(String[] args) {

    }
    public static void logging() {
    final Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
    LOGGER.log(Level.INFO, "Все хорошо");
    LOGGER.log(Level.WARNING, "Произошла ошибка");
    }
}
