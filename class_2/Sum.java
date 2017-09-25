import java.lang.Integer;

public class Sum {
    private int _value;

    public Sum() { _value = 0; }
    public Sum( int val ) { set(val); }
    public int get() { return _value; }
    public void set( int val ) { _value = val; }

    public static void main(String[] args) {
        int[] v = new int[args.length];
        Sum result = new Sum();

        for (int i = 0; i < args.length; i++) {
            result.set( result.get() );
            v[i] = Integer.parseInt(args[i]);
        }

        System.out.println(_s.computeVectorSum(v));
    }

}