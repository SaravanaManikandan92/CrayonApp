package com.crayon.configuration;

import com.crayon.constants.Constants;
import com.influxdb.client.*;


public class InfluxDbFactory {

    private static  InfluxDBClient influxDBClient = null;
    private static WriteApi writeApi = null;
    private static QueryApi queryApi = null;

//



    public static synchronized InfluxDBClient getInfluxDBClientInstance()
    {
        if (influxDBClient == null)
            influxDBClient =InfluxDBClientFactory.create(
                    Constants.INFLUX_URL,
                    Constants.INFLUX_TOKEN.toCharArray(),
                    Constants.INFLUX_ORG,
                    Constants.INFLUX_BUCKET
            );

        return influxDBClient;
    }

    public static synchronized WriteApi getWriteApiInstance()
    {
        if (writeApi == null){
            getInfluxDBClientInstance();
            writeApi= influxDBClient.makeWriteApi();
        }

        return writeApi;
    }


    public static synchronized QueryApi getQueryApiInstance()
    {
        if (queryApi == null){
            getInfluxDBClientInstance();
            queryApi= influxDBClient.getQueryApi();
        }

        return queryApi;
    }

}
