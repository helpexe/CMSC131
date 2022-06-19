public class ContinueBreakLoops {
    public static void main(String[] args) {
        int x = 0;
        while(true) {
            if(x == 10) {
                break;
            }
            x++;
            System.out.println(x);
        }
    }
}
