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


#if !defined(FIT_SPEED_ZONE_MESG_HPP)
#define FIT_SPEED_ZONE_MESG_HPP

#include "fit_mesg.hpp"

namespace fit
{

class SpeedZoneMesg : public Mesg
{
public:
    class FieldDefNum final
    {
    public:
       static const FIT_UINT8 MessageIndex = 254;
       static const FIT_UINT8 HighValue = 0;
       static const FIT_UINT8 Name = 1;
       static const FIT_UINT8 Invalid = FIT_FIELD_NUM_INVALID;
    };

    SpeedZoneMesg(void) : Mesg(Profile::MESG_SPEED_ZONE)
    {
    }

    SpeedZoneMesg(const Mesg &mesg) : Mesg(mesg)
    {
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of message_index field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsMessageIndexValid() const
    {
        const Field* field = GetField(254);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns message_index field
    ///////////////////////////////////////////////////////////////////////
    FIT_MESSAGE_INDEX GetMessageIndex(void) const
    {
        return GetFieldUINT16Value(254, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set message_index field
    ///////////////////////////////////////////////////////////////////////
    void SetMessageIndex(FIT_MESSAGE_INDEX messageIndex)
    {
        SetFieldUINT16Value(254, messageIndex, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of high_value field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsHighValueValid() const
    {
        const Field* field = GetField(0);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns high_value field
    // Units: m/s
    ///////////////////////////////////////////////////////////////////////
    FIT_FLOAT32 GetHighValue(void) const
    {
        return GetFieldFLOAT32Value(0, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set high_value field
    // Units: m/s
    ///////////////////////////////////////////////////////////////////////
    void SetHighValue(FIT_FLOAT32 highValue)
    {
        SetFieldFLOAT32Value(0, highValue, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Checks the validity of name field
    // Returns FIT_TRUE if field is valid
    ///////////////////////////////////////////////////////////////////////
    FIT_BOOL IsNameValid() const
    {
        const Field* field = GetField(1);
        if( FIT_NULL == field )
        {
            return FIT_FALSE;
        }

        return field->IsValueValid();
    }

    ///////////////////////////////////////////////////////////////////////
    // Returns name field
    ///////////////////////////////////////////////////////////////////////
    FIT_WSTRING GetName(void) const
    {
        return GetFieldSTRINGValue(1, 0, FIT_SUBFIELD_INDEX_MAIN_FIELD);
    }

    ///////////////////////////////////////////////////////////////////////
    // Set name field
    ///////////////////////////////////////////////////////////////////////
    void SetName(FIT_WSTRING name)
    {
        SetFieldSTRINGValue(1, name, 0);
    }

};

} // namespace fit

#endif // !defined(FIT_SPEED_ZONE_MESG_HPP)
