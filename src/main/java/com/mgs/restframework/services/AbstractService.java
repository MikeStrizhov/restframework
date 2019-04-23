package com.mgs.restframework.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractService {
    protected Logger log = LogManager.getLogger(this.getClass());

    /**
     * Default timeout in seconds
     * @return Default timeout value, in seconds
     */
    protected int getDefaultTimeout() {
        return 10;
    }
}
