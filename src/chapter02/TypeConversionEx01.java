package chapter02;

public class TypeConversionEx01 {
    public static void main(String[] args) {
		/*
			byte -> int
			byte 타입의 byteVal이 int 타입의 intVal로 변환된다.
			byte는 8비트, int는 32비트이다.
		*/
        byte byteVal = 42;
        int intVal = byteVal;
        System.out.println("Byte -> Int: " + intVal);



	    /*
			int -> long
			int 타입의 intVal이 long 타입의 longVal로 변환된다.
			long은 64비트이다.
		*/
        long longVal = intVal;
        System.out.println("Int -> Long: " + longVal);



		/*
			long -> float
			long 타입의 longVal이 float 타입의 floatVal로 변환된다.
			float은 32비트이지만, 실수형이므로 더 큰 범위의 값을 저장 할 수 있다.
		*/
        float floatVal = longVal;
        System.out.println("Long -> Float: " + floatVal);



		/*
			char -> int
			char 타입의 charVal이 int 타입의 intVal로 변환된다.
			char는 유니코드 문자를 나타내며, A의 유니코드는 65이다.
		*/
        char charVal = 'A';
        intVal = charVal;
        System.out.println("Char -> Int: " + intVal); // 유니코드 값 출력



		/*
			int -> double
			int 타입의 intVal이 double 타입의 doubleVal로 변환된다.
			double은 64비트 실수형이다.
		*/
        double doubleVal = intVal;
        System.out.println("Int -> Double: " + doubleVal);
    }
}
