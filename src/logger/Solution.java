package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
    public static void main(String[] args) {

    }
    public static void logging() {
    final Logger logger = Logger.getLogger("com.javamentor.logging.Test");
    logger.log(Level.INFO, "Все хорошо");
    logger.log(Level.WARNING, "Произошла ошибка");
    }
}
