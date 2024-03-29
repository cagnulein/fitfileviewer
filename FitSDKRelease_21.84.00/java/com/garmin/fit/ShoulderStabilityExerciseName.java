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

public class ShoulderStabilityExerciseName  {
    public static final int _90_DEGREE_CABLE_EXTERNAL_ROTATION = 0;
    public static final int BAND_EXTERNAL_ROTATION = 1;
    public static final int BAND_INTERNAL_ROTATION = 2;
    public static final int BENT_ARM_LATERAL_RAISE_AND_EXTERNAL_ROTATION = 3;
    public static final int CABLE_EXTERNAL_ROTATION = 4;
    public static final int DUMBBELL_FACE_PULL_WITH_EXTERNAL_ROTATION = 5;
    public static final int FLOOR_I_RAISE = 6;
    public static final int WEIGHTED_FLOOR_I_RAISE = 7;
    public static final int FLOOR_T_RAISE = 8;
    public static final int WEIGHTED_FLOOR_T_RAISE = 9;
    public static final int FLOOR_Y_RAISE = 10;
    public static final int WEIGHTED_FLOOR_Y_RAISE = 11;
    public static final int INCLINE_I_RAISE = 12;
    public static final int WEIGHTED_INCLINE_I_RAISE = 13;
    public static final int INCLINE_L_RAISE = 14;
    public static final int WEIGHTED_INCLINE_L_RAISE = 15;
    public static final int INCLINE_T_RAISE = 16;
    public static final int WEIGHTED_INCLINE_T_RAISE = 17;
    public static final int INCLINE_W_RAISE = 18;
    public static final int WEIGHTED_INCLINE_W_RAISE = 19;
    public static final int INCLINE_Y_RAISE = 20;
    public static final int WEIGHTED_INCLINE_Y_RAISE = 21;
    public static final int LYING_EXTERNAL_ROTATION = 22;
    public static final int SEATED_DUMBBELL_EXTERNAL_ROTATION = 23;
    public static final int STANDING_L_RAISE = 24;
    public static final int SWISS_BALL_I_RAISE = 25;
    public static final int WEIGHTED_SWISS_BALL_I_RAISE = 26;
    public static final int SWISS_BALL_T_RAISE = 27;
    public static final int WEIGHTED_SWISS_BALL_T_RAISE = 28;
    public static final int SWISS_BALL_W_RAISE = 29;
    public static final int WEIGHTED_SWISS_BALL_W_RAISE = 30;
    public static final int SWISS_BALL_Y_RAISE = 31;
    public static final int WEIGHTED_SWISS_BALL_Y_RAISE = 32;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(_90_DEGREE_CABLE_EXTERNAL_ROTATION, "_90_DEGREE_CABLE_EXTERNAL_ROTATION");
        stringMap.put(BAND_EXTERNAL_ROTATION, "BAND_EXTERNAL_ROTATION");
        stringMap.put(BAND_INTERNAL_ROTATION, "BAND_INTERNAL_ROTATION");
        stringMap.put(BENT_ARM_LATERAL_RAISE_AND_EXTERNAL_ROTATION, "BENT_ARM_LATERAL_RAISE_AND_EXTERNAL_ROTATION");
        stringMap.put(CABLE_EXTERNAL_ROTATION, "CABLE_EXTERNAL_ROTATION");
        stringMap.put(DUMBBELL_FACE_PULL_WITH_EXTERNAL_ROTATION, "DUMBBELL_FACE_PULL_WITH_EXTERNAL_ROTATION");
        stringMap.put(FLOOR_I_RAISE, "FLOOR_I_RAISE");
        stringMap.put(WEIGHTED_FLOOR_I_RAISE, "WEIGHTED_FLOOR_I_RAISE");
        stringMap.put(FLOOR_T_RAISE, "FLOOR_T_RAISE");
        stringMap.put(WEIGHTED_FLOOR_T_RAISE, "WEIGHTED_FLOOR_T_RAISE");
        stringMap.put(FLOOR_Y_RAISE, "FLOOR_Y_RAISE");
        stringMap.put(WEIGHTED_FLOOR_Y_RAISE, "WEIGHTED_FLOOR_Y_RAISE");
        stringMap.put(INCLINE_I_RAISE, "INCLINE_I_RAISE");
        stringMap.put(WEIGHTED_INCLINE_I_RAISE, "WEIGHTED_INCLINE_I_RAISE");
        stringMap.put(INCLINE_L_RAISE, "INCLINE_L_RAISE");
        stringMap.put(WEIGHTED_INCLINE_L_RAISE, "WEIGHTED_INCLINE_L_RAISE");
        stringMap.put(INCLINE_T_RAISE, "INCLINE_T_RAISE");
        stringMap.put(WEIGHTED_INCLINE_T_RAISE, "WEIGHTED_INCLINE_T_RAISE");
        stringMap.put(INCLINE_W_RAISE, "INCLINE_W_RAISE");
        stringMap.put(WEIGHTED_INCLINE_W_RAISE, "WEIGHTED_INCLINE_W_RAISE");
        stringMap.put(INCLINE_Y_RAISE, "INCLINE_Y_RAISE");
        stringMap.put(WEIGHTED_INCLINE_Y_RAISE, "WEIGHTED_INCLINE_Y_RAISE");
        stringMap.put(LYING_EXTERNAL_ROTATION, "LYING_EXTERNAL_ROTATION");
        stringMap.put(SEATED_DUMBBELL_EXTERNAL_ROTATION, "SEATED_DUMBBELL_EXTERNAL_ROTATION");
        stringMap.put(STANDING_L_RAISE, "STANDING_L_RAISE");
        stringMap.put(SWISS_BALL_I_RAISE, "SWISS_BALL_I_RAISE");
        stringMap.put(WEIGHTED_SWISS_BALL_I_RAISE, "WEIGHTED_SWISS_BALL_I_RAISE");
        stringMap.put(SWISS_BALL_T_RAISE, "SWISS_BALL_T_RAISE");
        stringMap.put(WEIGHTED_SWISS_BALL_T_RAISE, "WEIGHTED_SWISS_BALL_T_RAISE");
        stringMap.put(SWISS_BALL_W_RAISE, "SWISS_BALL_W_RAISE");
        stringMap.put(WEIGHTED_SWISS_BALL_W_RAISE, "WEIGHTED_SWISS_BALL_W_RAISE");
        stringMap.put(SWISS_BALL_Y_RAISE, "SWISS_BALL_Y_RAISE");
        stringMap.put(WEIGHTED_SWISS_BALL_Y_RAISE, "WEIGHTED_SWISS_BALL_Y_RAISE");
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
