public class DemoClas {
    public static void main(String args[])
    {
        Paypal paypal= new Paypal();
        paypal.pay(1000);
        Moneybook moneybook =new Moneybook();
        moneybook.doPayment(2000);
        System.out.println("Use of Adapter...............");
        MoneyBookAdapter moneyBookAdapter = new MoneyBookAdapter(moneybook);
        moneyBookAdapter.pay(1000);
    }
}
