#import "SWGCallReport.h"

@implementation SWGCallReport

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"PhoneNumber": @"phoneNumber", @"ReportedCallerName": @"reportedCallerName", @"ReportedCallerId": @"reportedCallerId", @"CallerType": @"callerType", @"Comment": @"comment", @"UnwantedCall": @"unwantedCall", @"CallTime": @"callTime" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"phoneNumber", @"reportedCallerName", @"reportedCallerId", @"callerType", @"comment", @"unwantedCall", @"callTime"];

  if ([optionalProperties containsObject:propertyName]) {
    return YES;
  }
  else {
    return NO;
  }
}

/**
 * Gets the string presentation of the object.
 * This method will be called when logging model object using `NSLog`.
 */
- (NSString *)description {
    return [[self toDictionary] description];
}

@end
