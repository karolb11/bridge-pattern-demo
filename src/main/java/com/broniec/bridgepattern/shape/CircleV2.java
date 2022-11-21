package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;

class CircleV2 extends Shape {

    public CircleV2(final GraphicLibrary graphicLibrary) {
        super(graphicLibrary);
    }

    @Override
    public void print() {
        graphicLibrary.printText("CircleV2");
    }
}
