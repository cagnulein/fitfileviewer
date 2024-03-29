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


#if !defined(FIT_DEVELOPER_FIELD_DESCRIPTION_LISTENER_HPP)
#define FIT_DEVELOPER_FIELD_DESCRIPTION_LISTENER_HPP

#include "fit_developer_field_description.hpp"

namespace fit
{
class DeveloperFieldDescription;

class DeveloperFieldDescriptionListener
{
public:
    virtual ~DeveloperFieldDescriptionListener() {};
    virtual void OnDeveloperFieldDescription( const DeveloperFieldDescription& desc ) = 0;
};

} // namespace fit

#endif // FIT_DEVELOPER_FIELD_DESCRIPTION_LISTENER_HPP
