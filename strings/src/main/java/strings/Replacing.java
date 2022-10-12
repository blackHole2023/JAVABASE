package strings;

public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args) {
        System.out.println(
                s.replaceFirst("f\\w+", "located"));//匹配f后面的一个或者多个字母
        System.out.println(
                s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
/* Output:
Then, when you have located the shrubbery, you must cut
down the mightiest tree in the forest...with... a
herring!
Then, when you have found the banana, you must cut down
the mightiest banana in the forest...with... a banana!
*/
