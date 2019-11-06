public class ExactAmountExpense extends Expense {

    public ExactAmountExpense (String name, double totalAmount, User paidBy) {
        super(name, totalAmount, paidBy);
    }

    @Override
    public void recalculate() {}
}
