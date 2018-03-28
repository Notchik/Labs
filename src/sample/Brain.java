package sample;
/**
 * Brain is a class which use methods of Nose class and Mouth class
 * It was developed to rule the main organism*/
public class Brain extends Organ{

    public int KPD;

    public  Brain (int a)
    {
        super(100);
        KPD = a;
    }

    public String rule(int ch, int flag)
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
                Mouth rot = new Mouth("ss");
                if (flag == 1)
                    return (rot.Eat());
                if (flag == 2)
                    return (rot.Speak());
                break;
        }
        return "WTF?";
    }

    public void getResult(String str)
    {
        System.out.println(str);
    }
}
