package com.moon.ancientpoetry.common.spider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AncientPoetrySpider {


    /**
     * 根据URL 获得所有 poetryUrl
     * @param s
     */
    private void getPoetryUrls(String s) {

    }


    protected void getPoetry(String url){

    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new AncientPoetrySpider().getPoetry("https://www.gushiwen.org/shiwen/default_0AA"+i+".aspx");
        }

    }




}
