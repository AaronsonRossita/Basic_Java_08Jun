public class Main {

    public static void main(String[] args) {

        int x = 9;
        int y = 3;

//        System.out.println(x + y);
//        System.out.println(x - y);
//        System.out.println(x * y);
//        System.out.println(x / y);
//        System.out.println(x%4);
//        System.out.println(x++);
//        System.out.println(--x);
//        System.out.println(x >= 1 && x <= 10);

//        x += 2;
//        System.out.println(x);

        String str1 = "abcdefghijklmn" +
                "opqrstuvwxyz";
        String str2 = "abc";
        String str3 = null;

//        System.out.println(str1 + str2);
//        System.out.println(x + str1);
//        System.out.println(str1 + (x + y));
//
//
//        System.out.println(str1.equals(str2));

//        System.out.println(str1.length());
//        String after = str1.toUpperCase();
//        after = after.toLowerCase();
//        System.out.println(after);
//
//        System.out.println(str1.indexOf("bcd"));
//        System.out.println(str1.charAt(2));
//        String name = "Tom     ";
//        System.out.println(name.trim() + ".");


//        if (x < 8){
//            System.out.println("x is bigger than 8");
//        }
//
//        if(x < 8){
//            System.out.println("x is bigger than 8");
//        }else{
//            System.out.println("x is not bigger than 8");
//        }
//
//        if(x > y){
//            System.out.println("x is bigger than y");
//        }else if(x < y){
//            System.out.println("x is smaller than y");
//        }else{
//            System.out.println("x and y are equal");
//        }
//
//        if ( x > y){
//            int dif = x - y;
//            if (dif >= 2){
//                System.out.println("x is bigger than y at least by 2");
//            }else{
//                System.out.println("x is bigger than y by 1");
//            }
//        }
//
//        switch (x){
//            case 1:
//                System.out.println("banana");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            case 5:
//                System.out.println("five");
//                break;
//            default:
//                System.out.println("other");
//        }
//        System.out.println(str1.substring(9));
//        System.out.println(str1.substring(9,13));

        String name = "Marry";
        String status = "old";

//        String greet = "Hello" + name + ", you're status is " + status;
        String greet = String.format("Hello %s you're status is %s",name,status);
//        System.out.println(greet);

        String symbols = " \"  'a' \"  \\  \n b ";
//        System.out.println(symbols);

        String myName = "Tom.Sawyer";

        String firstname = myName.substring(0,myName.indexOf("."));
        String lastname = myName.substring(myName.indexOf(".") + 1);

        String msg = String.format("your first name is: %s and your last name is: %s", firstname, lastname);

        System.out.println(msg);

        String[] fruits = {"banana","apple","pineapple","mango"};
        int fruitNumber = 5;

//        switch (fruitNumber){
//            case 1:
//                System.out.println(fruits[0]);
//                break;
//            case 2:
//                System.out.println(fruits[1]);
//                break;
//            case 3:
//                System.out.println(fruits[2]);
//                break;
//            case 4:
//                System.out.println(fruits[3]);
//                break;
//            default:
//                System.out.println("Sorry, can’t find a fruit with that name");
//        }

        System.out.println("the end");
    }


}


