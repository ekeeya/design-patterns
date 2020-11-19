package com.patterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        TextFormatter textFormatter = new CapTextFormatter();
        TextEditor textEditor = new TextEditor(textFormatter);
        textEditor.displayText("This is to be capitalised");

        TextFormatter textFormatter1 = new LowerTextFormatter();
        TextEditor textEditor1 = new TextEditor(textFormatter1);
        textEditor1.displayText("THIS HAS TO BE ALL lower case");
    }
}
