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


#import <Foundation/Foundation.h>

#import "FITTypes.h"
#import "FITFieldDescriptionMesg.h"
#import "FITDeveloperDataIdMesg.h"

NS_ASSUME_NONNULL_BEGIN

@interface FITDeveloperField : NSObject

- (id)initWithFieldDescriptionMesg: (FITFieldDescriptionMesg*) definition andDeveloperDataIdMesg: (FITDeveloperDataIdMesg*) developer;
- (void)addValue:(NSNumber*)value forIndex:(uint8_t)index;
- (NSNumber*)getValueForIndex:(uint8_t)index;

@property(nonatomic, readonly) FITFieldDescriptionMesg* definition;
@property(nonatomic, readonly) FITDeveloperDataIdMesg* developer;

@end

NS_ASSUME_NONNULL_END