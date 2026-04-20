/**
 * A class representing a pair of int values
 *
 * @param x first value
 * @param y second value
 */
public record Pair(int x, int y) {
    /**
     * Computes the sum of the two values of the pair
     *
     * @return The sum of the two values
     */
    public int getSum() {
        return this.x + this.y;
    }
}
