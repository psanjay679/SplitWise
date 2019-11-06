import java.util.List;

public class EqualExpense extends Expense {

    public EqualExpense(String name, double totalAmount, User paidBy) {
        super(name, totalAmount, paidBy);
    }

    @Override
    public void recalculate() {

    }
}
