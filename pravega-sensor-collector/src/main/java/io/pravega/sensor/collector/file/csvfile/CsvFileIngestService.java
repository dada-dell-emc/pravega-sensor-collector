/**
 * Copyright (c) Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.sensor.collector.file.csvfile;

import io.pravega.sensor.collector.DeviceDriverConfig;
import io.pravega.sensor.collector.file.FileIngestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ingestion service for csv files.  
 */
public class CsvFileIngestService extends FileIngestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CsvFileIngestService.class);


    public CsvFileIngestService(DeviceDriverConfig config) {

        super(config);
    }

}
