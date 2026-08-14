package calculator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Weak cryptographic algorithm MD5 (triggers rule java:S2070)
    public byte[] weakHash(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return md.digest(data.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

