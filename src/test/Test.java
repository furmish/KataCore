package test;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
    StackTraceElement[] traceElements;
    traceElements = new Throwable().getStackTrace();
    StringBuilder sb = new StringBuilder();
    if (traceElements.length > 2) {
        sb.append(traceElements[2].getClassName()).append("#").append(traceElements[2].getMethodName());
        return sb.toString();
    }
    return null;
    }
}
