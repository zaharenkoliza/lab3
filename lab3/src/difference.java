public class difference implements floorlife{
    int floor1;
    int floor2;
    int price1;
    int price2;
    public difference (floor floorfirst, floor floorsecond){
        this.floor1=floorfirst.getNumber();
        this.floor2=floorsecond.getNumber();
        this.price1=floorfirst.getPrice();
        this.price2=floorsecond.getPrice();
    }

    @Override
    public void isMore() {
        if (floor1>floor2){
            staff[] things = staff.values();
            System.out.print("Однако, жизнь не почти отличалась, на "+floor2+" этаже было");
            for (int m = 0; m < things.length; m++) {
                switch (things[m]){
                    case dirt:
                        System.out.print(", больше грязи");
                        break;
                    case loud:
                        System.out.print(", больше шума");
                        break;
                    case smell:
                        System.out.print(", больше вони");
                        break;
                    case tightness:
                        System.out.print(", больше тесноты");
                        break;
                    case bedbugs:
                        System.out.print(", больше клопов");
                        break;
                    case freshAir:
                        System.out.println(".\nЕдинственное, чего было меньше, это свежый воздух.");
                        break;
                }
            }
        }

    }
    @Override
    public void cost() {
        if (price1>price2){
            System.out.println("В Тупичке они жили на "+floor2+", потому что за место здесь брали не "+price1+" сантиков, а "+price2+".");
        }
    }
    public void onrat(staff one){
        System.out.println("Было много крыс, что нельзя было не наступить на них.");
    }
}
