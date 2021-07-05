import java.util.Scanner;
public class Myclass6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.print("Enter String : ");
    str = sc.nextLine();
    int len = str.length() - 1;
    int spaces=0, letter=0, digit=0, other=0;
    for(int i=0; i<=len; i++){
        if(str.charAt(i) == ' '){
            spaces++;
        }
        else if(Character.isLetter(str.charAt(i))){
            letter++;
        }
        else if(Character.isDigit(str.charAt(i))){
            digit++;
        }
        else{
                other++;    
        }
    }
    System.out.println("Letter : "+letter);
    System.out.println("Spaces : "+spaces);
    System.out.println("Digit : "+digit);
    System.out.println("Other : "+other);
    


    }
}