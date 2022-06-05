package com.nvrviews.creational.prototypepattern;

public class Story implements PrototypeCapable{

    private String subject;
    private String acceptanceCriteria;
    private String description;

    public Story(String subject, String acceptanceCriteria) {
        this.subject = subject;
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Story) super.clone();
    }

    public Story(String subject, String acceptanceCriteria, String description) {
        this.subject = subject;
        this.acceptanceCriteria = acceptanceCriteria;
        this.description = description;
    }
}
