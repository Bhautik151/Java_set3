//interface created
interface P {
    int varP = 100;
    void methodP();
}

//extends interface
interface P1 extends P {
    int varP1 = 201;
    void methodP1();
}
interface P2 extends P {
    int varP2 = 202;
    void methodP2();
}
interface P12 extends P1, P2 {
    int varP12 = 301;
    void methodP12();
}

//implements interface
class InterfaceInheritance implements P12 {
    public void methodP() {
        System.out.println("Method of interface P called...");
    }
    public void methodP1() {
        System.out.println("Method of interface P1 called...");
    }
    public void methodP2() {
        System.out.println("Method of interface P2 called...");
    }
    public void methodP12() {
        System.out.println("Method of interface P12 called...");
    }
}
