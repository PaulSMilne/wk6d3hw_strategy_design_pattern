public class DealCanasta implements Deal {
     @Override
     public int drawPile (int numberOfHands){
          return "Draw pile for Canasta is " + (108 - (numberOfHands * 13)) + " cards".;
     }
}