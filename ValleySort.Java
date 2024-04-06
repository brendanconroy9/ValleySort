import java.util.ArrayList;
import java.util.Scanner;


public class ValleySort{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
    
        int j;
        ArrayList intarray = new ArrayList<>();
        for (int i=0;i<size;i++){

            j = scanner.nextInt();
            intarray.add(j);


        }
        // sort
        intarray.sort(null);
        
        // reverse sort
        ArrayList newarray = new ArrayList();
        for (int i = size-1; i>=0; i--) {
            newarray.add(intarray.get(i));
        }

        ArrayList finalarray = new ArrayList<>();

        for (int i=0; i<size;i++){
            if (i%2==0){
                int num = Integer.parseInt(newarray.get(i).toString());
                //newarray.remove(i); 
                finalarray.add(num);
            }
            
        }

        newarray.sort(null);
        // System.out.println(newarray);

        if (size%2==0){
        for (int i=0; i<size-1;i++){
            if (i%2==0){
                int num = Integer.parseInt(newarray.get(i).toString());
                //newarray.remove(i); 
                finalarray.add(num);
            }
        }}

        else{
            for (int i=0; i<size-1;i++){
                if (i%2!=0){
                    int num = Integer.parseInt(newarray.get(i).toString());
                    //newarray.remove(i); 
                    finalarray.add(num);
                }
            }
        }

        // for (int i = 0; i<(size-1)/2; i++){
        //     int num = Integer.parseInt(newarray.get(i*2).toString());
        //     newarray.remove(i*2); 
        //     finalarray.add(num);
        //     System.out.println(finalarray.get(i));
        // }
            // newarray.sort(null);

            // int size2 = newarray.size();
        // for (int i=0; i<size2; i++) {
        //     finalarray.add(newarray.get(i));

        // }

        // for (int i = 0; i<size/2; i++) {
        //     int num = Integer.parseInt(newarray.get(i*2).toString());
        //     newarray.remove(i*2); 
        //     finalarray.add(num);
        // }
         System.out.println(size);
         //System.out.println(finalarray.toString());
        

         for (int i = 0; i<size; i++){
            System.out.println(finalarray.get(i));
         }
         //System.out.println(finalarray.toString());
        
        // for (int i = size/2-1; i>=0; i--) {
        //     newarray.add(intarray.get(i));
        // }


       // System.out.println(intarray.get(j));
       // System.out.println(newarray);

        // inplement valley sort 

        // int midpoint = intarray.length/2;

       /* ArrayList finalArray = new ArrayList<>(size);

      


       // System.out.println();


    */
        scanner.close();
    }}
