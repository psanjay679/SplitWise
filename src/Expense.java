import java.time.LocalDate;
import java.util.List;


abstract class Expense {

    // name, date, image, location, notes

    private String name;
    private LocalDate date;
    private List<Image> images;
    private long uid;
    private GeoLocation location;
    private static long new_uid = 0;
    private double totalAmount;
    private User createBy;
    private User paidBy;
    private List<Split> splits;
    private ExpenseType type;

    public void recalculate() {};

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
        recalculate();
    }

    public GeoLocation getLocation() {
        return location;
    }

    public void addSplits(Split split) {
        this.splits.add(split);
        recalculate();
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    // validate method
    // calculateAmounts

    public Expense (String name, double totalAmount, User paidBy) {

        this.uid = new_uid++;
        this.name = name;
        this.totalAmount = totalAmount;
    }

    boolean validate() {

        Double sum = 0.0;

        for (Split s: splits) {
            sum += s.amount;
        }

        return sum == totalAmount;
    }
}
