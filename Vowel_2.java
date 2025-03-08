import java.util.Scanner;

public class Vowel_2 {
    void foundVowel(String name){
        char char1[]={'a','e','i','o','u','A','E','I','O','U'};
            for(int i=0;i<10;i++){
            
            int nam=name.indexOf(char1[i]);
            int nam2=name.lastIndexOf(char1[i]);
           
            if(nam!= -1)
            {
                System.out.println("Your Vowel is: "+char1[i]+" Your Start Index:"+nam+" Your Last Index: "+nam2);
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String name=scan.nextLine();
        Vowel_2 index=new Vowel_2();
        index.foundVowel(name);
        scan.close();
        
    }
}