#import "SWGCallControlUser.h"

@implementation SWGCallControlUser

- (instancetype)init {
  self = [super init];

  if (self) {
    // initalise property's default value, if any
    
  }

  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"PhoneNumber": @"phoneNumber", @"PhoneNumbeRegion": @"phoneNumbeRegion", @"WhiteList": @"whiteList", @"BlackList": @"blackList", @"QuietHourList": @"quietHourList", @"UseCommunityBlacklist": @"useCommunityBlacklist", @"BreakThroughQhWithMultipleCalls": @"breakThroughQhWithMultipleCalls", @"WhiteListBreaksQh": @"whiteListBreaksQh", @"BlockBehavior": @"blockBehavior", @"Email": @"email", @"Age": @"age", @"Gender": @"gender", @"Salutation": @"salutation", @"FirstName": @"firstName", @"MiddleName": @"middleName", @"LastName": @"lastName", @"Suffix": @"suffix" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"phoneNumber", @"phoneNumbeRegion", @"whiteList", @"blackList", @"quietHourList", @"useCommunityBlacklist", @"breakThroughQhWithMultipleCalls", @"whiteListBreaksQh", @"blockBehavior", @"email", @"age", @"gender", @"salutation", @"firstName", @"middleName", @"lastName", @"suffix"];

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
