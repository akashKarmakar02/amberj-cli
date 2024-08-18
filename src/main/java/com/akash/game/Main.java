package com.akash.game;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("""
                No args found. example: hello
                """);
            return;
        }

        if (Objects.equals(args[0], "hello")) {
            System.out.println("Hello From AmberJ CLI!");
        }

    }
}