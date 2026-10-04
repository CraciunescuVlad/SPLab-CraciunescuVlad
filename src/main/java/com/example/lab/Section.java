package com.example.lab;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    protected String title;
    protected List<Element> children = new ArrayList<>();

    public Section(String title){
        this.title = title;
    }

    @Override
    public void add(Element element){
        this.children.add(element);
    }

    @Override
    public void remove(Element element) {
        this.children.remove(element);
    }

    @Override
    public Element get(int index) {
        return this.children.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }
}
