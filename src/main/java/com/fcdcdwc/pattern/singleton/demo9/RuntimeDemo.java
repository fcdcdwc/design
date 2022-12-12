package com.fcdcdwc.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version v1.0
 * @ClassName: RuntimeDemo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fcdcdwc
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        //返回 Java 虚拟机中的内存总量。
        System.out.println(runtime.totalMemory());
        //返回 Java 虚拟机试图使用的最大内存量。
        System.out.println(runtime.maxMemory());

        //调用runtime的方法exec, 参数要的是一个命令
        Process process = runtime.exec("ipconfig");
        //调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //读取数据
        int len = is.read(arr);//返回读到的字节的个数
        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
