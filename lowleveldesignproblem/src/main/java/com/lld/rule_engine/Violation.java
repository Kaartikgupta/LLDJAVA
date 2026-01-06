package main.java.com.lld.rule_engine;

public class Violation {
    private String ruleName;
    private String message;
    public Violation(String ruleName, String message) {
        this.ruleName = ruleName;
        this.message = message;
    }
    @Override
    public String toString() {
        return "Violation{" +
                "ruleName='" + ruleName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
