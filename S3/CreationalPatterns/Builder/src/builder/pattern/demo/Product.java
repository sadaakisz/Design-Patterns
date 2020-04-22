package builder.pattern.demo;

import java.util.LinkedList;

//Product
public class Product {
    private LinkedList<String> parts;
    public Product(){
        parts=new LinkedList<String>();
    }
    public void add (String part){
        //Adding parts
        parts.addLast(part);
    }
    public void show(){
        System.out.println("\n Product completed as below :");
        for(int i=0; i<parts.size(); i++){
            System.out.println(parts.get(i));
        }
    }
}
