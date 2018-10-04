package Manusia;
public abstract class Manusia {
  //mendeklarasi variable
    private double TinggiBadan;
    //constructor
    public Manusia (double TB)
    {
        TinggiBadan=TB;
    }
    //getter
    public double getTB()
    {
        return TinggiBadan;
    }
    //method HtgBBI
    public abstract double HtgBBI();
    
    }   

