public class GamePatternDemo {
     public static main(String[] args) {
          
          Hand hand = new Hand(new DealBriscola());
          System.out.println(hand.cardsDeal(5));

          hand = newHand(newDealPoker());
          System.out.println(hand.cardsDeal(6));

          hand = new Hand(new DealCanasta());
          System.out.println(hand.cardsDeal(4));
     }

}