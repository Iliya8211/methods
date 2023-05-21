import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //smallestNumber();
        //computeAverageOfThreeNumbers();
        //middleCharacterOfString();
        //countAllWords();
        //isEven();
        isPalindrome();

    }

    public static void smallestNumber() {
        Scanner myNum = new Scanner(System.in);
        int a;
        int b;
        int c;
        int smallest;
        System.out.println("Please enter your first number");
        a = myNum.nextInt();
        System.out.println("Please enter your second number");
        b = myNum.nextInt();
        System.out.println("Please enter your third number");
        c = myNum.nextInt();

        if (a < b) {
            if (c < a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if (b < c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
        System.out.println(smallest + " Is the smallest number");
    }

    public static void computeAverageOfThreeNumbers() {
        Scanner myNum = new Scanner(System.in);
        double a;
        double b;
        double c;
        double result;
        System.out.println("Please enter your first number");
        a = myNum.nextInt();
        System.out.println("Please enter your second number");
        b = myNum.nextInt();
        System.out.println("Please enter your third number");
        c = myNum.nextInt();
        result = (a + b + c) / 3;
        System.out.println("The average of those numbers is " + result);
    }

    public static void middleCharacterOfString() {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = str.nextLine();
        int pos;
        int len;
        if (word.length() % 2 == 0) {
            pos = word.length() / 2 - 1;
            len = 2;
        } else {
            pos = word.length() / 2;
            len = 1;
        }
        System.out.println("Middle character in the String is " + word.substring(pos, pos + len));
    }

    public static void countAllWords() {
        String str = "This is taken from Java tutorial";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))//chatAt method return the character at the specific index in a String. The start from 0 like in array.
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }

    public static void isEven() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number and the result will be true for even or odd");

        int num = input.nextInt();

        System.out.println(isEven(num));

    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) { // if the result is 0 that mean the number is even. For example 4%2 = 0.
            return true;
        }
        return false;//in any other case if the result is not even will be odd.
    }

    public static void isPalindrome (){
        int r,sum=0,temp;
        int n=454;

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
    //trial for commit
    }

