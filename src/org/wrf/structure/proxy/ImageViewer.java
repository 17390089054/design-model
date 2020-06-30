package org.wrf.structure.proxy;

import java.net.URL;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-26 22:46
 **/
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
