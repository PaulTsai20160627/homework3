package com.paul;

public class Box3 extends PostOfficeBox {
    float length = 23.0f;
    float width = 14.0f;
    int height =13;
    @Override
    public boolean validate(float length,float width,int height) {
        Boolean sizeIsValid = length < this.length && width < this.width && height< this.height ? true : false ;
        return sizeIsValid;
    }
}