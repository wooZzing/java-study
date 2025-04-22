package chapter30.exceptionExp;

public class FileService {
    public void validateFile(String filename) throws FileRuleViolationException {
        if (!filename.endsWith(".txt")) {
            throw new FileRuleViolationException("❌ .txt 파일만 허용됩니다.");
        }

        System.out.println("파일 유효성 통과: " + filename);
    }
}