package com.jansmerecki.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}