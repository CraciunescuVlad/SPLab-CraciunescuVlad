package com.example.lab;

public class TableOfContents implements Element {
    private String something;

    public TableOfContents(){
        this.something = "Table of Contents";
    }
    public  TableOfContents(String something){
        this.something = something;
    }

    @Override
    public void print(){
        System.out.println("Table of Contents" + something);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Nu se pot adauga elemente intr-un TableOfContents.");
    }

    @Override
    public void remove(Element element){
        throw new UnsupportedOperationException("Nu se pot sterge elemente din TableOfContents");
    }

    public Element get(int index){
        throw new UnsupportedOperationException("TableOfContents nu contine elemente copil.");
    }

}
