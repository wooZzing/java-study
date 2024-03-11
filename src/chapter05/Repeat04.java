package chapter05;

public class Repeat04 {
    public static void main(String[] args) {

        // 평균을 구할 배열을 선언 및 초기화 합니다.
        int[] numbers = {4, 10, 36, 28, 73};

        // 평균을 저장할 변수를 실수형으로 선언 및 초기화 합니다.
        double average = 0.0;

        // 향상된 for문을 통해 배열을 순회하여 각 요소를 number 변수에 저장합니다.
        for (int number : numbers) {
            // 배열의 요소를 저장한 number를 평균을 저장할 변수에 더합니다.
            average += number;
        }

        // 배열의 총합을 배열의 갯수만큼 나눕니다.
        average /= numbers.length;

        System.out.println("해당 배열의 평균은 " + average + " 입니다.");
    }
}