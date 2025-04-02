package chapter11;

public class Chapter11Main {
    public static void main(String[] args) {
        Method method = new Method();  //Method 객체 생성

        int sum = method.add(3, 4); //Method 객체의 add 메서드 호출 (int형 반환)

        method.out(sum);  //Method 객체의 out 메서드 호출 (반환 없음)
        Method.sqrtOut(sum); //객체 생성 없이 static sqrtOut 메서드 호출 가능
    }
}
