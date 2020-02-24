package ru.yura;
/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringExample
 *
 */

public class Hello implements Message {
    private String text;

    public Hello(String text) {
        this.text = "Hello "+text;
    }

    public String getText() {
        return text;
    }
}
