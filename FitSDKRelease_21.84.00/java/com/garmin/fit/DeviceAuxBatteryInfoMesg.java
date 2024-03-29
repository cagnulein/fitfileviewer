///////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin International, Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2022 Garmin International, Inc.
///////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.84Release
// Tag = production/akw/21.84.00-0-g894a113c
///////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;



public class DeviceAuxBatteryInfoMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int DeviceIndexFieldNum = 0;
    
    public static final int BatteryVoltageFieldNum = 1;
    
    public static final int BatteryStatusFieldNum = 2;
    
    public static final int BatteryIdentifierFieldNum = 3;
    

    protected static final  Mesg deviceAuxBatteryInfoMesg;
    static {
        // device_aux_battery_info
        deviceAuxBatteryInfoMesg = new Mesg("device_aux_battery_info", MesgNum.DEVICE_AUX_BATTERY_INFO);
        deviceAuxBatteryInfoMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        deviceAuxBatteryInfoMesg.addField(new Field("device_index", DeviceIndexFieldNum, 2, 1, 0, "", false, Profile.Type.DEVICE_INDEX));
        
        deviceAuxBatteryInfoMesg.addField(new Field("battery_voltage", BatteryVoltageFieldNum, 132, 256, 0, "V", false, Profile.Type.UINT16));
        
        deviceAuxBatteryInfoMesg.addField(new Field("battery_status", BatteryStatusFieldNum, 2, 1, 0, "", false, Profile.Type.BATTERY_STATUS));
        
        deviceAuxBatteryInfoMesg.addField(new Field("battery_identifier", BatteryIdentifierFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
    }

    public DeviceAuxBatteryInfoMesg() {
        super(Factory.createMesg(MesgNum.DEVICE_AUX_BATTERY_INFO));
    }

    public DeviceAuxBatteryInfoMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get device_index field
     *
     * @return device_index
     */
    public Short getDeviceIndex() {
        return getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set device_index field
     *
     * @param deviceIndex
     */
    public void setDeviceIndex(Short deviceIndex) {
        setFieldValue(0, 0, deviceIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get battery_voltage field
     * Units: V
     *
     * @return battery_voltage
     */
    public Float getBatteryVoltage() {
        return getFieldFloatValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set battery_voltage field
     * Units: V
     *
     * @param batteryVoltage
     */
    public void setBatteryVoltage(Float batteryVoltage) {
        setFieldValue(1, 0, batteryVoltage, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get battery_status field
     *
     * @return battery_status
     */
    public Short getBatteryStatus() {
        return getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set battery_status field
     *
     * @param batteryStatus
     */
    public void setBatteryStatus(Short batteryStatus) {
        setFieldValue(2, 0, batteryStatus, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get battery_identifier field
     *
     * @return battery_identifier
     */
    public Short getBatteryIdentifier() {
        return getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set battery_identifier field
     *
     * @param batteryIdentifier
     */
    public void setBatteryIdentifier(Short batteryIdentifier) {
        setFieldValue(3, 0, batteryIdentifier, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
