package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;

class SquareV1 extends Shape {

    public SquareV1(final GraphicLibrary graphicLibrary) {
        super(graphicLibrary);
    }

    @Override
    public void print() {
        graphicLibrary.printText("Square");
    }

}
