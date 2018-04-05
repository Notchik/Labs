package BodyOrgan;
/**
 * Class Stomach
 * Has 1 pole - volume, and 2 methods: TakeFood and Digest*/
public class Stomach extends BodyOrgan {
    double volume;

    /**
     * Constructor of Organ class
     *
     * @param ms
     */
    public Stomach(int ms, double vol) {
        super(ms);
        volume = vol;
    }

    public String TakeFood(String food)
    {
        if(Digest())
            return "digested";
        else return "undigested";
    }

    public boolean Digest()
    {
        return true;
    }
}
