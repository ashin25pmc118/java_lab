class CounterItem {
    private static int count = 0;

    public CounterItem() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticObjectCounter {
    public static void main(String[] args) {
        CounterItem obj1 = new CounterItem();
        CounterItem obj2 = new CounterItem();
        CounterItem obj3 = new CounterItem();

        System.out.println("Objects Created : " + CounterItem.getCount());
    }
}
