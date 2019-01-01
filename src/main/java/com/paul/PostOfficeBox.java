package com.paul;

public abstract class PostOfficeBox {
    float length;
    float width;
    int height;
    public abstract boolean validate(float length,float width,int height);
}
