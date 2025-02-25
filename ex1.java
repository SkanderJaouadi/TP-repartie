
import java.util.Scanner;


class Calculatrice{
    int x;
    int y;
    Calculatrice(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int addition(int x,int y){
        return x+y;
    }
    public int soustraction(int x,int y){
        return x-y;
    }
    public int div(int x,int y){
        if (y==0){
            return -1;
        }
        else {
            return x/y;
        }
        
    }

    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("donner un nb");
        int x=sa.nextInt();
        System.out.println("donner un nb");
        int y=sa.nextInt();
        System.out.println("div : / , add : + ,sub : -");
        String ch=sa.next();
        Calculatrice c=new Calculatrice(x, y);
        int resulta=0;
        if (ch.equals("/")){
            resulta=c.div(x, y);
        }
        if (ch.equals("+")){
            resulta=c.addition(x, y);
        }
        if (ch.equals("-")){
            resulta=c.soustraction(x,y);
        }
        System.out.println("resulta : "+resulta);
    }
}

