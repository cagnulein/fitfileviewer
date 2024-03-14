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


#import "FITMessage+Internal.h"


#import "FITFieldCapabilitiesMesg.h"

@implementation FITFieldCapabilitiesMesg

- (instancetype)init {
    self = [super initWithFitMesgIndex:fit::Profile::MESG_FIELD_CAPABILITIES];

    return self;
}

// MessageIndex 
- (BOOL)isMessageIndexValid {
	const fit::Field* field = [super getField:254];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITMessageIndex)getMessageIndex {
    return ([super getFieldUINT16ValueForField:254 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setMessageIndex:(FITMessageIndex)messageIndex {
    [super setFieldUINT16ValueForField:254 andValue:(messageIndex) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// File 
- (BOOL)isFileValid {
	const fit::Field* field = [super getField:0];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITFile)getFile {
    return ([super getFieldENUMValueForField:0 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setFile:(FITFile)file {
    [super setFieldENUMValueForField:0 andValue:(file) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// MesgNum 
- (BOOL)isMesgNumValid {
	const fit::Field* field = [super getField:1];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITMesgNum)getMesgNum {
    return ([super getFieldUINT16ValueForField:1 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setMesgNum:(FITMesgNum)mesgNum {
    [super setFieldUINT16ValueForField:1 andValue:(mesgNum) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// FieldNum 
- (BOOL)isFieldNumValid {
	const fit::Field* field = [super getField:2];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITUInt8)getFieldNum {
    return ([super getFieldUINT8ValueForField:2 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setFieldNum:(FITUInt8)fieldNum {
    [super setFieldUINT8ValueForField:2 andValue:(fieldNum) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

// Count 
- (BOOL)isCountValid {
	const fit::Field* field = [super getField:3];
	if( FIT_NULL == field ) {
		return FALSE;
	}

	return field->IsValueValid() == FIT_TRUE ? TRUE : FALSE;
}

- (FITUInt16)getCount {
    return ([super getFieldUINT16ValueForField:3 forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD]);
}

- (void)setCount:(FITUInt16)count {
    [super setFieldUINT16ValueForField:3 andValue:(count) forIndex:0 andSubFieldIndex:FIT_SUBFIELD_INDEX_MAIN_FIELD];
} 

@end