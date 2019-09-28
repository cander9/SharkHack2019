public class Location {
    String loc;
    String race;
    double deathRisk;
    double compRisk;
    int homeCost;
    int insuredCost;
    int notInsuredCost;

    Location(String l,int hc,int ic,int nic){
        loc = l;
        homeCost = hc;
        insuredCost = ic;
        notInsuredCost = nic;
    }

    public String getLoc() {
        return loc;
    }

    public double getDeathRisk() {
        return deathRisk;
    }

    public int getHomeCost() {
        return homeCost;
    }

    public int getInsuredCost() {
        return insuredCost;
    }

    public int getNotInsuredCost() {
        return notInsuredCost;
    }

    public double locRisk() {
        if(loc=="Jakarta"){
            deathRisk = 63;
        }
        else if(loc=="Egypt"){
            deathRisk = 17;
        }
        else if(loc=="Buenos Aires"){
            deathRisk = 7;
        }
        else if(loc=="Berlin"){
            deathRisk = 3;
        }
        else if(loc=="Atlanta") {
            if (race == "black") {
                deathRisk = 47;
            } else if (race == "white") {
                deathRisk = 7;
            } else {
                deathRisk = 32;
            }
        }
        else if(loc=="Boston") {
            if (race == "black") {
                deathRisk = 24;
            } else if (race == "white") {
                deathRisk = 12;
            } else {
                deathRisk = 15;
            }
        }
        return(deathRisk);
    }

    public double compRisk() {
        if(loc=="Egypt"||loc=="Buenos Aires") {
            compRisk = 75;
        }
        else{
            compRisk = 25;
        }
        return(compRisk);
    }

}
