package com.example.java;

public interface Transport {
   String getType();
   String getMake();
   int getTotalDoors();
   void setType(String type);

   default void newMethod(){
      String test = "Quentin";
      for (int i=0; i<3; i++){
         System.out.print(test);
      }
   }

   default int newMethod1(){
      int test = 0;
      return test;
   }



}
