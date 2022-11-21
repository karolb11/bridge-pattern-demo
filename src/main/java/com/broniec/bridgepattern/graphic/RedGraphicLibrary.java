package com.broniec.bridgepattern.graphic;

class RedGraphicLibrary implements GraphicLibrary {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";

    @Override
    public void printText(final String text) {
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }

}
