import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //EX1
//        try {
//            System.out.println("Enter number 1:");
//            int num1 = sc.nextInt();
//            System.out.println("Enter number 2:");
//            int num2 = sc.nextInt();
//
//            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
//            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
//            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
//            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
//            System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
//        } catch (InputMismatchException e){
//        System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        } catch (ArithmeticException e){
//        System.out.println("Arithmetic Exception has occurred, cause (" +e.getMessage()+").");
//        } catch (Exception e){
//        System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX2
//       System.out.println("Enter a number to print its multiplication table:");
//       try {
//        int number = sc.nextInt();
//
//        for (int i=1;i<=10;i++){
//            System.out.println(number+"X"+i+"="+(number*i));
//        }
//        } catch (InputMismatchException e){
//        System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        } catch (Exception e){
//        System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX3
//        System.out.println("Enter circle's radius:");
//        try {
//            double cRadius = sc.nextDouble();
//            double pi = 3.1415926535897932;
//            //Add a rule so a circle radius cannot be negative
//            checkNegativeNumber(cRadius);
//
//            System.out.println("Perimeter is = " + (2 * pi * cRadius));
//            System.out.println("Area is = " + (pi * (cRadius * cRadius)));
//        } catch (InputMismatchException e) {
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only numbers. Examples: 1.5,20,-3).");
//        } catch (Exception e) {
//            System.out.println("Exception has occurred, cause (" + e.getMessage() + ").");
//        }

        //EX4
//        System.out.println("Enter the count of numbers:");
//        try {
//            int count = sc.nextInt();
//            //Add rule to refuse negative number of entered numbers
//            checkNegativeNumber(count);
//            double average = 0;
//
//            for (int i = 0; i < count; i++) {
//                System.out.println("Enter an integer:");
//                average = (sc.nextInt() + average);
//            }
//            System.out.println("The average is: " + (average / count));
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        } catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX5

//        try {
//            System.out.println("Input the first number:");
//            int num1 = sc.nextInt();
//            System.out.println("Input the second number:");
//            int num2 = sc.nextInt();
//            System.out.println("Input the third number:");
//            int num3 = sc.nextInt();
//
//            boolean isEqual = false;
//            if ((num1 + num2 == num3)) {
//                isEqual = true;
//            }
//            System.out.println("Does the sum of first and second equals the third: " + isEqual);
//
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        } catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX6

//        try {
//            System.out.println("Enter the string to reverse:");
//            String sentence = sc.nextLine();
//            StringBuilder revSentence = new StringBuilder();
//
//            for (int i = sentence.length() - 1; i >= 0; i--) {
//                revSentence.append(sentence.charAt(i));
//            }
//            System.out.println(revSentence);
//        } catch (Exception e) {
//            System.out.println("Exception has occurred, cause (" + e.getMessage() + ").");
//        }

        //EX7

//       try {
//           System.out.println("Enter a number to check:");
//           int number = sc.nextInt();
//           checkIsZero(number); //Added because zero is neither positive nor negative.
//           if (number % 2 == 0) {
//               System.out.println("Is even.");
//           } else {
//               System.out.println("Is odd.");
//           }
//       }catch (InputMismatchException e){
//           System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//       } catch (Exception e){
//           System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//       }

        //EX8

//        try {
//            System.out.println("Enter the temperature in Centigrade:");
//            double temC = sc.nextDouble();
//            System.out.println("The temperature in Fahrenheit = "
//                    + ((temC * 9 / 5) + 32));
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only numbers. Examples: 1.5,20,-3).");
//        } catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX9

//        try {
//            System.out.println("Enter the string:");
//            String sentence = sc.nextLine();
//            System.out.println("Enter the index number:");
//            int pointer = sc.nextInt();
//            checkNegativeNumber(pointer);
//            System.out.println("The letter is:" + sentence.charAt(pointer));
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only numbers. Examples: 1.5,20,-3).");
//        } catch(IndexOutOfBoundsException e){
//            System.out.println("Index Out Of Bounds Exception occurred, cause (" + e.getMessage()+").");
//        } catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX10

//        try {
//            System.out.println("Enter triangle's width:");
//            double width = sc.nextDouble();
//            checkNegativeNumber(width);
//            System.out.println("Enter triangle's height:");
//            double height = sc.nextDouble();
//            checkNegativeNumber(height);
//
//            System.out.println("Area is " + width + " * " + height + " = " + (width * height));
//            System.out.println("Perimeter is 2 * " + "(" + width + " + " + height + ") = " + (2 * (width + height)));
//
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only numbers. Examples: 1.5,20,-3).");
//        } catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX11
//        try {
//        System.out.println("Enter first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = sc.nextInt();
//
//        if(num1==num2){
//            System.out.println(num1+"=="+num2);
//        }else {
//            System.out.println(num1+"!="+num2);
//        }
//
//        if(num1<num2){
//            System.out.println(num1+"<"+num2);
//        }else{
//            System.out.println(num1+">"+num2);
//        }
//
//        if (num1<=num2){
//            System.out.println(num1+"<="+num2);
//        }else {
//            System.out.println(num1+">="+num2);
//        }
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        }catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }


        //EX12
//        try {
//            System.out.println("Enter seconds: ");
//            int seconds = sc.nextInt();
//            checkNegativeNumber(seconds);
//            int hours = 0;
//            int minute = 0;
//
//            do {
//                if (seconds < 60) {
//                    break;
//                }
//                ++minute;
//                if (minute == 60) {
//                    ++hours;
//                    minute = 0;
//                }
//                seconds = seconds - 60;
//            } while (seconds >= 1);
//
//            System.out.println(hours + ":" + minute + ":" + seconds);
//
//        }catch (InputMismatchException e){
//        System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        } catch (Exception e){
//        System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX13
//        try {
//            System.out.println("Enter a number");
//            int num1 = sc.nextInt();
//            System.out.println("Enter a number");
//            int num2 = sc.nextInt();
//            System.out.println("Enter a number");
//            int num3 = sc.nextInt();
//            System.out.println("Enter a number");
//            int num4 = sc.nextInt();
//
//            boolean isEqual = num1 == num2 && num1 == num3 && num1 == num4;
//            if (isEqual) {
//                System.out.println("Numbers are equal");
//            } else {
//                System.out.println("Numbers are not equal");
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        }catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }


        //EX14
//        try {
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        if (num<0){
//            System.out.println("Is negative.");
//        } else if (num==0) {
//            System.out.println("Is Zero.");
//        }else {
//            System.out.println("Is positive.");
//        }
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        }catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX15
//        int pCount=0;
//        int nCount=0;
//        int zCount=0;
//        int num=0;
//        String yn =" ";
//
//     try {
//        do {
//            System.out.print("Enter a number: ");
//            num = sc.nextInt();
//            if (num==-1){
//                break;
//            } else if (num>0){
//                pCount++;
//            } else if (num < 0) {
//                nCount++;
//            } else {
//                zCount++;}
//            System.out.println("Continue? Enter Y/N.");
//            yn = sc.next();
//            while (!yn.equalsIgnoreCase("Y")&&!yn.equalsIgnoreCase("N")){
//                System.out.println("Unknown command, try again.");
//                yn = sc.next();
//            }
//        }while (yn.equalsIgnoreCase("Y"));
//
//            System.out.println("Positive count: "+pCount+". Negative count: "+nCount+". Zero count: "+zCount+".");
//
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        }catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX16

//        try {
//            System.out.println("Enter an integer to reverse:");
//            int number = sc.nextInt();
//            int pointer;
//            int newNumber = 0;
//
//            for (int i = 0; number > 0; i++) {
//                pointer = number % 10;
//                number = number / 10;
//                newNumber = newNumber * 10 + pointer;
//            }
//            System.out.println(newNumber);
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        }catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX17

//        try {
//            String yn = "";
//            System.out.print("Enter the first number: ");
//            int iniNum = sc.nextInt();//initial number for comparison
//            int numLargest = iniNum;
//            int numSmallest = iniNum;
//            do {
//                System.out.print("Enter a number: ");
//                int num = sc.nextInt();
//                //largest
//                if (num > iniNum) {
//                    numLargest = num;
//                }
//                if (num < iniNum) {
//                    numSmallest = num;
//                }
//                System.out.println("Continue? Enter Y/N.");
//                yn = sc.next();
//                while (!yn.equalsIgnoreCase("Y") && !yn.equalsIgnoreCase("N")) {
//                    System.out.println("Unknown command, try again.");
//                    yn = sc.next();
//                }
//            } while (yn.equalsIgnoreCase("Y"));
//            System.out.println("Largest number: " + numLargest + ". Smallest number: " + numSmallest + ".");
//        }catch (InputMismatchException e){
//            System.out.println("Input Mismatch Exception has occurred, cause (Program accepts only integers. Examples: 1,20,-3).");
//        }catch (Exception e){
//            System.out.println("Exception has occurred, cause (" + e.getMessage()+").");
//        }

        //EX18

//        try {
//            System.out.println("Enter the string:");
//            String sentence = sc.nextLine();
//            int counter = 0;
//            for (int i = 0; i < sentence.length(); i++) {
//                if (sentence.charAt(i) == 'a') {
//                    ++counter;
//                }
//            }
//            System.out.println("The letter A arrived " + counter + " times.");
//        } catch (Exception e) {
//            System.out.println("Exception has occurred, cause (" + e.getMessage() + ").");
//        }


       }
       //Methods
        public static void checkNegativeNumber ( double number) throws Exception {
            if (number < 0) {
                throw new Exception("Number cannot be negative");
            }
        }
        public static void checkNegativeNumber ( int number) throws Exception {
            if (number < 0) {
                throw new Exception("Number cannot be negative");
            }
        }
        public static void checkIsZero ( int number) throws Exception {
            if (number == 0) {
                throw new Exception("Number cannot be zero");
            }
        }
        public static void checkIsZero ( double number) throws Exception {
            if (number == 0) {
                throw new Exception("Number cannot be zero");
            }
        }
    }

