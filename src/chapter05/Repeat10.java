package chapter05;

public class Repeat10 {
    public static void main(String[] args) {
        outerFor :
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(i == 1 && j == 1){
                    // 4자리의 공간을 확보하고, 나머지 공간은 공백으로 채워집니다. -는 좌측 정렬을 의미합니다.
                    System.out.printf("%-4s", " ");
                } else {
                    // 4자리의 공간을 확보하고, 나머지 공간은 공백으로 채워집니다. -는 좌측 정렬을 의미합니다.
                    System.out.printf("%-4d", j * i);
                }

                if(i == 3 && j == 5){
                    break outerFor;
                }
            }
            System.out.println();
        }
    }
}