package com.company.behavioural.strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        Compressor.compress(fileName);
        Filter.apply(fileName);

    }
}
