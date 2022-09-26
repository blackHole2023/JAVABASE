package exceptions;

class BaseException extends Exception {}
class DerivedException extends BaseException {}

public class PreciseRethrow {
    void catcher() throws DerivedException {
        try {
            throw new DerivedException();
        } catch(BaseException e) {//子异常居然能用父类异常捕捉？难道不就是这样么？父类泛用性是最大的。Exception可以捕捉所有。
            throw e;
        }
    }
}