package interfaces;

class Basic2 extends Basic {
    int f() { return 111; }
    void g(){};

    @Override
    void unimplemented() {

    }
    // unimplemented() still not implemented
}
