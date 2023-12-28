package com.file231228;

import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        List<String> names = List.of("red","blue","yellow","green","purple");
        List<String> result = names.stream().filter(name -> name.contains("u")).toList();
        System.out.println(result);
    }
}