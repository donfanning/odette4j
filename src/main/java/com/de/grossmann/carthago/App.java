package com.de.grossmann.carthago;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.de.grossmann.carthago.protocol.odette.OFTPClient;

public class App
{
    private final static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception
    {
        LOGGER.debug("START>");
        
        OFTPClient client = new OFTPClient("10.33.90.18", 3305);
        client.run();
    }
}
