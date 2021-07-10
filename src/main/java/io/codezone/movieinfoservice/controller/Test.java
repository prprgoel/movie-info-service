package io.codezone.movieinfoservice.controller;

import io.codezone.movieinfoservice.models.RandomPojo;

public class Test {

    public static void main(String[] args) {
        RandomPojo randomPojo1 = new RandomPojo();
        randomPojo1.setA("asdf");
        randomPojo1.setB("Asdf");

        RandomPojo randomPojo = new RandomPojo("a", "v", "c", 1, 2);
    }

}
