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



public class ClimbProMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int PositionLatFieldNum = 0;
    
    public static final int PositionLongFieldNum = 1;
    
    public static final int ClimbProEventFieldNum = 2;
    
    public static final int ClimbNumberFieldNum = 3;
    
    public static final int ClimbCategoryFieldNum = 4;
    
    public static final int CurrentDistFieldNum = 5;
    

    protected static final  Mesg climbProMesg;
    static {
        // climb_pro
        climbProMesg = new Mesg("climb_pro", MesgNum.CLIMB_PRO);
        climbProMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        
        climbProMesg.addField(new Field("position_lat", PositionLatFieldNum, 133, 1, 0, "semicircles", false, Profile.Type.SINT32));
        
        climbProMesg.addField(new Field("position_long", PositionLongFieldNum, 133, 1, 0, "semicircles", false, Profile.Type.SINT32));
        
        climbProMesg.addField(new Field("climb_pro_event", ClimbProEventFieldNum, 0, 1, 0, "", false, Profile.Type.CLIMB_PRO_EVENT));
        
        climbProMesg.addField(new Field("climb_number", ClimbNumberFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
        
        climbProMesg.addField(new Field("climb_category", ClimbCategoryFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        climbProMesg.addField(new Field("current_dist", CurrentDistFieldNum, 136, 1, 0, "m", false, Profile.Type.FLOAT32));
        
    }

    public ClimbProMesg() {
        super(Factory.createMesg(MesgNum.CLIMB_PRO));
    }

    public ClimbProMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get position_lat field
     * Units: semicircles
     *
     * @return position_lat
     */
    public Integer getPositionLat() {
        return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set position_lat field
     * Units: semicircles
     *
     * @param positionLat
     */
    public void setPositionLat(Integer positionLat) {
        setFieldValue(0, 0, positionLat, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get position_long field
     * Units: semicircles
     *
     * @return position_long
     */
    public Integer getPositionLong() {
        return getFieldIntegerValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set position_long field
     * Units: semicircles
     *
     * @param positionLong
     */
    public void setPositionLong(Integer positionLong) {
        setFieldValue(1, 0, positionLong, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get climb_pro_event field
     *
     * @return climb_pro_event
     */
    public ClimbProEvent getClimbProEvent() {
        Short value = getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return ClimbProEvent.getByValue(value);
    }

    /**
     * Set climb_pro_event field
     *
     * @param climbProEvent
     */
    public void setClimbProEvent(ClimbProEvent climbProEvent) {
        setFieldValue(2, 0, climbProEvent.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get climb_number field
     *
     * @return climb_number
     */
    public Integer getClimbNumber() {
        return getFieldIntegerValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set climb_number field
     *
     * @param climbNumber
     */
    public void setClimbNumber(Integer climbNumber) {
        setFieldValue(3, 0, climbNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get climb_category field
     *
     * @return climb_category
     */
    public Short getClimbCategory() {
        return getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set climb_category field
     *
     * @param climbCategory
     */
    public void setClimbCategory(Short climbCategory) {
        setFieldValue(4, 0, climbCategory, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get current_dist field
     * Units: m
     *
     * @return current_dist
     */
    public Float getCurrentDist() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set current_dist field
     * Units: m
     *
     * @param currentDist
     */
    public void setCurrentDist(Float currentDist) {
        setFieldValue(5, 0, currentDist, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
