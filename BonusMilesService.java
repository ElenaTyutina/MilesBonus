public class BonusMilesService {
    public int calculate(int cost) {

        int miles=1;
        int milesCost = 20;
        return cost * miles / milesCost;
    }
}
