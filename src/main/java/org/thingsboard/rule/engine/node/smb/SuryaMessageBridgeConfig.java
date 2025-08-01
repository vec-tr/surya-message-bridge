/**
 * Copyright © 2018-2025 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.rule.engine.node.smb;

import lombok.Data;
import org.thingsboard.rule.engine.api.NodeConfiguration;

@Data
@lombok.EqualsAndHashCode(callSuper = false)
public class SuryaMessageBridgeConfig implements NodeConfiguration<SuryaMessageBridgeConfig> {
    private String redisURI;
    private String streamKey;

    @Override
    public SuryaMessageBridgeConfig defaultConfiguration() {
        SuryaMessageBridgeConfig config = new SuryaMessageBridgeConfig();
        config.setRedisURI("redis://localhost:6379");
        config.setStreamKey("defaultStreamKey");
        return config;
    }
}
