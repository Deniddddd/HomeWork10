
import java.util.Arrays;

public class Mars {
        public static void main(String[] args) {
            int [] firstArray = new int [100];
            String tmp;
            int count=0;

            for (int i=0; i < firstArray.length; i++){
                firstArray [i] = i+1;
                tmp = Integer.toString(firstArray[i]);
                if (tmp.contains("9") || tmp.contains("4")) {
                    count++;
                }
            }
            int [] secondArray = new int [firstArray.length-count];
            for (int i=0, j=0; i < firstArray.length; i++){
                tmp = Integer.toString(firstArray[i]);
                if (tmp.contains("9") || tmp.contains("4")) {
                }
                else {
                    secondArray[j] = firstArray[i];
                    j++;
                }
            }
            firstArray=secondArray;
            for (int a : firstArray) {
                System.out.println(a);
            }
        }
    }
