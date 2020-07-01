public class MoneyBookAdapter implements Payment {
    private Moneybook moneybook;
    public MoneyBookAdapter(Moneybook moneybook)
    {
        this.moneybook=moneybook;
    }
    @Override
    public void pay(int amount) {
        moneybook.doPayment(amount);

    }
}
