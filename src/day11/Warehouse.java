package day11;

public class Warehouse {
    private int countOrder;
    private int balance;

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        picker.doWork();
        courier.doWork();

        System.out.println(warehouse + " " + picker + " " + courier);
        for (int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }

        picker.bonus();
        courier.bonus();

        System.out.println(warehouse + " " + picker + " " + courier);
    }
    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }
}
