package com.strategyobject.training.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Page<T> {
    private int currentPage;
    private int pageSize;
    private long totalPages;
    private long totalItems;
    private List<T> items;

}