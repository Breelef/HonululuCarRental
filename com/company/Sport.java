package com.company;

public class Sport extends Vehicle{
    boolean gear;
    int HP;

    public Sport(String b, String m, String f, int nr, int year, int month, boolean g, int hp){
        super(b, m, f, nr, year, month);
        gear = g;
        HP = hp;
    }

    public Sport() {
    }
    @Override
    public String toString(){
        String g = "";
        if(gear){
            g = "Manuel gear";
        }else
            g = "Automat gear";
        return ("Mærke: "+brand+"\nModel: "+model+"\nBenzin type: "+fuel+"\nGear type: "+g+
                "\nHorse Power: "+HP+"\nRegistreringsnummer: "+regNr+"\nRegistreringsdato: "+regMonth+"/"+regYear);
    }
}
