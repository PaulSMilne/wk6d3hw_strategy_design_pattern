public class GamePatternDemo {
     public static void main(String[] args) {

          Hand hand = new Hand(new DealBriscola());
          System.out.println("Draw pile is " + hand.cardsDeal(4) + " cards.");

          hand = new Hand(new DealPoker());
          System.out.println("Draw pile is " + hand.cardsDeal(4) + " cards.");

          hand = new Hand(new DealCanasta());
          System.out.println("Draw pile is " + hand.cardsDeal(4) + " cards.");
     }

}