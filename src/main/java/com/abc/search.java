package com.abc;

public class search {
 public static void main(String[] arg){
       int l[]={1,8,5,3};
int first=0,last=l.length-1;
int a[]=sort.sorting(l);
int key=5;
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( a[mid] < key ){  
        first = mid + 1;    
      }else if ( a[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }
}
}

