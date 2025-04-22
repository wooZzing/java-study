package chapter29.arrayExp;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        try {
            System.out.println(nums[5]);  // 존재하지 않는 인덱스
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스를 잘못 사용했습니다.");
        }
    }
}