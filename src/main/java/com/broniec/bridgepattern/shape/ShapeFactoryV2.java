package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ShapeFactoryV2 implements ShapeFactory {

    private final GraphicLibrary graphicLibrary;

    @Override
    public Shape circle() {
        return new CircleV2(graphicLibrary);
    }

    @Override
    public Shape square() {
        return new SquareV2(graphicLibrary);
    }

    @Override
    public Shape triangle() {
        return new TriangleV2(graphicLibrary);
    }

}
