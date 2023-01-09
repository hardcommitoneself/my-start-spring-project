package com.example.starter;

public class Starter {
    private final long id;
    private final String content;

    public Starter(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
