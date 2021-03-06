/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoRaFrequencyRequest extends AbstractModel{

    /**
    * 频点唯一ID
    */
    @SerializedName("FreqId")
    @Expose
    private String FreqId;

    /**
    * 频点名称
    */
    @SerializedName("FreqName")
    @Expose
    private String FreqName;

    /**
    * 频点描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据上行信道
    */
    @SerializedName("ChannelsDataUp")
    @Expose
    private Long [] ChannelsDataUp;

    /**
    * 数据下行信道RX1
    */
    @SerializedName("ChannelsDataRX1")
    @Expose
    private Long [] ChannelsDataRX1;

    /**
    * 数据下行信道RX2
    */
    @SerializedName("ChannelsDataRX2")
    @Expose
    private Long [] ChannelsDataRX2;

    /**
    * 入网上行信道
    */
    @SerializedName("ChannelsJoinUp")
    @Expose
    private Long [] ChannelsJoinUp;

    /**
    * 入网下行信道RX1
    */
    @SerializedName("ChannelsJoinRX1")
    @Expose
    private Long [] ChannelsJoinRX1;

    /**
    * 入网下行信道RX2
    */
    @SerializedName("ChannelsJoinRX2")
    @Expose
    private Long [] ChannelsJoinRX2;

    /**
     * Get 频点唯一ID 
     * @return FreqId 频点唯一ID
     */
    public String getFreqId() {
        return this.FreqId;
    }

    /**
     * Set 频点唯一ID
     * @param FreqId 频点唯一ID
     */
    public void setFreqId(String FreqId) {
        this.FreqId = FreqId;
    }

    /**
     * Get 频点名称 
     * @return FreqName 频点名称
     */
    public String getFreqName() {
        return this.FreqName;
    }

    /**
     * Set 频点名称
     * @param FreqName 频点名称
     */
    public void setFreqName(String FreqName) {
        this.FreqName = FreqName;
    }

    /**
     * Get 频点描述 
     * @return Description 频点描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 频点描述
     * @param Description 频点描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据上行信道 
     * @return ChannelsDataUp 数据上行信道
     */
    public Long [] getChannelsDataUp() {
        return this.ChannelsDataUp;
    }

    /**
     * Set 数据上行信道
     * @param ChannelsDataUp 数据上行信道
     */
    public void setChannelsDataUp(Long [] ChannelsDataUp) {
        this.ChannelsDataUp = ChannelsDataUp;
    }

    /**
     * Get 数据下行信道RX1 
     * @return ChannelsDataRX1 数据下行信道RX1
     */
    public Long [] getChannelsDataRX1() {
        return this.ChannelsDataRX1;
    }

    /**
     * Set 数据下行信道RX1
     * @param ChannelsDataRX1 数据下行信道RX1
     */
    public void setChannelsDataRX1(Long [] ChannelsDataRX1) {
        this.ChannelsDataRX1 = ChannelsDataRX1;
    }

    /**
     * Get 数据下行信道RX2 
     * @return ChannelsDataRX2 数据下行信道RX2
     */
    public Long [] getChannelsDataRX2() {
        return this.ChannelsDataRX2;
    }

    /**
     * Set 数据下行信道RX2
     * @param ChannelsDataRX2 数据下行信道RX2
     */
    public void setChannelsDataRX2(Long [] ChannelsDataRX2) {
        this.ChannelsDataRX2 = ChannelsDataRX2;
    }

    /**
     * Get 入网上行信道 
     * @return ChannelsJoinUp 入网上行信道
     */
    public Long [] getChannelsJoinUp() {
        return this.ChannelsJoinUp;
    }

    /**
     * Set 入网上行信道
     * @param ChannelsJoinUp 入网上行信道
     */
    public void setChannelsJoinUp(Long [] ChannelsJoinUp) {
        this.ChannelsJoinUp = ChannelsJoinUp;
    }

    /**
     * Get 入网下行信道RX1 
     * @return ChannelsJoinRX1 入网下行信道RX1
     */
    public Long [] getChannelsJoinRX1() {
        return this.ChannelsJoinRX1;
    }

    /**
     * Set 入网下行信道RX1
     * @param ChannelsJoinRX1 入网下行信道RX1
     */
    public void setChannelsJoinRX1(Long [] ChannelsJoinRX1) {
        this.ChannelsJoinRX1 = ChannelsJoinRX1;
    }

    /**
     * Get 入网下行信道RX2 
     * @return ChannelsJoinRX2 入网下行信道RX2
     */
    public Long [] getChannelsJoinRX2() {
        return this.ChannelsJoinRX2;
    }

    /**
     * Set 入网下行信道RX2
     * @param ChannelsJoinRX2 入网下行信道RX2
     */
    public void setChannelsJoinRX2(Long [] ChannelsJoinRX2) {
        this.ChannelsJoinRX2 = ChannelsJoinRX2;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FreqId", this.FreqId);
        this.setParamSimple(map, prefix + "FreqName", this.FreqName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "ChannelsDataUp.", this.ChannelsDataUp);
        this.setParamArraySimple(map, prefix + "ChannelsDataRX1.", this.ChannelsDataRX1);
        this.setParamArraySimple(map, prefix + "ChannelsDataRX2.", this.ChannelsDataRX2);
        this.setParamArraySimple(map, prefix + "ChannelsJoinUp.", this.ChannelsJoinUp);
        this.setParamArraySimple(map, prefix + "ChannelsJoinRX1.", this.ChannelsJoinRX1);
        this.setParamArraySimple(map, prefix + "ChannelsJoinRX2.", this.ChannelsJoinRX2);

    }
}

