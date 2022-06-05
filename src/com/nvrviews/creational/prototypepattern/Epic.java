package com.nvrviews.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Epic implements PrototypeCapable{

    private String subject;
    private String acceptanceCriteria;
    private String description;
    private List<PrototypeCapable> stories;

    public Epic(String subject, String acceptanceCriteria) {
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

    public List<PrototypeCapable> getStories() {
        if(stories == null){
            this.stories = new ArrayList<>();
        }
        return stories;
    }

    public void setStories(List<PrototypeCapable> stories) {
        this.stories = stories;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (Epic) super.clone();
    }

    @Override
    public String toString() {
        return "Epic{" +
                "subject='" + subject + '\'' +
                ", acceptanceCriteria='" + acceptanceCriteria + '\'' +
                ", description='" + description + '\'' +
                ", stories=" + stories +
                '}';
    }
}
