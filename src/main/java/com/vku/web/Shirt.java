package com.vku.web;

import org.springframework.stereotype.Component;

@Component
public class Shirt implements Outfit{

    @Override
    public void wear() {
        System.out.println("Mac ao somi");
    }
}
