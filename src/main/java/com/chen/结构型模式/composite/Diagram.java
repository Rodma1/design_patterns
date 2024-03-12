package com.chen.结构型模式.composite;

import java.util.List;

/**
 * 图表
 *
 * @author chenyunzhi
 * @date 2024/3/11 23:00
 */
public class Diagram implements Graph{

    private final List<Graph> graphs;

    public Diagram(List<Graph> graphs) {
        this.graphs = graphs;
    }

    @Override
    public void fillColor(String color) {
        for (Graph graph:graphs) {
            graph.fillColor(color);
        }
    }

    /**
     * 添加图形
     */
    public void add(Graph graph) {
        graphs.add(graph);
    }

    /**
     * 删除图形
     */
    public void delete(Graph graph) {
        graphs.remove(graph);
    }
 }
