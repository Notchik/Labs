package HeadOrgans;

public class Ear extends HeadOrgan{
    boolean earring;
    /**
     * Constructor of Organ class
     *
     * @param ms
     */
    public Ear(int ms, boolean ear_ring) {
        super(ms);
        earring = ear_ring;
    }

    /**Method Hear
     * @return String with feelings*/
    public String Hear()
    {
        double a = Math.random()*4+1;
        int b = (int) a;

        switch (b)
        {
            case 1: return "What is love? Baby don't hurt me...";

            case 2: return "Hmm,Too silent in a room";

            case 3: return "It's my live!!!";

            case 4: return "I remember this sound from my childhood";

            default: return "WTF?";
        }
    }
}
