package structure;

public class HashTable {

    String[] hashArray;
    int used = 0;
    int arrSize;

    public HashTable(int capacity) {
        if (!isPrimeNumber(capacity)) {
            capacity = getNextPrime(capacity);
        }
        arrSize = capacity;
        hashArray = new String[capacity];

    }

    int hasFunc1(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arrSize;

        if (hashVal < 0) {
            hashVal = hashVal + arrSize;
        }
        return hashVal;
    }

    int hasFunc2(int hashVal) {
        return 3 - hashVal % 3;
    }

    public boolean insert(String word) {
        int hashVal = hasFunc1(word);
        int stepSize = hasFunc2(hashVal);

        while (hashArray[hashVal] != null) {
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arrSize;
        }

        hashArray[hashVal] = word;
        used++;
        System.out.printf("\n Inserted word %s at index %s total space used is %s"
                , word
                , hashVal
                , used);
        return true;
    }

    public int find(String word) {
        int hashVal = hasFunc1(word);
        int stepSize = hasFunc2(hashVal);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].equalsIgnoreCase(word)) {
                return hashVal;
            }
            hashVal += stepSize;
            hashVal%=stepSize;
        }
        return -1;
    }

    private boolean isPrimeNumber(int capacity) {
        for (int i = 2; i * i < capacity; i++) {
            if (capacity % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getNextPrime(int num) {
        for (int i = num; ; i++) {
            if (isPrimeNumber(i)) {
                return i;
            }
        }
    }


}
