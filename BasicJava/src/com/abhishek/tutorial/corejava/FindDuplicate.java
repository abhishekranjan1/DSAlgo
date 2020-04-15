package com.abhishek.tutorial.corejava;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));

    }

        public static int findDuplicate(int[] nums) {
            int sum=0;
            int tempSum =0;
            for(int i=0; i< nums.length;i++){
                sum +=nums[i];

            }
            for(int j=0; j< nums.length; j++){
                tempSum = tempSum ^ nums[j];
            }
            
            System.out.println(sum);
            System.out.println(tempSum);

            return (sum-tempSum)/2;

        }
    }

