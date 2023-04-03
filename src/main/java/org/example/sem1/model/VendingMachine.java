package org.example.sem1.model;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
