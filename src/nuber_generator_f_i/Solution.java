package nuber_generator_f_i;

public class Solution {

    public static NumberGenerator<? super Number> getGenerator() {
        return arg ->  arg.intValue() > 0;
    }
}
