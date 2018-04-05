package HeadOrgans;

import BodyOrgan.Stomach;

/**
 * class Mouth contains pole size
 * and two methods: Eat, which can return different tastes,
 * and method speak, which returns different strings */
public class Mouth extends HeadOrgan {

    private String size;

    /**Constructor of Mouth class*/
    public Mouth(String ss)
    {
        super(100);
        size = ss;
    }

    /**Method Eat
     * @return String with taste*/
    public String Eat()
    {
        double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Delicious";

            case 2: return "Salty";

            case 3: return "Sweetly";

            case 4: return "Yuck";

            default: return "WTF?";
        }
    }

    /**Method Speak
     * @return String with some words*/
    public String Speak()
    {
        double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "Hello!";

            case 2: return "How are you?";

            case 3: return "I'm okay";

            case 4: return "I'm a smart software!!!";

            default: return "WTF?";
        }
    }

    public String GiveFood(String food)
    {
        Stomach jel = new Stomach(250, 500);
        return food + " " + jel.TakeFood(food);
    }
}