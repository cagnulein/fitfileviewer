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


#if !defined(FIT_STRESS_LEVEL_MESG_HPP)
#define FIT_STRESS_LEVEL_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class StressLevelMesg : public Mesg
{
public:
    class FieldDefNum final
    {
    public:
       static const FIT_UINT8 StressLevelValue = 0;
       static const FIT_UINT8 StressLevelTime = 1;
       static const FIT_UINT8 Invalid = FIT_FIELD_NUM_INVALID;
    };

    StressLevelMesg(void) : Mesg(Profile::MESG_STRESS_LEVEL)
    {
    }

    StressLevelMesg(const Mesg &mesg) : Mesg(mesg)
    {
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of stress_level_value field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsStressLevelValueValid() const
    {
        const Field* field = GetField(0);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns stress_level_value field
    ///////////////////////////////////////////////////////////////////////
    FIT_SINT16 GetStressLevelValue(void) const
    {
        return GetFieldSINT16Value(0, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set stress_level_value field
    ///////////////////////////////////////////////////////////////////////
    void SetStressLevelValue(FIT_SINT16 stressLevelValue)
    {
        SetFieldSINT16Value(0, stressLevelValue, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of stress_level_time field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsStressLevelTimeValid() const
    {
        const Field* field = GetField(1);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns stress_level_time field
    // Units: s
    // Comment: Time stress score was calculated
    ///////////////////////////////////////////////////////////////////////
    FIT_DATE_TIME GetStressLevelTime(void) const
    {
        return GetFieldUINT32Value(1, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set stress_level_time field
    // Units: s
    // Comment: Time stress score was calculated
    ///////////////////////////////////////////////////////////////////////
    void SetStressLevelTime(FIT_DATE_TIME stressLevelTime)
    {
        SetFieldUINT32Value(1, stressLevelTime, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

};

} // namespace fit

#endif // !defined(FIT_STRESS_LEVEL_MESG_HPP)
