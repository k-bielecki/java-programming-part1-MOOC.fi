
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double eatAffordablyCost = 2.5;
        if (payment >= eatAffordablyCost) {
            double changeAffordably = payment - eatAffordablyCost;
            this.money = this.money + eatAffordablyCost;
            affordableMeals++;
            return changeAffordably;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double eatHeartilyCost = 4.3;
        if (payment >= eatHeartilyCost) {
            double changeHeartily = payment - eatHeartilyCost;
            this.money = this.money + eatHeartilyCost;
            heartyMeals++;
            return changeHeartily;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double eatAffordablyCost = 2.5;
        if (card.balance() >= eatAffordablyCost) {
            card.takeMoney(eatAffordablyCost);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double eatHeartilyCost = 4.3;
        if (card.balance() >= eatHeartilyCost) {
            card.takeMoney(eatHeartilyCost);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard (PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
