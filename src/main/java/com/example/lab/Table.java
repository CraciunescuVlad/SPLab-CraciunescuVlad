package com.example.lab;

import jakarta.persistence.Entity;

@Entity
public class Table extends BaseElement {
    private String something;

    public Table() {}
    public Table(String something) { this.something = something; }

    @Override public void print() { System.out.println("Table with Title: " + something); }
    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element element) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element element) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
    public String getSomething() { return something; }
    public void setSomething(String something) { this.something = something; }
}