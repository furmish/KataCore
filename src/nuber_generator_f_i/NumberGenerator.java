package nuber_generator_f_i;
@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
