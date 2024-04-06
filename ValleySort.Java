import java.util.ArrayList;
import java.util.Scanner;


public class ValleySort{

    public static void main(String[] args) {

        // populate array intarray with input data 

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

        // create new output array
        ArrayList finalarray = new ArrayList<>();

        // add even array indices in order to new array 

        for (int i=0; i<size;i++){
            if (i%2==0){
                int num = Integer.parseInt(newarray.get(i).toString());
                //newarray.remove(i); 
                finalarray.add(num);
            }
            
        }

        // sort the original array 

        newarray.sort(null);


        // if the size of original array is even, add even array indices in order to new array

        if (size%2==0){
        for (int i=0; i<size-1;i++){
            if (i%2==0){
                int num = Integer.parseInt(newarray.get(i).toString());
                //newarray.remove(i); 
                finalarray.add(num);
            }
        }}

        // if the size of original array is odd, add odd array indices in order to new array

        else{
            for (int i=0; i<size-1;i++){
                if (i%2!=0){
                    int num = Integer.parseInt(newarray.get(i).toString());
                    //newarray.remove(i); 
                    finalarray.add(num);
                }
            }
        }
        // print size of input array

         System.out.println(size);

         // print out each valley of output array
        
         for (int i = 0; i<size; i++){
            System.out.println(finalarray.get(i));
         }
        scanner.close();
    }}
