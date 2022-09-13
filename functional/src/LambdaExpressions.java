interface Description{
    String brief();
}

interface Body{
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}



public class LambdaExpressions {
//    static Description description=h->h+"No P";
//    static Body body;
//    static Multi multi;
    static Body bod = h->h+"No Parens";
    static Body bod2 = h->h+"More details";
    static Description description = ()->"short info";//参数要对应，原方法是无参的，这里也应该是无参。还有，返回值是不是也应该对应呢？
    static Multi multi = (h,n)->h+n;
    static Description morelines = ()->{
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        Body body = h->h+"No Parens";//相当于一个函数，与下面是等价的，重写了body中的方法。函数式编程。

        Body body1 = new Body() {
            @Override
            public String detailed(String head) {
                return head+"No Parens";
            }
        };
        System.out.println(bod.detailed("oh!"));
    }


}
