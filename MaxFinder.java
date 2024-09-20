import java.util.Vector;

class MaxFRomV
{
    import java.util.Vector;

    public class MaxFinder {
        public static void main(String[] args) {
            // Create and initialize the vector
            Vector<Integer> vector = new Vector<>();
            vector.add(10);
            vector.add(20);
            vector.add(5);
            vector.add(30);
            vector.add(15);
    
            // Find the maximum value
            int max = findMax(vector);
    
            // Output the result
            System.out.println("The maximum value is: " + max);
        }
    
        public static int findMax(Vector<Integer> vector) {
            if (vector == null || vector.isEmpty()) {
                throw new IllegalArgumentException("Vector is null or empty");
            }
    
            int max = vector.get(0); // Assume the first element is the maximum
            for (int i = 1; i < vector.size(); i++) {
                if (vector.get(i) > max) {
                    max = vector.get(i);
                }
            }
            return max;
        }
    }
    
}