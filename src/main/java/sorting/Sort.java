package sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public abstract class Sort {

    public int[] array;

    private Instant startTime;

    private Instant endTime;

    public Sort() {
        try {
            Random random = new Random();
            int randomArraySize = random.nextInt(10);
            setArray(randomArraySize);
            fillArray(randomArraySize, random);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setArray(int size) {
        this.array = new int[size];
    }

    private void fillArray(int size, Random random) {
        for (int i = 0; i < size; i++) {
            this.array[i] = random.nextInt(size);
        }
    }

    public Sort(int size) {
        this.array = new int[size];
        for (int i = size; i > 0; i--) {
            this.array[size - i] = i;
        }
    }

    abstract public void perform();

    abstract public void print();

    abstract public void printBefore();

    public void setStartTime() {
        this.startTime = Instant.now();
    }

    public void setEndTime() {
        this.endTime = Instant.now();
    }

    public void calculateRunningTime() {
        Duration timeElapsed = Duration.between(this.startTime, this.endTime);
        System.out.println("\n Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }

    public void display() {
        Arrays.stream(this.array).forEach(it -> {
            System.out.print(" " + it);
        });
    }

}
