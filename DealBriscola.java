public class DealPoker implements Deal {
     @Override
     public int drawPile (int numberOfHands);{
          return 40 - (numberOfHands * 3);
     }
}