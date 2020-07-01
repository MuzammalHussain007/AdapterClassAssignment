public class Paypal implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Money of amount"+amount+"has been paid");
    }
}
