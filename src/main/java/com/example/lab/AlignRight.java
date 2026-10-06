package com.example.lab;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, String context){
        System.out.println("Paragraph: " + paragraph.getText() + " (align right)");
    }
}
