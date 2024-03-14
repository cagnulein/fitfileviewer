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

import java.util.HashMap;
import java.util.Map;

public class TotalBodyExerciseName  {
    public static final int BURPEE = 0;
    public static final int WEIGHTED_BURPEE = 1;
    public static final int BURPEE_BOX_JUMP = 2;
    public static final int WEIGHTED_BURPEE_BOX_JUMP = 3;
    public static final int HIGH_PULL_BURPEE = 4;
    public static final int MAN_MAKERS = 5;
    public static final int ONE_ARM_BURPEE = 6;
    public static final int SQUAT_THRUSTS = 7;
    public static final int WEIGHTED_SQUAT_THRUSTS = 8;
    public static final int SQUAT_PLANK_PUSH_UP = 9;
    public static final int WEIGHTED_SQUAT_PLANK_PUSH_UP = 10;
    public static final int STANDING_T_ROTATION_BALANCE = 11;
    public static final int WEIGHTED_STANDING_T_ROTATION_BALANCE = 12;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(BURPEE, "BURPEE");
        stringMap.put(WEIGHTED_BURPEE, "WEIGHTED_BURPEE");
        stringMap.put(BURPEE_BOX_JUMP, "BURPEE_BOX_JUMP");
        stringMap.put(WEIGHTED_BURPEE_BOX_JUMP, "WEIGHTED_BURPEE_BOX_JUMP");
        stringMap.put(HIGH_PULL_BURPEE, "HIGH_PULL_BURPEE");
        stringMap.put(MAN_MAKERS, "MAN_MAKERS");
        stringMap.put(ONE_ARM_BURPEE, "ONE_ARM_BURPEE");
        stringMap.put(SQUAT_THRUSTS, "SQUAT_THRUSTS");
        stringMap.put(WEIGHTED_SQUAT_THRUSTS, "WEIGHTED_SQUAT_THRUSTS");
        stringMap.put(SQUAT_PLANK_PUSH_UP, "SQUAT_PLANK_PUSH_UP");
        stringMap.put(WEIGHTED_SQUAT_PLANK_PUSH_UP, "WEIGHTED_SQUAT_PLANK_PUSH_UP");
        stringMap.put(STANDING_T_ROTATION_BALANCE, "STANDING_T_ROTATION_BALANCE");
        stringMap.put(WEIGHTED_STANDING_T_ROTATION_BALANCE, "WEIGHTED_STANDING_T_ROTATION_BALANCE");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}