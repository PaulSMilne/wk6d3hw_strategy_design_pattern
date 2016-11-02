public class DealCanasta implements Deal {
     @Override
     public int discardPile (int numberOfHands, int deckSize);{
          return deckSize - (numberOfHands * 13);
     }
}