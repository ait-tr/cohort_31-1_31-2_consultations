import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] ints = {2,5,6,7,9,0};

      // index   0 1 2 3 4 5
      //         2 5 6 7 9 0

        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);
        System.out.println(ints[3]);
        System.out.println(ints[4]);
        System.out.println(ints[5]);

                 //   0 1 2 3
        String str = "J a v a";
        String str1 = new String("Java");
      //  "Java"
        // "Java  "

        int[] numbers = new int[10];
        numbers[0] = 45;
        numbers[1] = 5;
        numbers[2] = 50;
        numbers[3] = 450;

        System.out.println(numbers[0]);

        System.out.println("ints array length is "+ints.length);

        System.out.println(" printing array in cycle");

        // index                       0       1      2       3
        String[] names = new String[]{"Kate","Bill","John","Peter"};
        System.out.println("names length"+ names.length);

        // index                                    0
        String[] namesOne = new String[]{"Kate, Bill ,John, Peter"};
        System.out.println("namesOne length "+ namesOne.length);



        for ( int i = 0; i < names.length; i++ ){

            System.out.println(names[i]);
            System.out.println();

        }
        System.out.println();

        names[1] = "Ann"; //  присваивание элементу массива значения. При этом старое
                            // значение перезапишется
        System.out.println(names[1]);

        System.out.println(names);
        System.out.println("printing array as string");
        System.out.println(Arrays.toString(names));

        int i;
        for(  i = 0; i<5;i++){
            System.out.println("Inside cicle. i = " + i);
        }
        System.out.println("Outside cicle. i = "+i);








    }
    }

