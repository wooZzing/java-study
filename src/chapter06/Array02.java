package chapter06;

public class Array02 {
    public static void main(String[] args) {
        // 점수 배열을 선언, 생성, 초기화합니다.
        int[] scoreArray = {53, 72, 45, 60, 80};

        System.out.println("모든 학생의 점수를 5점씩 올립니다.");

        // 배열의 모든 요소에 접근하여 각 점수를 5점씩 올립니다. 0 ~ 4까지 접근합니다.
        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] += 5;
        }

        // 조정된 점수를 출력합니다.
        System.out.print("조정된 점수는 [");
        for (int i = 0; i < scoreArray.length; i++) {
            if(i == 0)
                System.out.print(scoreArray[i]);
            else
                System.out.print(", " + scoreArray[i]);
        }
        System.out.println("] 입니다.");

    }
}