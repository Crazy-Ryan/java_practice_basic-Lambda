package com.thoughtworks;

@FunctionalInterface
public interface OwnFunction<T> {
    T square(T t);
}
