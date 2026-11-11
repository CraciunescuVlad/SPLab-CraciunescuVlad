package com.example.lab;

import jakarta.persistence.Entity;
import java.util.concurrent.TimeUnit;

@Entity
public class Image extends BaseElement {
    private String url;

    public Image() {}
    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override public void print() { System.out.println("Image with name: " + url); }
    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element element) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element element) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}