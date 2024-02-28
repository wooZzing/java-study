package Chapter01;

public class VariableEx03 {
    public static void main(String[] args) {
        /* 논리형 */
        boolean flag = true;

        System.out.println("=======논리형=======");
        System.out.println(flag);

        /* 문자형 */
        char a = 'A';

        System.out.println("=======문자형=======");
        System.out.println(a);
        System.out.println((int) a);	// A 문자의 유니코드 정수 출력

        /* 정수형 */
        byte b = 127;
        short s = 32_767;
        int i = 32_768;
        long l = 7_852_354_812L;

        System.out.println("=======정수형=======");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        /* 실수형 */
        float f = 3.141592F;
        double d = 3.141592653589793;

        System.out.println("=======실수형=======");
        System.out.println(f);
        System.out.println(d);
    }
}
