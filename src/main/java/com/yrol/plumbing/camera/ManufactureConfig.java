package com.yrol.plumbing.camera;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class which will make this available automatically to the SpringContext.
 * Spring framework will scan this class automatically sine using the @Configuration annotation.
 * */

@Configuration
public class ManufactureConfig {

    @Bean
    public Camera newCamera() {
        MegaPixels mp = new MegaPixels();
        return new Camera(mp);
    }
}
