public class Story {
    public static void main (String [] args){
        Friends friends = new Friends();
        Koslick Koslick = new Koslick();
        floor firstfloor = new floor(-2, 10);
        floor secondfloor = new floor(-4, 5);
        Canteen canteen = new Canteen();
        difference text = new difference(firstfloor, secondfloor);

        friends.getMoney();
        friends.stayMoney(10);
        System.out.print("На оставшиеся деньги ");
        friends.haveadinner(canteen);
        friends.haveabreakfast(howOften.rarely);
        friends.havealunch(howOften.rarely);
        Koslick.talk();
        text.cost();
        text.isMore();
        text.onrat(staff.rats);
    }
}
