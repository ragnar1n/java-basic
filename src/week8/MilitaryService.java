package week8;

public class MilitaryService implements Ex10.NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return daysLeft;
    }
    @Override
    public void work() {
        if (daysLeft > 0) {
            daysLeft --;
        }
    }
}
