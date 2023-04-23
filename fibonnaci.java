public class fibonnaci {
    public static void main(String[] args) {
        
        int a,b,c;

        a = 1;
        b = 1;
        System.out.println("Fibbonaci");

        System.out.print(" "+ a);
        System.out.print(" "+ b);

       for(c=0; c<55; c++){
        c = a + b;
        a = b;
        b = c;

        System.out.print(" "+ c);
       }

       
        
         

    }
    
}
