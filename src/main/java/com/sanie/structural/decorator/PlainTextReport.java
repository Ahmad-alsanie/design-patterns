package com.sanie.structural.decorator;

public class PlainTextReport implements Report {
    public String generate() {
        return "Report Content in Plain Text";
    }
}
