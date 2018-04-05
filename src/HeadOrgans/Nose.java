package HeadOrgans;

/**
 * class Nose contains pole form
 * and two methods: sniff, which can return different smells,
 * and method itch, which returns feeling */
public class Nose extends HeadOrgan {

    private String form;

    /**Constructor of Nose class*/
    public Nose(String ss)
    {
        super(100);
        form = ss;
    }

    /**Method Sniff
     * @return String with smell*/
    public String sniff()
    {
        double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Mmm, like an oil... I like that smell";

            case 2: return "Wow, you bought a new perfume!";

            case 3: return "Maybe it's time to have a shower?";

            case 4: return "Will it be chicken for a dinner?";

            default: return "WTF?";
        }
    }

    /**Method Itch
     * @return String with feeling*/
    public String itch()
    {
        double a = Math.random()*2+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "I need more";

            case 2: return "That's great feeling";

            default: return "WTF?";
        }
    }
}
