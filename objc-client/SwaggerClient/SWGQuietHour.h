#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */



@protocol SWGQuietHour
@end

@interface SWGQuietHour : SWGObject


@property(nonatomic) NSArray* /* NSString */ dayOfWeekList;

@property(nonatomic) NSNumber* startHourLocal;

@property(nonatomic) NSNumber* startMinLocal;

@property(nonatomic) NSNumber* durationMin;

@property(nonatomic) NSString* timeZoneName;

@end