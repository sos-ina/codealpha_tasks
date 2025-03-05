
package CodeAlpha;

import java.util.Scanner;

public class Artificial_Intelligence_Chatbot {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        
        System.out.println("AI: Hello there! how can i help you today?");
        
        
        while (true){
            System.out.print("--> ");
            String ans = input.next().toLowerCase();
            if(ans.contains("hello")|| ans.contains("hi"))
                System.out.println("AI: Hi there! How can I assist you?");
            else if(ans.contains("how are you") ||ans.contains("hru"))
                System.out.println("AI: I am well, how are you?"); 
            else if(ans.contains("bye") || ans.contains("exit")){
                System.out.println("AI: Adios!");
                break;}
            else
                System.out.println("AI: I'm not sure how to respond to that.");
        
        }
        
    
    }
    
}
