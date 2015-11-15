#import "SWGReputationApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGCallReport.h"
#import "SWGReputation.h"


@interface SWGReputationApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGReputationApi

static SWGReputationApi* singletonAPI = nil;

#pragma mark - Initialize methods

- (id) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        self.apiClient = config.apiClient;
        self.defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        self.apiClient = apiClient;
        self.defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+(SWGReputationApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGReputationApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGReputationApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGReputationApi alloc] init];
    }
    return singletonAPI;
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(void) setHeaderValue:(NSString*) value
           forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(unsigned long) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// Report:</b> report spam calls received to better tune our algorithms based upon spam calls you receive
/// This returns information required to perform basic call blocking behaviors<br />\n            Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
///  @param callReport [FromBody] Call Report\n            PhoneNumber, \n            Caller name(optional), \n            Call category(optional), \n            Comment or tags(free text) (optional), \n            Unwanted call  - yes/no(optional),
///
///  @returns void
///
-(NSNumber*) reputationReportWithCompletionBlock: (SWGCallReport*) callReport
        
        
        completionHandler: (void (^)(NSError* error))completionBlock { 

    
    // verify the required parameter 'callReport' is set
    if (callReport == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `callReport` when calling `reputationReport`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/Report"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"text/json", @"application/xml", @"text/xml"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[@"application/json", @"text/json", @"application/xml", @"text/xml", @"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    bodyParam = callReport;
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"POST"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: nil
                                      completionBlock: ^(id data, NSError *error) {
                  completionBlock(error);
                  
              }
          ];
}

///
/// <br />\n<b>Reputation</b>\n<br />\n            Premium service which returns a reputation informaiton of a phone number via API.
/// This returns information required to perform basic call blocking behaviors<br />\n            Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
///  @param phoneNumber phone number to search
///
///  @returns SWGReputation*
///
-(NSNumber*) reputationReputationWithCompletionBlock: (NSString*) phoneNumber
        
        completionHandler: (void (^)(SWGReputation* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `phoneNumber` when calling `reputationReputation`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/Reputation/{phoneNumber}"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (phoneNumber != nil) {
        pathParams[@"phoneNumber"] = phoneNumber;
    }
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.defaultHeaders];

    

    // HTTP header `Accept`
    headerParams[@"Accept"] = [SWGApiClient selectHeaderAccept:@[@"application/json", @"text/json", @"application/xml", @"text/xml"]];
    if ([headerParams[@"Accept"] length] == 0) {
        [headerParams removeObjectForKey:@"Accept"];
    }

    // response content type
    NSString *responseContentType;
    if ([headerParams objectForKey:@"Accept"]) {
        responseContentType = [headerParams[@"Accept"] componentsSeparatedByString:@", "][0];
    }
    else {
        responseContentType = @"";
    }

    // request content type
    NSString *requestContentType = [SWGApiClient selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *files = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithCompletionBlock: resourcePath
                                               method: @"GET"
                                           pathParams: pathParams
                                          queryParams: queryParams
                                           formParams: formParams
                                                files: files
                                                 body: bodyParam
                                         headerParams: headerParams
                                         authSettings: authSettings
                                   requestContentType: requestContentType
                                  responseContentType: responseContentType
                                         responseType: @"SWGReputation*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGReputation*)data, error);
              }
          ];
}



@end
