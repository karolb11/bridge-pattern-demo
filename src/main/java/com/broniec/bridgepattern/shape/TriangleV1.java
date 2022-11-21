package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;

class TriangleV1 extends Shape {

    public TriangleV1(final GraphicLibrary graphicLibrary) {
        super(graphicLibrary);
    }

    @Override
    public void print() {
        graphicLibrary.printText("Triangle");
    }

}
