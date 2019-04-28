package com.bittech.thread;

        import java.util.concurrent.Callable;
        import java.util.concurrent.ExecutionException;
        import java.util.concurrent.FutureTask;

public class TestCallable {

    public static void main(String[] args) {

        Callable<String> callable = new MyCallable();

        //此时FuterTask就是个Runnable类型
        FutureTask<String> futureTask = new FutureTask(callable);

        Thread thread = new Thread(futureTask);

        thread.start();

        try {
            String string = futureTask.get();
            System.out.println(string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String> {

    private int ticket = 10;

    @Override
    public String call() throws Exception {
        while(this.ticket > 0) {
            System.out.println("剩余："+ --this.ticket);
        }
        return "票卖完了";
    }
}
