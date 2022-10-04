package reuse;

class Lisa extends Homer {
//    @Override//编译错误，这是重载。
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}
