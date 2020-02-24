package ru.yura;
/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringExample
 *
 */

public class Buy implements Message {
    private String text;

    public Buy(String text) {
        this.text = "Buy "+text;
    }

    public String getText() {
        return text;
    }
}
