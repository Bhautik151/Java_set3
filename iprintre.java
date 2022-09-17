//create interface
interface iprinter {
    String ip();
    default void show() {
        System.out.println("default iprinter");
    }
}

//create interface
interface iscanner {
    String isc();
    default void show() {
        System.out.println("default testinterface2");
    }
}
//create class using implements interface
class defaultmethod implements iprinter, iscanner {
    @Override
    public String ip() {
        return "iprinter";
    }

    @Override
    public String isc() {
        return "iscanner";
    }

    public void show() {
        iprinter.super.show();
        iscanner.super.show();
    }
}