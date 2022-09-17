import java.util.Vector;
//This program is created by bhautik_21ce151
class P3_2{
public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        defaultmethod d = new defaultmethod();
        v.add(d.ip());
        v.add(d.isc());
        v.add(d.ip());
        v.add(d.isc());
        v.add(d.ip());
        d.show();
        for (int i = 0; i < v.size(); i++) {
        System.out.println(v.get(i));
        }
  }
}
