class GCObject {
    private int id;

    public GCObject(int id) {
        this.id = id;
        System.out.println("Object Created");
    }

    @Override
    @SuppressWarnings("removal")
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

public class GarbageCollection {
    public static void main(String[] args) {
        GCObject obj1 = new GCObject(1);
        GCObject obj2 = new GCObject(2);

        obj1 = null;
        obj2 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
