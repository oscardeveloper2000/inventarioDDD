package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

public class Dimension implements ValueObject<Dimension.Props>{

    private final int length;
    private final int width;
    private final int height;

    public Dimension(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public int length() {
                return length;
            }
            @Override
            public int width() {
                return width;
            }
            @Override
            public int height(){
                return height;
            }
        };
    }

    public interface Props {
        int length();
        int width();
        int height();
    }
}
