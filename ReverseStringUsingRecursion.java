import java.util.Scanner;

public class ReverseStringUsingRecursion {
    StringBuilder reversedString;
    public static void main(String[] args){
        String inputStr, reversedString;
        Scanner in = new Scanner(System.in);
        inputStr = in.nextLine();
        int n = inputStr.length();
        ReverseStringUsingRecursion obj = new ReverseStringUsingRecursion();
        reversedString = obj.reverseString(inputStr, n) ;
        System.out.println(reversedString);
    }
    public ReverseStringUsingRecursion(){
        reversedString = new StringBuilder();
    }
    public String reverseString(String inputStr, int n){

        if (n > 0){
            reversedString.append(inputStr.charAt(n - 1));
            n -= 1;
            reverseString(inputStr, n);
        }

        return reversedString.toString();
    }
}
