package com.example.lab;

public interface Element {
    void print();
    void accept(Visitor visitor);
    void add(Element element);
    void remove(Element element);
    Element get(int index);
}
