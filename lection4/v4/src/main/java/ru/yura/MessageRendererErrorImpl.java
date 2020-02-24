package ru.yura;
/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringExample
 *
 */

public class MessageRendererErrorImpl implements MessageRenderer {
    private Message message;

    public MessageRendererErrorImpl(Message message) {
        this.message = message;
    }

    public void printMesssage(){
        System.err.println(message.getText());
    }
}
