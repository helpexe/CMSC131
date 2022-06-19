public class ContinueBreakLoops3 {
    public static void main(String[] args) {
        int x = 0;
        while(true) {
            x++;
            if(x == 20) {
                break; // Exit loop when x == 20
            }
            if(x % 2 == 0) {
                continue; // Skip printing even numbers
            }
            System.out.println(x);
        }
    }
}
