public class McDonalds {
    public static void main(String[] args) {
       //ourterloop.
        for (int i=1; i<=2; i++){
            System.out.println("Outer:"+i);//Execute 2 times

        // Innerloop.
            for (int j=1; j<=3; j++) {
            System.out.println("Inner:"+j);//Execute 6 times
            }
        }
    }
}
