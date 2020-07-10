package exs;


public class Ex4_4 {
    public static void main(String[] args) {
        int a, b, c;
        int min;
 
        a=6;
        b=2;
        c=1;

        min = menornum (a,b,c);
        System.out.println("O menor número é: " + min);

    }


    static int menornum (int x, int y, int z) {
        int min;
        //return termina a função
        if (x<=y && x<=z) {
             min = x;
            
            }else{
                if(y<=z) {
                    min = y;
                }else {
                    min = z;
                }
        }
        return min;
        //return termina a função
        /*
        if (x<=y && x<=z) {
            return x;
        if (y<=z) {
            return y;           
        }
        return z;
        */

    }
    
}