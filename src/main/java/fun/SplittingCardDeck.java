package fun;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * В очень темной комнате вам дают колоду карт, в которой 52 карты. 13 карт из 52 перевернуты рубашкой вниз
 * и распределены случайным образом в колоде. Ваша задача разделить карты на две стопки, таким образом,
 * чтобы в каждой стопке лежало одинаковое количество карт рубашкой вверх. Переворачивать карты можно.
 * <p>
 * Пользоваться различными хитростями, фонариками и подобными вещами нельзя.
 * У вас есть просто колода карт, темное помещение, в котором вы точно не видите карты и больше ничего.
 * <p>
 * Подсказки:
 * - Если вы решите просто поделить колоду поровну, то вряд ли у вас получится выполнить задание, так как все карты рубашкой вверх могут оказаться, к примеру в одной стопке.
 * - Стопки могут быть не одинаковыми по количеству карт, главное чтобы число перевернутых рубашкой вверх карт было одинаковым
 * - Вы можете переворачивать карты, правда вы не будете знать на какую сторону вы перевернули карту.
 * <p>
 * Решение: Необходимо отсчитать 13 карт, а оставшуюся колоду перевернуть.
 * Получится две стопки в которых одинаковое количество карт рубашкой вверх.
 * <p>
 * <a href="https://millionzagadok.ru/zag/cont/6939.html">Загадка взята отсюда</a>
 */
public class SplittingCardDeck {

    private static final int countOfOpenCards = 13; // you can change it from 1 to (((maxCardNumber + 1 - startCardNumber + 4) * 4) - 1)
    private static final int startCardNumber = 2;
    private static final int maxCardNumber = 10; // you can change it to 1M (and countOfOpenCards) and see how long executing splitting

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Card> cardList = fillAndMixCardDeck();

        setOpenStatusForNumberOfCardRandomly(cardList, countOfOpenCards);
        splitCardDeckInTwo(cardList, countOfOpenCards);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private static List<Card> fillAndMixCardDeck() {
        Set<Card> cardDeckSet = new HashSet<>();
        for (CardSuit cardSuit : CardSuit.values()) {
            for (int i = startCardNumber; i <= maxCardNumber; i++) {
                cardDeckSet.add(new Card(Integer.toString(i), cardSuit));
            }
            for (NonNumericCart cartName : NonNumericCart.values()) {
                cardDeckSet.add(new Card(cartName.toString(), cardSuit));
            }
        }
        List<Card> cardList = new ArrayList<>(cardDeckSet);
        Collections.shuffle(cardList);

        return cardList;
    }

    private static void setOpenStatusForNumberOfCardRandomly(List<Card> cardList, int number) {
        Set<Integer> openCardIndexes = new HashSet<>();
        while (openCardIndexes.size() < number) {
            openCardIndexes.add(new Random().nextInt(cardList.size()));
        }
        for (Integer indexOfOpenCard : openCardIndexes) {
            cardList.get(indexOfOpenCard).setStatus(Status.OPEN);
        }
    }

    private static void splitCardDeckInTwo(List<Card> cardDeck, int countOfOpenCards) {
        Collections.shuffle(cardDeck); // Yeee! I need more shuffle!!!
        List<Card> firstPathOfCardDeck = new ArrayList<>();
        for (int i = countOfOpenCards; i < cardDeck.size(); i++) {
            Card card = cardDeck.get(i);
            firstPathOfCardDeck.add(card);
        }

        List<Card> secondPathOfCardDeck = cardDeck.stream().limit(countOfOpenCards).collect(Collectors.toList());
        for (int i = 0; i < secondPathOfCardDeck.size(); i++) {
            Card card = secondPathOfCardDeck.get(i);
            if (card.getStatus().equals(Status.CLOSE)) {
                card.setStatus(Status.OPEN);
            } else {
                card.setStatus(Status.CLOSE);
            }
        }

        long openCardCountInOriginalDeck = firstPathOfCardDeck.stream().filter(x -> x.getStatus().equals(Status.OPEN)).count();
        System.out.printf("First  part of split card deck(count: %s) contains %s OPEN cards.\n", firstPathOfCardDeck.size(), openCardCountInOriginalDeck);
        long takenFirstNCardsFromDeckCount = secondPathOfCardDeck.stream().filter(x -> x.getStatus().equals(Status.OPEN)).count();
        System.out.printf("Second part of split card deck(count: %s) contains %s OPEN cards.\n", countOfOpenCards, takenFirstNCardsFromDeckCount);

    }

    @Data
    @EqualsAndHashCode
    private static class Card {
        private String name;
        private CardSuit suit;
        private Status status = Status.CLOSE;

        public Card(String name, CardSuit suit) {
            this.name = name;
            this.suit = suit;
        }
    }

    @AllArgsConstructor
    private enum CardSuit {
        HEARTS("Hearts"), // Hearts ♡
        DIAMONDS("Diamonds"), // Tiles ♢
        CLOVERS("Clovers"), // Clubs ♧
        SPADES("Spades"); // Pikes ♤
        private final String suitName;
    }

    @AllArgsConstructor
    private enum NonNumericCart {
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King"),
        ACE("Ace");
        private final String name;

        @Override
        public String toString() {
            return name;
        }
    }

    private enum Status {
        OPEN, CLOSE;
    }

}
