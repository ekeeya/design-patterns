package com.patterns.strategy;

public class TextEditor {
    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }
    public void displayText(String text){
        textFormatter.format(text);
    }
}
