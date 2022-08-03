package ascii_char_seq;

import java.util.Arrays;

public class Solution {
public static class AsciiCharSequence implements CharSequence {
    private final byte[] byteSequence;

    public AsciiCharSequence(byte[] byteSequence) {
        this.byteSequence = byteSequence;
    }

    @Override
    public int length() {
        return byteSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteSequence[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(byteSequence, start, end));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteSequence) {
            sb.append((char) b);
        }
        return sb.toString();
    }
}

    public static void main(String[] args) {
        AsciiCharSequence text = new AsciiCharSequence(new byte[]{65, 66, 67, 68, 69});
        System.out.println(text);
        System.out.println(text.subSequence(0, 1));
    }
}
