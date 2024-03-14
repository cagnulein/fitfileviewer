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

#import "FITMessage.h"
#import "FITTypes.h"

NS_ASSUME_NONNULL_BEGIN

@interface FITFieldDescriptionMesg : FITMessage
- (id)init;
// DeveloperDataIndex 
- (BOOL)isDeveloperDataIndexValid;
- (FITUInt8)getDeveloperDataIndex;
- (void)setDeveloperDataIndex:(FITUInt8)developerDataIndex;
// FieldDefinitionNumber 
- (BOOL)isFieldDefinitionNumberValid;
- (FITUInt8)getFieldDefinitionNumber;
- (void)setFieldDefinitionNumber:(FITUInt8)fieldDefinitionNumber;
// FitBaseTypeId 
- (BOOL)isFitBaseTypeIdValid;
- (FITFitBaseType)getFitBaseTypeId;
- (void)setFitBaseTypeId:(FITFitBaseType)fitBaseTypeId;
// FieldName 
@property(readonly,nonatomic) uint8_t numFieldNameValues;
- (BOOL)isFieldNameValidforIndex : (uint8_t)index;
- (NSString *)getFieldNameforIndex : (uint8_t)index;
- (void)setFieldName:(NSString *)fieldName forIndex:(uint8_t)index;
// Array 
- (BOOL)isArrayValid;
- (FITUInt8)getArray;
- (void)setArray:(FITUInt8)array;
// Components 
- (BOOL)isComponentsValid;
- (NSString *)getComponents;
- (void)setComponents:(NSString *)components;
// Scale 
- (BOOL)isScaleValid;
- (FITUInt8)getScale;
- (void)setScale:(FITUInt8)scale;
// Offset 
- (BOOL)isOffsetValid;
- (FITSInt8)getOffset;
- (void)setOffset:(FITSInt8)offset;
// Units 
@property(readonly,nonatomic) uint8_t numUnitsValues;
- (BOOL)isUnitsValidforIndex : (uint8_t)index;
- (NSString *)getUnitsforIndex : (uint8_t)index;
- (void)setUnits:(NSString *)units forIndex:(uint8_t)index;
// Bits 
- (BOOL)isBitsValid;
- (NSString *)getBits;
- (void)setBits:(NSString *)bits;
// Accumulate 
- (BOOL)isAccumulateValid;
- (NSString *)getAccumulate;
- (void)setAccumulate:(NSString *)accumulate;
// FitBaseUnitId 
- (BOOL)isFitBaseUnitIdValid;
- (FITFitBaseUnit)getFitBaseUnitId;
- (void)setFitBaseUnitId:(FITFitBaseUnit)fitBaseUnitId;
// NativeMesgNum 
- (BOOL)isNativeMesgNumValid;
- (FITMesgNum)getNativeMesgNum;
- (void)setNativeMesgNum:(FITMesgNum)nativeMesgNum;
// NativeFieldNum 
- (BOOL)isNativeFieldNumValid;
- (FITUInt8)getNativeFieldNum;
- (void)setNativeFieldNum:(FITUInt8)nativeFieldNum;

@end

NS_ASSUME_NONNULL_END
