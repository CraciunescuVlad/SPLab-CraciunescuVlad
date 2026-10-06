package com.example.lab;

public class Paragraph implements Element{
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text){
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy textAlignment){
        this.textAlignment = textAlignment;
    }

    @Override
    public void print() {
        if (this.textAlignment != null) {
            this.textAlignment.render(this, null);
        } else {
            System.out.println("Paragraph: " + text);
        }
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Nu se pot adauga elemente intr-un Paragraph.");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Nu se pot sterge elemente dintr-un Paragraph.");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Paragraph nu contine elemente copil.");
    }

    public String getText(){
        return text;
    }
}
