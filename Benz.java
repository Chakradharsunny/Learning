public class Benz {
    public static void main(String []args){
        int track =1;
        int x= 50;
        Scanner sc= new Scanner(System.in);
        While (track < 26) {
            track=track+1;
            System.out.println("Enter a number");
            int num=sc.nxtInt();
            if (num %2 ==0) {
                System.out.println("number is even,number."+num);
            }
            else {
                System.out.println("number is odd,number."+num);
                System.out.println("funny");
            }
        }

    }
    
}
