public class DealCanasta implements Deal {
     @Override
     public int drawPile (int numberOfHands){
          return (108 - (numberOfHands * 13));
     }
}