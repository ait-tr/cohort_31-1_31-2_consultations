public class Main {

    /*
Есть массив положительных целых чисел нечетной длины >= 3.
Известно, что существует индекс элемента этого массива такой, что сумма всех элементов слева от него равняется сумме всех элементов справа от него.
Найти этот индекс.

{3,2,1,1,4}
leftSum = 3
currentNum = 2
leftSum
 sum= leftSum+currentNum+rightSum
 rightSum = sum -leftSum -currentNum


     */
    public static void main(String[] args) {
        System.out.println(countLetters("aaaaabbbcccd"));
    }

    public  int balancedSum( int[]ints){
        int sum = calculateSum(ints);

        int leftSum = ints[0];
        int lastPossiblePivotIndex = ints.length - 2;
        int pivotIndex = 0;

        for ( int i = 1;i<=lastPossiblePivotIndex;i++){

            int currentNum = ints[i];
            if(leftSum == sum -leftSum - currentNum){
                pivotIndex = i;
                break;
            }
            leftSum +=currentNum;
        }
        return pivotIndex;
    }

    private  int calculateSum(int[] ints){
        int sum = 0;
        for(int i: ints)
            sum+=i;
        return sum;
    }

    // "aaaaabbbcccd" -> "5a3b3cd"

    public static String countLetters( String str){
        if( str.length()==0)
            return "";

        int count = 1;
        StringBuilder sb = new StringBuilder();

        for ( int i = 1; i<str.length();i++){
            if( str.charAt(i-1) != str.charAt(i)){
                if( count > 1){
                    sb.append(count).append(str.charAt(i-1));
                    count = 1;
                }else{
                    sb.append(str.charAt(i-1));
                }

            }else {
                count++;
            }
        }

        if (count == 1)
            sb.append(str.charAt(str.length()-1));
        else
            sb.append(count).append(str.charAt(str.length() - 1));

        return sb.toString();

    }
}
