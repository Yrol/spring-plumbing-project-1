package com.yrol.plumbing.camera;

public class Camera {

    public Camera() {}

    public Camera(MegaPixels megaPixels) {
        this.megaPixels = megaPixels;
    }

    public MegaPixels getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(MegaPixels megaPixels) {
        this.megaPixels = megaPixels;
    }

    private MegaPixels megaPixels;


}
