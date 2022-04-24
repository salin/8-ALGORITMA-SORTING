import java.util.*;
public class SELECTIONSORT {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan panjang array : ");
        int panjang = scan.nextInt();
        for (int i=0; i<= panjang-1; i++){
            System.out.print("index ke :"+i+" : ");
            int angka = scan.nextInt();
            arr.add(angka);
        }
        
        for (int i = 0;i<=panjang-2;i++){
            int jMIN = i;
            for (int j = i+1;j<=panjang-1;j++){
                if(arr.get(j)<arr.get(jMIN)){
                    jMIN=j;
                }
            }
            if (jMIN !=i){
                int temp = arr.get(i);
                arr.set(i, arr.get(jMIN));
                arr.set(jMIN, temp);
            }
        }
        System.out.println(arr);
    }
    
}
