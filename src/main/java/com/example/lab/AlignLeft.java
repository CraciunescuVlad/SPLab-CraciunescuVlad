package com.example.lab;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, String context) {
        System.out.println("Paragraph: " + paragraph.getText() + " (align left)");
    }
}
