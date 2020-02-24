package ru.yura;
/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringExample
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndependentMessageRenderer {
    @Autowired
    private MessageRenderer renderer;

//    public IndependentMessageRenderer(MessageRenderer renderer) {
//        this.renderer = renderer;
//    }

    public void print(){
        renderer.printMesssage();
    }
}
