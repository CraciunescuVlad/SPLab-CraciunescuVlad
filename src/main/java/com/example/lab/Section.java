package com.example.lab;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Section extends BaseElement {

    protected String title;

    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected List<Element> children = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getChildren() {
        return children;
    }

    @Override
    public void add(Element element) {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }
}