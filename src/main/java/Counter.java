class Counter {

    public long current(long number) {
        return number;
    }

    public long next(long number) {
        number++;
        return number;
    }

    public long prev(long number) {
        number--;
        return number;
    }

    public static void main(String[] args) {
        Counter count = new Counter();

        //Should be 5
        System.out.println("count.current(5) = " + count.current(5));

        //Should be 6
        System.out.println("count.next(5) = " + count.next(5));

        //Should be 4
        System.out.println("count.prev(5) = " + count.prev(5));
    }
}
