/**
 * Created by h205p2 on 8/30/17.
 */
public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {

        System.out.println(stringTimes("hi", 3));
        /*System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));
*/

    }

    //your codingbat method here - must match
    // the method name from codingbat
    //1
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    //2
    public static String stringTimes(String str, int n) {
        String sequence = "";
        for(int i=0; i<n;i++){
            sequence +=str;
        }
        return sequence;
    }

    //3
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //4
    public static boolean firstLast6(int[] nums) {
        if(nums[nums.length-1] == 6 || nums[0]==6){
            return true;
        } else {
            return false;
        }
    }

    //5
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(40<=cigars && cigars<=60 && isWeekend==false){
            return true;
        }else if(40<=cigars && isWeekend==true){
            return true;
        } else {
            return false;
        }
    }

    //6
    public static int loneSum(int a, int b, int c) {
        Integer sum = 0;
        if(a!=b && a!=c){
            if(b!=c){
                sum=a+b+c;
            }else{
                sum=a;
            }
        }else if(a==b&&b==c){
            sum=0;
        }else if(a==b){
            sum=c;
        }else if(a==c){
            sum=b;
        }
        return sum;
    }

    //7
    public static String doubleChar(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    //8
    public static boolean gHappy(String str) {
        Boolean answer=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='g'){
                if(i>0 &&str.charAt(i-1)=='g'){
                    answer=true;
                }else if(i<str.length()-1 && str.charAt(i+1)=='g'){
                    answer=true;
                }else{
                    answer=false;
                }
            }
        }
        return answer;
    }

    //9
    public int countEvens(int[] nums) {
        Integer count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        return count;
    }

    //10
    public boolean linearIn(int[] outer, int[] inner) {
        Integer search = 0;
        if(inner.length == 0) {
            return true;
        }

        Integer i = 0;
        for(int o = 0; o < outer.length; o++) {
            if(outer[o]==inner[i]) {
                search++;
                i++;
            } else if(outer[o] > inner[i]) {
                return false;
            }

            if(search == inner.length)
                return true;
        }
        return false;
    }

}

