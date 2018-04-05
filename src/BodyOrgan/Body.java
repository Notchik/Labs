package BodyOrgan;

import java.util.ArrayList;
/**
 * Class Body - the class, that describes human body, which is
 * a container to other body organs
 * */
public class Body {
    private BodyOrgan organ;

    public  ArrayList<BodyOrgan> organs;

    public  Body()
    {
        organs = new ArrayList<>();
    }
}
