package com.linbin.excellentcode.design.singleton;

/**
 * Created by linbin on 2017/7/10.
 *
 * 单利模式
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }
    /**
     * 懒汉模式
     * 优点：只有在使用的时候才会被实例化，在一定程度上节约了资源
     * 缺点：第一次加载时，需要及时进行实例化，反应稍微慢，每次调用都要同步，照成不必要的同步开销
     */

    public static synchronized Singleton getInstance1(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Double Check Lock
     */

    public static  Singleton getInstance2(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * 静态内部类单利
     */

    public static  Singleton getInstance3(){
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder{
        private static final Singleton SINGLETON = new Singleton();
    }

    /**
     * 枚举单利
     */

    public enum Singleton2{
        INSTANCE;

        private Singleton2(){

        }

        public void  build(){

        }
    }
    //使用
    private void test(){
        Singleton2.INSTANCE.build();
    }


}
