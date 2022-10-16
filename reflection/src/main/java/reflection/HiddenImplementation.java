package reflection;

import reflection.interfacea.*;
import reflection.packageaccess.*;
import java.lang.reflect.*;

public class HiddenImplementation {
    public static void
    main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Compile error: cannot find symbol 'C':
//    if(a instanceof C) {
//      C c = (C)a;
//      c.g();
//    }
        // Oops! Reflection still allows us to call g():
        callHiddenMethod(a, "g");
        // And even less accessible methods!
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void
    callHiddenMethod(Object a, String methodName)
            throws Exception {
        Method g =
                a.getClass().getDeclaredMethod(methodName);//这里是利用反射，动态的调用方法。前提是你得知道
        // 当中有一些什么方法，相对来说，还是比较安全的
        g.setAccessible(true);
        g.invoke(a);
    }
}
/* Output:
public C.f()
reflection.packageaccess.C
public C.g()
package C.u()
protected C.v()
private C.w()
*/
