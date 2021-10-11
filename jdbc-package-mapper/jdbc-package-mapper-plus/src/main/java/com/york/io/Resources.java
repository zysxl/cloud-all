package com.york.io;

import java.io.InputStream;

/**
 * @author by: zhouyang
 * @name: Resuces
 * @Description: TODO
 * @Date: 2021/10/11 9:23 下午
 */
public class Resources {

    /**
     * 通过inputStream 输入流字节码，加载到内存中
     *
     * @param path
     * @return
     */
    public static InputStream getInputStream(String path) {
        return Resources.class.getClassLoader().getResourceAsStream(path);
    }
}
