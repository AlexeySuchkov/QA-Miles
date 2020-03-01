public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        int bonusCount = registered ? 20 : 0;
        long pricePaid = 12575;
        long bonus = pricePaid / bonusCount;
        System.out.println(bonus);
    }
}
