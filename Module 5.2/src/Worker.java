class Worker implements Runnable {
    private SafeList list;
    private int count;

    public Worker(SafeList list, int count) {
        this.list = list;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            list.add("item " + i);
        }
    }
}
