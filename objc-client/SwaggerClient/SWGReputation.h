#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */



@protocol SWGReputation
@end

@interface SWGReputation : SWGObject


@property(nonatomic) NSString* callType;

@property(nonatomic) NSNumber* confidence;

@property(nonatomic) NSNumber* isSpam;

@property(nonatomic) NSDate* lastCompaintDate;

@property(nonatomic) NSString* reportedCallerName;

@property(nonatomic) NSArray* /* NSString */ tags;

@end