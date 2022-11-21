package com.broniec.bridgepattern.shape;

import com.broniec.bridgepattern.graphic.GraphicLibrary;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Shape {

    protected final GraphicLibrary graphicLibrary;

    public abstract void print();

}
