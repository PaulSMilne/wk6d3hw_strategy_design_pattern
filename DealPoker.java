public class DealPoker implements Deal {
     @Override
     public int drawPile (int numberOfHands){
          return (52 - (numberOfHands * 5));
     }
}