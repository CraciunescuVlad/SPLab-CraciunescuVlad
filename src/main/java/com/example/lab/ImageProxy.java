package com.example.lab;

import jakarta.persistence.*;
import java.awt.Dimension;

@Entity
public class ImageProxy extends BaseElement {
    private String url;

    @Transient
    private Dimension dim;

    @Transient // realImage nu este persistat conform cerintei din laborator
    private Image realImage;

    public ImageProxy() {}
    public ImageProxy(String url) { this.url = url; }

    private Image loadImage() {
        if (realImage == null) realImage = new Image(url);
        return realImage;
    }

    @Override
    public void print() { loadImage().print(); }
    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element element) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element element) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}