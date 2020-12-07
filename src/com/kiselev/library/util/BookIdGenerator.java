package com.kiselev.library.util;

public class BookIdGenerator {
    private static int startId = 0;

    public static int createNewId() {
        return startId++;
    }
}
