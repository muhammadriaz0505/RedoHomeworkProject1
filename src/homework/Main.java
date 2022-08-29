package homework;

public class Main {
    public static void main(String[] args) {
        //All odd numbers from 1-100
        for (int i=0; i<=100; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Modifying code All even numbers from 1-100
        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
