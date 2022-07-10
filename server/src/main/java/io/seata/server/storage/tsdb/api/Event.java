/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server.storage.tsdb.api;

public class Event {
    public Object data;
    public EventTopic topic;

    public Long timestamp;

    public Event(Object data, EventTopic topic) {
        this.data = data;
        this.topic = topic;
        this.timestamp = System.currentTimeMillis();
    }
}

class UnDoEvent {
    public String xid;
    public long branchId;
    public String rollbackCtx;
    public byte[] undoLogContent;

    public UnDoEvent(String xid, long branchId, String rollbackCtx, byte[] undoLogContent) {
        this.xid = xid;
        this.branchId = branchId;
        this.rollbackCtx = rollbackCtx;
        this.undoLogContent = undoLogContent;
    }
}

