public class Friends implements food{
    String name = "Друзья";
    public void getMoney(){
        System.out.println(name+"  заработали денег.");
    }
    public void stayMoney(int i){
        System.out.println(name+" откладывали "+i+" сантиков на ночлег.");
    }
    @Override
    public void haveabreakfast(howOften offen) {
        System.out.print(name+" завтракали");
        switch (offen){
            case always:
                System.out.println(" всегда.");
            case usually:
                System.out.println(" обычно.");
            case often:
                System.out.println(" часто.");
            case rarely:
                System.out.println(" редко.");
        }
    }
    public void havealunch(howOften offen) {
        System.out.print(name+" обедали");
        switch (offen){
            case always:
                System.out.println(" всегда.");
            case usually:
                System.out.println(" обычно.");
            case often:
                System.out.println(" часто.");
            case rarely:
                System.out.println(" редко.");
        }
    }
    public void haveadinner(Canteen can) {
        System.out.print(name+" ужинали ");
        can.toeat();
        System.out.print(".\n");
    }
}
