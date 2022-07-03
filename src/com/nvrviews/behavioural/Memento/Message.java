package com.nvrviews.behavioural.Memento;

public class Message {
    private int id;
    private String message;
    private String status;

    private int stateChangeCount =1;

    public Message(int id, String message, String status) {
        this.id = id;
        this.message = message;
        this.status = status;
    }

    public Message(Message m) {
        this.id = m.id;
        this.message = m.message;
        this.status = m.status;
        this.stateChangeCount = m.stateChangeCount;
    }

    public void setStatus(String status) {
        this.status = status;
        this.stateChangeCount++;
    }

    public Memento<Message> getMemento(){
        return new Memento<>(new Message(this));
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", stateChangeCount=" + stateChangeCount +
                '}';
    }
}
