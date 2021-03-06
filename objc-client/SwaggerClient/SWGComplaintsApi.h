#import <Foundation/Foundation.h>
#import "SWGComplaints.h"
#import "SWGObject.h"
#import "SWGApiClient.h"


/**
 * NOTE: This class is auto generated by the swagger code generator program. 
 * https://github.com/swagger-api/swagger-codegen 
 * Do not edit the class manually.
 */

@interface SWGComplaintsApi: NSObject

@property(nonatomic, assign)SWGApiClient *apiClient;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient;
-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGComplaintsApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(SWGComplaintsApi*) sharedAPI;
///
///
/// Complaints: Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
/// This is the main funciton to get data out of the call control reporting system<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
///
/// @param phoneNumber phone number to search
/// 
///
/// @return SWGComplaints*
-(NSNumber*) complaintsComplaintsWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(SWGComplaints* output, NSError* error)) handler;



@end
