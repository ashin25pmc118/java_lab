class DemoCleanup {
    public DemoCleanup() {
        System.out.println("Object Created");
    }

    @Override
    @SuppressWarnings("removal")
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }
}

public class FinalizeMethod {
    public static void main(String[] args) {
        DemoCleanup obj = new DemoCleanup();

        obj = null;

        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
