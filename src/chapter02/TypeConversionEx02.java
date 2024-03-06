package chapter02;

public class TypeConversionEx02 {
    public static void main(String[] args) {
        int i = 100;
        long l = 200L;
        float f = 300.0f;

        // int와 long이 연산되면, 결과는 long
        long result1 = i + l;
        System.out.println("Int + Long: " + result1);

        // long과 float이 연산되면, 결과는 float
        float result2 = l + f;
        System.out.println("Long + Float: " + result2);

        // int와 float이 연산되면, 결과는 float
        float result3 = i + f;
        System.out.println("Int + Float: " + result3);

        // 모든 연산이 float으로 형변환되어 연산됨
        double result4 = i + l + f;
        System.out.println("Int + Long + Float: " + result4);
    }
}