public class abstract ProcessingData {

    static public Pair {
        final String key;
        final int value;

        public Pair(String k, int v) {
            key = k;
            value = v;
        }
    }
        
    public final void transform() {
        Pair[] data;

        data = readData();
        data = processData(data);
        writeData(data);
    }

    public abstract Pair[] readData();

    public abstract Pair[] processData(Pair[] toProcess);

    public void writeData(Pair[] data) {
        for (Pair p : data) {
            System.out.println(p.key + " : " + p.value);
        }
    }
}