package lang;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathBig {
    public static void main(String[] args) {
        System.out.println("---------------BigInteger---------------");
        BigInteger big1 = new BigInteger("10000");
        BigInteger big2 = new BigInteger("999999999999999999999999999999999900");
        System.out.println("big1.add(big2) = " + big1.add(big2));
        System.out.println("big1.subtract(big2) = " + big1.subtract(big2));
        System.out.println("big1.multiply(big2) = " + big1.multiply(big2));
        System.out.println("big1.divide(big2) = " + big1.divide(big2));
        System.out.println("big1.remainder(big2) = " + big1.remainder(big2));
        System.out.println("big1.compareTo(big2) = " + big1.compareTo(big2));

        System.out.println("---------------BigDecimal---------------");
        BigDecimal bigDecimal1 = new BigDecimal("33.3333");
        BigDecimal bigDecimal2 = new BigDecimal("-99.9999");
        System.out.println("bigDecimal1.add(bigDecimal2) = " + bigDecimal1.add(bigDecimal2));
        System.out.println("bigDecimal1.subtract(bigDecimal2) = " + bigDecimal1.subtract(bigDecimal2));
        System.out.println("bigDecimal1.multiply(bigDecimal2) = " + bigDecimal1.multiply(bigDecimal2));
        System.out.println("bigDecimal1.divide(bigDecimal2) = " + bigDecimal1.divide(bigDecimal2,2, RoundingMode.HALF_UP));
        System.out.println("bigDecimal1.remainder(bigDecimal2) = " + bigDecimal1.remainder(bigDecimal2, MathContext.DECIMAL32));
    }
}
