package com.yzy.testgit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class test1 {
    public void branch(){
        System.out.println("你好，我是branch");
    }
    public static void main(String[] args) {
        System.out.println("你好，git");
        System.out.println("你好，分支main");
        new test1().branch();
        Branch branch = new Branch();
    }
}
