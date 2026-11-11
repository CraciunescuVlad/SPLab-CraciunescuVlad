package com.example.lab;

import jakarta.persistence.*;

@Entity
public class Paragraph extends BaseElement {
    private String text;

    @Transient // textAlignment nu se salveaza in baza de date
    private AlignStrategy textAlignment;

    public Paragraph() {}
    public Paragraph(String text) { this.text = text; }

    public void setAlignStrategy(AlignStrategy textAlignment) { this.textAlignment = textAlignment; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    @Override
    public void print() {
        if (textAlignment != null) textAlignment.render(this, null);
        else System.out.println("Paragraph: " + text);
    }

    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element element) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element element) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
}