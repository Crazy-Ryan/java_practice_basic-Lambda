package com.thoughtworks;

@FunctionalInterface
public interface OwnFunction<T, R> {
    R square(T t);
}
