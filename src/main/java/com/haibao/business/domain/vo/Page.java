package com.haibao.business.domain.vo;

import java.util.List;

/**
 * @Author: caot
 * @Date: 2018/4/9 0009 下午 2:13
 */
public class Page<T> {
    /**
     * 每页大小，默认10
     */
    private int pageSize = 10;
    /**
     * 内容一共有多少页
     */
    private int pageMax;
    /**
     * 内容总数
     */
    private int totalRecord;
    /**
     * 内容
     */
    private List<T> data;
    /**
     * 当前页
     */
    private int currentPage;

    public Page() {

    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageMax() {
        return pageMax;
    }

    public void setPageMax(int pageMax) {
        this.pageMax = pageMax;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageSize=" + pageSize +
                ", pageMax=" + pageMax +
                ", totalRecord=" + totalRecord +
                ", data=" + data +
                ", currentPage=" + currentPage +
                '}';
    }
}
