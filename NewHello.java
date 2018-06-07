package testconsole;

import java.util.ArrayList;
import java.util.List;

public class NewHello {

    public static List<Character> alpha = new ArrayList<>();
    
    public static void main(String[] args) throws InterruptedException  {
        
        for(char c = 'A'; c <= 'z'; c++){
            alpha.add(c);
        }
        alpha.add(' ');
        
        String hello = "Hello World^^";
        
        int i = 0;
        while(i < hello.length()){
            identChar(hello.charAt(i));
            i++;
        }
        
        System.out.print('\n');
        
    }
    
    static void identChar(char c) throws InterruptedException{
        char rc = radomChar();
        while(rc != c){
            System.out.print(rc);
            Thread.sleep(200);
            System.out.print("\b");
            rc = radomChar();
        }
        System.out.print(rc);
    }
    
    static char radomChar(){
        return alpha.get(0 + (int)(Math.random() * alpha.size()));
    }
}