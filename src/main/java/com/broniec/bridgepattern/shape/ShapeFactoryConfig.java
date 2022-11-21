package com.broniec.bridgepattern.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.broniec.bridgepattern.graphic.GraphicLibrary;

@Configuration
class ShapeFactoryConfig {

    @Bean
    public ShapeFactory shapeFactory(@Autowired GraphicLibrary graphicLibrary,
                                     @Value("${shape.version}") ShapeVersion shapeVersion) {
        return switch (shapeVersion) {
            case v1 -> new ShapeFactoryV1(graphicLibrary);
            default -> new ShapeFactoryV2(graphicLibrary);
        };
    }

}
