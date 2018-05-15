package com.haibao.utils;

import java.util.List;

/**
 * 分页处理工具类
 *
 * @Author: caot
 * @Date: 2018/4/9 0009 下午 2:03
 */
public class PageUtils {


    /**
     * 计算总页数
     * @param totalRecord 数据总数
     * @return 返回总页数
     */
    public static int getPageMax(int totalRecord){
        int pageMax;
        if (0 == totalRecord % 10) {
            pageMax = totalRecord / 10;
        } else {
            pageMax = totalRecord / 10 + 1;
        }
        return pageMax;
    }


}
