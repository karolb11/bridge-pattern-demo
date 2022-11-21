package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;

class TriangleV2 extends Shape {

    public TriangleV2(final GraphicLibrary graphicLibrary) {
        super(graphicLibrary);
    }

    @Override
    public void print() {
        graphicLibrary.printText("TriangleV2");
    }
}
