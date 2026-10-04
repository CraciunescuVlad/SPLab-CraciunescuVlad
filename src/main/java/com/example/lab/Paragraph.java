package com.example.lab;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text){
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " + text);
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
}
