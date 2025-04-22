package chapter30.exceptionExp;

public class FileRuleViolationException extends Exception {
    public FileRuleViolationException(String message) {
        super(message);
    }
}