package com.mgs.restframework.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.LogManager;

public abstract class AbstractService {
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * Default timeout in seconds
     * @return Default timeout value, in seconds
     */
    protected int getDefaultTimeout() {
        return 10;
    }
}
