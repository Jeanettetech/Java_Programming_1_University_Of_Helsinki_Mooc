
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.50;
    private static final double HEARTY_PRICE = 4.30;


    public PaymentTerminal() {
        this.money = 1000;// register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        if (AFFORDABLE_PRICE <= payment) {// an affordable meal costs 2.50 euros
            this.money += AFFORDABLE_PRICE;// increase the amount of cash by the price of an affordable mean and return the change
            affordableMeals++;
            return payment -= AFFORDABLE_PRICE; // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        }

        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (AFFORDABLE_PRICE <= card.balance()) {
            affordableMeals++;
            return card.takeMoney(AFFORDABLE_PRICE);
        }

        return false;

    }

    public double eatHeartily(double payment) {
        if (HEARTY_PRICE <= payment) { // a hearty meal costs 4.30 euros
            this.money += HEARTY_PRICE; // increase the amount of cash by the price of a hearty mean and return the change
            heartyMeals++;
            return payment - HEARTY_PRICE;   // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        }

        return payment;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (HEARTY_PRICE <= card.balance()) {
            heartyMeals++;
            return card.takeMoney(HEARTY_PRICE);
        }

        return false;

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
        return;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
