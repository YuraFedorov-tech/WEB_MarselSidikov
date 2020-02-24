package ru.yura;
/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringExample
 *
 */

public class MessageRendererStandartImpl implements MessageRenderer {
    private Message message;

    public MessageRendererStandartImpl(Message message) {
        this.message = message;
    }

    public void printMesssage(){
        System.out.println(message.getText());
    }
}
