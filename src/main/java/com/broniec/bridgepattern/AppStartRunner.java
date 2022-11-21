package com.broniec.bridgepattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.broniec.bridgepattern.shape.ShapeFactory;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AppStartRunner implements CommandLineRunner {

    private final ShapeFactory shapeFactory;

    @Override
    public void run(final String... args) {
        shapeFactory.triangle()
                .print();

        shapeFactory.circle()
                .print();

        shapeFactory.square()
                .print();
    }

}
