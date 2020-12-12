package kz.msovet.springapp;

import java.util.Random;

public enum MusicType {
    CLASSICAL, ROCK;

    private static final MusicType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public MusicType getRandomType()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
