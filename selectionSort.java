
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class testSelectionSort {
        public static void sort(int arr[]){
        	 int N = arr.length;

             int i, j=0, pos, temp;

             for (i = 0; i < N; i++)
             {
             	//first mistake, initialize j to 0
                 pos = j;

                 for (j = i+1; j < N-1; j++)
                 {
                     if (arr[j] < arr[pos])
                     {
                    	//second mistake, pos = j instead pos = i
                         pos = j;
                     }
                 }

                 temp = arr[i];
                 arr[i] = arr[pos];
                 arr[pos]= temp;
             }
        }
        @Test
        public void testPositive() {
                int arr[]= {9,1,3};
                int exp[]= {1,3,9};
                testSelectionSort.sort(arr);
                assertArrayEquals(exp, arr);
        }
        @Test
        public void testNegatives() {
                int arr[]= {-9,-1,-3};
                int exp[]= {-9,-3,-1};
                testSelectionSort.sort(arr);
                assertArrayEquals(exp, arr);
        }
        @Test
        public void testMixed() {
                int arr[]= {-9,1,-3};
                int exp[]= {-9,-3,1};
                testSelectionSort.sort(arr);
                assertArrayEquals(exp, arr);
        }
}
