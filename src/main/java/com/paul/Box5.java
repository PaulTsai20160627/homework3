package com.paul;

import com.paul.PostOfficeBox;

public class Box5 extends PostOfficeBox {
    float length = 39.5f;
    float width = 27.5f;
    int height = 23;
    @Override
    public boolean validate(float length,float width,int height) {
        Boolean sizeIsValid = length < this.length && width < this.width && height< this.height ? true : false ;
        return sizeIsValid;
    }
}
