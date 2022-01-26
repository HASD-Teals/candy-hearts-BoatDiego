public class HeartsClient {
    public static void main(String[] args) throws Exception {

        Heart group1 = new Heart("red", "Hi", 3, 0, 5.00, false, 50);
        Heart group2 = new Heart("teal", "Love CS-A", 5, 0, 4.50, false, 200);
        Heart group3 = new Heart("green", "Go Girl!", 2, 0, 3.5, false, 75);

        // System.out.println(group1.getReport());
        Heart[] Store = { group1, group2, group3 };
        orderHearts("red", 20, Store);

    }

    public static int buyOut(Heart[]Store) {
        int totalHearts = 0;
        for (int i = 0; i < Store.length; i++) {
            totalHearts += Store[i].getStock();
        }
        return totalHearts;
    }

    public static void orderHearts(String Color, int amountOrdered, Heart[] Store){
        for (int i = 0; i < Store.length; i++) {
            if (Color.equalsIgnoreCase(Store[i].getColor())&& Store[i].getStock()- amountOrdered >=0){
                Store[i].adjStock(Store[i].getStock()- amountOrdered);
                System.out.println("Your order is finished");
                System.out.println("You ordered: "+ Color);
                System.out.println("Final price will be: "+ amountOrdered*Store[i].getCost());
            }
            else{
                System.out.println("Checking...");
            }
            }
          
        
    }
}
