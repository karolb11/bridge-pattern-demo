package com.broniec.bridgepattern.graphic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class GraphicLibraryConfig {

    @Bean
    public GraphicLibrary graphicLibrary(@Value("${graphic.library.version}") LibraryVersion libraryVersion) {
        return switch (libraryVersion) {
            case red -> new RedGraphicLibrary();
            case capital -> new CapitalGraphicLibrary();
            default -> new StandardGraphicLibrary();
        };
    }

}
