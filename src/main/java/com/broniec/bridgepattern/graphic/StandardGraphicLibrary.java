package com.broniec.bridgepattern.graphic;

class StandardGraphicLibrary implements GraphicLibrary {

    @Override
    public void printText(final String text) {
        System.out.println(text);
    }

}
