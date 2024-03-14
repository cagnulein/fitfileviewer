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

@interface FITMemoGlobMesg : FITMessage
- (id)init;
// PartIndex 
- (BOOL)isPartIndexValid;
- (FITUInt32)getPartIndex;
- (void)setPartIndex:(FITUInt32)partIndex;
// Memo 
@property(readonly,nonatomic) uint8_t numMemoValues;
- (BOOL)isMemoValidforIndex : (uint8_t)index;
- (FITByte)getMemoforIndex : (uint8_t)index;
- (void)setMemo:(FITByte)memo forIndex:(uint8_t)index;
// MessageNumber 
- (BOOL)isMessageNumberValid;
- (FITUInt16)getMessageNumber;
- (void)setMessageNumber:(FITUInt16)messageNumber;
// MessageIndex 
- (BOOL)isMessageIndexValid;
- (FITMessageIndex)getMessageIndex;
- (void)setMessageIndex:(FITMessageIndex)messageIndex;

@end

NS_ASSUME_NONNULL_END