package HeadOrgans;

/**
 * Brain is a class which use methods of Nose class and Mouth class
 * It was developed to rule the main organism*/
public class Brain extends HeadOrgan {

    private int KPD;

    /**Constructor of Brain class*/
    public  Brain (int a)
    {
        super(100);
        KPD = a;
    }

    /**Method rule
     * @return String with a result*/
    private String rule(int ch, int flag)
    {
        switch (ch) {
            case 0:
                Nose nos  = new Nose("gg");
                if (flag == 1)
                    return(nos.sniff());
                if (flag == 2)
                    return (nos.itch());
                break;

            case 1:
                Mouth rot = new Mouth("gg");
                if (flag == 1)
                    return (rot.Eat());
                if (flag == 2)
                    return (rot.Speak());
                break;
            case 2:
                Ear uho = new Ear(20,false);
                if (flag == 1)
                    return (uho.Hear());
                break;
        }
        return "WTF?";
    }

    /**Method getResult
     * @return String with a result of rule method*/
    public String getResult(int ch, int flag)
    {
        return rule(ch,flag);
    }
}
