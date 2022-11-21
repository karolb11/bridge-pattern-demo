package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;

class SquareV2 extends Shape {

    public SquareV2(final GraphicLibrary graphicLibrary) {
        super(graphicLibrary);
    }

    @Override
    public void print() {
        graphicLibrary.printText("SquareV2");
    }
}
