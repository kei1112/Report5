import java.lang.NullPointerException;

public class Report5{
    public static void main(String[] args){
        try{
            String name = null;
            System.out.print(name.length());
        } catch(NullPointerException e){
            System.out.println("NullPointException が発生！！");
            System.out.println(e.getMessage());
        }
    }
}


