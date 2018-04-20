package com.yulike.dm.util;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpsUtil {

    private static final Logger LOG = LoggerFactory.getLogger(HttpsUtil.class);

    private static HttpClient createHttpClient(){
        HttpClient client = HttpClients.createDefault();
        return client;
    }
}
