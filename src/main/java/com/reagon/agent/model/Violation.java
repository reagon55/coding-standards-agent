package com.reagon.agent.model;

public class Violation {

    private String rule;
    private String severity;
    private String message;

    public Violation(String rule, String severity, String message) {
        this.rule = rule;
        this.severity = severity;
        this.message = message;
    }

    public String getRule() {
        return rule;
    }

    public String getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }
}