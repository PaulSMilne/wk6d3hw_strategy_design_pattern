public class DealPoker implements Deal {
     @Override
     public int drawPile (int numberOfHands){
          return "Draw pile for Poker is " + (52 - (numberOfHands * 5)) + " cards".;
     }
}