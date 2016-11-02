public class Hand {
     private Deal deal;

     public Hand(Deal deal){
          this.deal = deal;
     }

     public int cardsDeal(int numberOfHands){
          return deal.discardPile(numberOfHands);
     }
}