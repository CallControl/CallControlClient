#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

#import "SWGQuietHour.h"


@protocol SWGCallControlUser
@end

@interface SWGCallControlUser : SWGObject


@property(nonatomic) NSString* phoneNumber;

@property(nonatomic) NSString* phoneNumbeRegion;

@property(nonatomic) NSArray* /* NSString */ whiteList;

@property(nonatomic) NSArray* /* NSString */ blackList;

@property(nonatomic) NSArray<SWGQuietHour>* quietHourList;

@property(nonatomic) NSNumber* useCommunityBlacklist;

@property(nonatomic) NSNumber* breakThroughQhWithMultipleCalls;

@property(nonatomic) NSNumber* whiteListBreaksQh;

@property(nonatomic) NSString* blockBehavior;

@property(nonatomic) NSString* email;

@property(nonatomic) NSNumber* age;

@property(nonatomic) NSString* gender;

@property(nonatomic) NSString* salutation;

@property(nonatomic) NSString* firstName;

@property(nonatomic) NSString* middleName;

@property(nonatomic) NSString* lastName;

@property(nonatomic) NSString* suffix;

@end