#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */



@protocol SWGComplaints
@end

@interface SWGComplaints : SWGObject

/* Reported Caller Name [optional]
 */
@property(nonatomic) NSString* reportedCallerName;

@property(nonatomic) NSNumber* totalNumberOfComplaints;

@property(nonatomic) NSDictionary* /* NSString, NSNumber */ complaintsByEntity;

@property(nonatomic) NSDate* lastCompaintDate;

@property(nonatomic) NSArray* /* NSString */ tags;

@end