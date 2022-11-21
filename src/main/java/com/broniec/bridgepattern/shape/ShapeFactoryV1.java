package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ShapeFactoryV1 implements ShapeFactory {

    private final GraphicLibrary graphicLibrary;

    public Shape circle() {
        return new CircleV1(graphicLibrary);
    };

    public Shape square() {
        return new SquareV1(graphicLibrary);
    }

    public Shape triangle() {
        return new TriangleV1(graphicLibrary);
    }

}
