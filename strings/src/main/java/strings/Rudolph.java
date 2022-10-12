package strings;

public class Rudolph {
    public static void main(String[] args) {
        for(String pattern : new String[]{//匿名内部类，新建了一个string数组。
                "Rudolph",//匹配字符串
                "[rR]udolph",//r或者R开头匹配之后的
                "[rR][aeiou][a-z]ol.*",//r或者R开头,.*
                "R.*" })
            System.out.println("Rudolph".matches(pattern));
    }
}
/* Output:
true
true
true
true
*/
