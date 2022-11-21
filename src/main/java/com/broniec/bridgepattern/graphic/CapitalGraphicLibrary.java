package com.broniec.bridgepattern.graphic;

class CapitalGraphicLibrary implements GraphicLibrary {

    @Override
    public void printText(final String text) {
        System.out.println(text.toUpperCase());
    }

}
