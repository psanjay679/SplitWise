public class PercentageExpense extends Expense {

    public PercentageExpense(String name, double totalAmount, User paidBy) {
        super(name, totalAmount, paidBy);
    }

    @Override
    public void recalculate() {}
}
