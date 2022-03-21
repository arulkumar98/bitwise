class Main {
    public static void main(String[] args) {
  
      int number1 = 12, number2 = 25, result;
        //12 = 01100
        //25 = 11001
  
      // bitwise OR between 12 and 25
      result = number1 | number2;
      System.out.println(result);    

       // bitwise AND between 12 and 25
      result = number1 & number2;
      System.out.println(result);    

      // bitwise XOR between 12 and 25
     result = number1 ^ number2;
     System.out.println(result);    



     // Bitwise ~ Complement
     int number = 35, result2;
     result2 = ~number;
     System.out.println(result2);

     //Left Shift << Operators
     int numberLeft = 2; 
     int resultLeft = numberLeft << 2;
     System.out.println(resultLeft);
     
     
      //Right Shift >> Operators
     int numberRight = 8;
     System.out.println(numberRight >> 2);

     
   
     

















    }
  }
  