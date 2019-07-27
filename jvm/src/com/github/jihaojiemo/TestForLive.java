package com.github.jihaojiemo;

/**
 * Description:
 * Author: admin
 * Create: 2019-07-25 15:45
 */
public class TestForLive {

    public static TestForLive testForLive;

    public void isLive() {
        System.out.println("活着");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("逃离死亡");
        testForLive = this;
    }

    public static void main(String[] args) {

        testForLive = new TestForLive();//有用
        testForLive = null;//无用
        System.gc();//垃圾回收，回收不了，因为覆写了finalize方法
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (testForLive != null) {
            testForLive.isLive();
        }else {
            System.out.println("对象已经死亡");
        }

        testForLive = null;//无用
        System.gc();//垃圾回收，回收不了，因为覆写了finalize方法
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (testForLive != null) {
            testForLive.isLive();
        }else {
            System.out.println("对象已经死亡");
        }
    }
}
