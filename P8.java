import java.util.Scanner;
import java.util.Arrays;

public class P8 {

    public static void errorHandlerOdd(int num){
        try{
            if(num%2 != 0){
                throw new Exception("Odd Number!");
            }
            else{
                System.out.println("Even Number");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void errorHandlerNotVowel(String word){
        try{
            Boolean vow = false;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) =='a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'|| word.charAt(i) == 'u'){
                    vow = true;
                }
            }
            if (vow) {
                throw new Exception("Contains vowels!");
            }
            else{
                System.out.println("Consonants only");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void errorHandlerDuplicate(int[] arr){
        try {
            Boolean flag = false;
            Arrays.sort(arr);
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] == arr[i+1]){
                    flag = true;
                }
            }
            if (flag) {
                throw new Exception("Duplicates Found!");
            }
            else{
                System.out.println("Unique integers only");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        errorHandlerOdd(num);


        System.out.println("Enter String: ");
        String str = sc.next();
        errorHandlerNotVowel(str);


        System.out.println("Enter Array: ");
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++ ){
            arr[i] = sc.nextInt();
            System.out.println();
        }
        
        errorHandlerDuplicate(arr);

        sc.close();
    }
}
