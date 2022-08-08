package common;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Solution {

    public static void main(String[] args) {
        byte[] bytes = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        try {
            System.out.println(readAsString(inputStream, StandardCharsets.US_ASCII));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    return new String(inputStream.readAllBytes(), charset);
    }
}

