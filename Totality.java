public class Totality {
     public int sum(int[] a, String stype) {
         int osum = 0;
         int esum = 0;
         int fsum = 0;
         for( int i = 0; i < a.length; i+=1){
           if(i % 2 == 0){
             esum += a[i];
           }
           else{
             osum += a[i];
           }
         }
         if(stype.equals("odd")){
           fsum = osum;
          }
        else if(stype.equals("even")){
           fsum = esum;
         }
        else{
           fsum =  esum + osum;
         }
      return fsum;
 }
}