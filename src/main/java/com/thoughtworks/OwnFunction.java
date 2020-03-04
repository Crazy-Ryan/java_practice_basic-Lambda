package com.thoughtworks;

@FunctionalInterface
public interface OwnFunction<T, R> {
    T square(R r);
}
