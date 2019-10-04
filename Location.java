public class Location {
    
    String loc = " ";
    String race;
    double deathRisk;
    double compRisk;
    int homeCost;
    int insuredCost;
    int notInsuredCost;
    Mom bob;

    Location(String l,Mom b){
        loc = l;
        bob = b;
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

    public void instantiateCosts() {
        if (loc == "Boston") {
            insuredCost = 3700;
            notInsuredCost = 30000;
            homeCost = 3100;
        } else if (loc == "Atlanta") {
            insuredCost = 6693;
            notInsuredCost = 12447;
            homeCost = 3500;
        } else if (loc == "Buenos Aires") {
            insuredCost = 106;
            notInsuredCost = 2237;
        } else if (loc == "Berlin") {
            insuredCost = 0;
            notInsuredCost = 0;
            homeCost = 0;
        } else if (loc == "Cairo") {
            insuredCost = 100;
        } else if (loc == "Jakarta") {
            insuredCost = 1650;
            notInsuredCost = 250; //check with Lauren
            homeCost = 0;
        }
    }

    public void compCosts() {
        boolean c = bob.isComplicated();
        if(c){
            if (loc == "Boston") {
                insuredCost = 5750;
                notInsuredCost = 50000;
                homeCost = 3100;
            } else if (loc == "Atlanta") {
                insuredCost = 9427;
                notInsuredCost = 16711;
                homeCost = 3500;
            } else if (loc == "Buenos Aires") {
                insuredCost = 526;
                notInsuredCost = 2972;
            } else if (loc == "Berlin") {
                insuredCost = 0;
                notInsuredCost = 0;
                homeCost = 0;
            } else if (loc == "Cairo") {
                insuredCost = 500;
         } else if (loc == "Jakarta") {
                insuredCost = 2205;
                notInsuredCost = 460; //check with Lauren
                homeCost = 0;
            }
        }
    }

    public double locRisk() {
        if(loc=="Jakarta"){
            deathRisk = 63;
        }
        else if(loc=="Cairo"){
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
        if(loc=="Cairo"||loc=="Buenos Aires") {
            compRisk = 75;
        }
        else{
            compRisk = 25;
        }
        return(compRisk);
    }

}
