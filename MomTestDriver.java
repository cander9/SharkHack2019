public class MomTestDriver {
    public static void main(String[] args) {
        int i;
        for(i = 0;i < 10;i++){

            Mom bob = new Mom(50000,"black",44);
            bob.setLoc("Cairo",bob);
            System.out.println("initial Money: "+bob.setInitialMoney());
            bob.setInsurance();
            System.out.println("Insured? "+bob.isInsured());
            //bob.setHome(true);
            System.out.println("Money before birth: "+bob.getMoney());
            System.out.println("Complicated? "+bob.complication());
            System.out.println(bob.isComplicated());
            System.out.println("Money after birth: "+bob.getMoney());
            System.out.println("Dead? "+bob.death());
            System.out.println(bob.isDeath());

        }
    }
}
