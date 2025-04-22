package chapter30.exceptionExp;

public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        try {
            fileService.validateFile("image.png");
        } catch (FileRuleViolationException e) {
            System.out.println("파일 오류: " + e.getMessage());
        }
    }
}