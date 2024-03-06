package chapter02;

public class TypeConversionEx04 {
    public static void main(String[] args) {

        // double을 float로 명시적 형변환
        double doubleValue = 3.141592653589793;
        float floatValue = (float) doubleValue;
        System.out.println("double 타입 원래의 값 : " + doubleValue);
        System.out.println("float 타입으로 형변환 된 값 : " + floatValue);
        System.out.println();

        // float을 long으로 명시적 형변환
        float floatValue2 = 9.99f;
        long longValue = (long) floatValue2;
        System.out.println("float 타입 원래의 값 : " + floatValue2);
        System.out.println("long 타입으로 형변환 된 값 : " + longValue);
        System.out.println();

        // long을 int로 명시적 형변환
        long longValue2 = 21_000_000_000L;
        int intValue = (int) longValue2;
        System.out.println("long 타입 원래의 값 : " + longValue2);
        System.out.println("int 타입으로 형변환 된 값 : " + intValue);
        System.out.println();

        // int를 char로 명시적 형변환
        int intValue2 = 65;
        char charValue = (char) intValue2;
        System.out.println("int 타입 원래의 값 : " + intValue2);
        System.out.println("char 타입으로 형변환 된 값 : " + charValue);
        System.out.println();

        // char를 short로 명시적 형변환 (주의: char와 short는 같은 크기(2바이트)이지만, 일반적으로 char에서 short로의 직접 변환은 권장되지 않음)
        char charValue2 = 'A';
        short shortValue = (short) charValue2;
        System.out.println("char 타입 원래의 값 : " + charValue2);
        System.out.println("short 타입으로 형변환 된 값 : " + shortValue);
    }
}
