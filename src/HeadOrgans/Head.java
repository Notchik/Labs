package HeadOrgans;

import java.util.ArrayList;
/**
 * Class Head - the main class, which is
 * a container to other organs
 * */
public class Head {
    private HeadOrgan organ;

    public  ArrayList<HeadOrgan> organs;

    public  Head()
    {
        organs = new ArrayList<>();
    }
}
