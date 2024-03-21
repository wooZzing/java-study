package chapter06;

public class Array03 {
    public static void main(String[] args) {
        int[] intArray = new int[100];

        // 0부터 배열크기-1까지 반복합니다.
        for(int i = 0; i < intArray.length; i++) {
            // i는 0부터 99까지 증가합니다. 따라서 i+1을 저장시킵니다.
            intArray[i] = i+1;
        }

        // 0부터 배열크기-1까지 짝수만 출력합니다.
        for(int i = 0; i < intArray.length; i++) {
            // 인덱스가 홀수인 경우 짝수이기 때문에, 홀수 인덱스만 출력합니다.
            if(i % 2 == 1){
                if(i == 1){
                    System.out.print(intArray[i]);
                } else {
                    System.out.print(", " + intArray[i]);
                }
            }
        }
    }
}