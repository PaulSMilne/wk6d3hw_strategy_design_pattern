public class DealBriscola implements Deal {
     @Override
     public int drawPile (int numberOfHands){
          return "Draw pile for Briscola is " + (40 - (numberOfHands * 3)) + " cards".;
     }
}