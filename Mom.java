import java.util.Random;

public class Mom <T> {

    int money;
    int income;
    Location loc;
    String race;
    int age;
    double risk;
    int cost;
    boolean complication = false;
    boolean insurance = true;
    boolean death = false;
    boolean home = false;

    Mom(int i,String r,int a){
        income = i;
        race = r;
        age = a;
    }

    public void setLoc(String l,int hc,int ic,int nic) {
        loc = new Location(l,hc,ic,nic);
    }

    public int getMoney() {
        return money;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public double getRisk() {
        return risk;
    }

    public int getCost() {
        return cost;
    }

    public boolean isHome() {
        return home;
    }

    public boolean isInsured() {
        return insurance;
    }

    public boolean isComplicated() {
        return complication;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public int setInitialMoney() {
        if (income < 30001) {
            money = 2000;
        } else if (income < 60001) {
            money = 7000;
        } else if (income < 90001) {
            money = 16000;
        } else if (income < 120001) {
            money = 30000;
        } else if (income < 150001) {
            money = 70000;
        }
        return (money);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setInsurance() {
        if (money == 2000) {
            insurance = false;
        }
    }

    public boolean isDeath(){
       return(death);
    }

    public boolean complication(){
        double cRisk = loc.compRisk();
        int randInt = new Random().nextInt(101);
        if(randInt<cRisk){
            complication = true;
        }
        return(complication);
    }

    public boolean death(){
        risk = loc.locRisk();
        if(complication){
            if(home){
                risk = risk*3;
            }
            else{
               risk = risk*2;
            }
        }
        if(age>=35){
            risk = risk*1.5;
        }
        int randInt = new Random().nextInt(101);
        if(randInt<risk){
            death = true;
        }
        return(death);
    }
}
