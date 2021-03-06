/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.common.transport;

import org.elasticsearch.common.io.stream.Writeable;


/**
 *
 */
public interface TransportAddress extends Writeable<TransportAddress> {

    /**
     * Returns the host string for this transport address
     */
    String getHost();

    /**
     * Returns the address string for this transport address
     */
    String getAddress();

    /**
     * Returns the port of this transport address if applicable
     */
    int getPort();

    short uniqueAddressTypeId();

    boolean sameHost(TransportAddress other);

    boolean isLoopbackOrLinkLocalAddress();

    public String toString();
}
