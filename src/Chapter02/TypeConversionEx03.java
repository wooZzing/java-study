package Chapter02;

public class TypeConversionEx03 {
    public static void main(String[] args) {

        boolean flag = true;
        char c = 'A';
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 3.1415F;
        double d = 3.141592;

        String text = "Combine with String : ";

        String result1 = text + flag; // boolean 타입의 값이 문자열로 변환됨
        String result2 = text + c;	  // char 타입의 값이 문자열로 변환됨
        String result3 = text + b;	  // byte 타입의 값이 문자열로 변환됨
        String result4 = text + s;	  // short 타입의 값이 문자열로 변환됨
        String result5 = text + i;	  // int 타입의 값이 문자열로 변환됨
        String result6 = text + l;	  // long 타입의 값이 문자열로 변환됨
        String result7 = text + f;	  // float 타입의 값이 문자열로 변환됨
        String result8 = text + d;	  // double 타입의 값이 문자열로 변환됨


        System.out.println("boolean + String -----> " + result1);
        System.out.println("char + String -----> " + result2);
        System.out.println("byte + String -----> " + result3);
        System.out.println("short + String -----> " + result4);
        System.out.println("int + String -----> " + result5);
        System.out.println("long + String -----> " + result6);
        System.out.println("float + String -----> " + result7);
        System.out.println("double + String -----> " + result8);

    }
}
