package com.example.lab.observer;

import com.example.lab.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {

    private final List<Observer> observerCollection = new ArrayList<>();
    private Book lastAddedBook;

    @Override
    public void attach(Observer observer) {
        observerCollection.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerCollection.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerCollection) {
            observer.update(lastAddedBook);
        }
    }

    public void add(Book book) {
        this.lastAddedBook = book;
        notifyObservers();
    }
}