package com.java24hours;

public class NumberDivider {
    public static void main(String[] args) 
    {
        if(args.length == 2){
            int result = 1;
            try  {
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
                System.out.println(args[0] + " divided by " + args[1] + " equals " + result);
            } 
            catch (NumberFormatException e) {
                System.out.println("Both arguements must be Ints");
            }
            catch (ArithmeticException e ){
                System.out.println("You cannot divide by 0");
            }
        }
    }
}
