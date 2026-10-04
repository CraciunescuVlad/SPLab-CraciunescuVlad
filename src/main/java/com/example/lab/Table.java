package com.example.lab;

public class Table implements Element{
    private String something;

    public Table(String something){
        this.something = something;
    }

    @Override
    public void print(){
        System.out.println("Table: " + something);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Nu se pot adauga elemente intr-un Table.");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Nu se pot sterge elemente dintr-un Table.");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Table nu contine elemente copil.");
    }
}
