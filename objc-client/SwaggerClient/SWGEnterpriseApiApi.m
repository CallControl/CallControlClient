#import "SWGEnterpriseApiApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGCallControlUser.h"
#import "SWGObject.h"


@interface SWGEnterpriseApiApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGEnterpriseApiApi

static SWGEnterpriseApiApi* singletonAPI = nil;

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

+(SWGEnterpriseApiApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGEnterpriseApiApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGEnterpriseApiApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGEnterpriseApiApi alloc] init];
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
/// Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
/// All \r\n            Try with api_key 'demo' for the demo block list (which will block 18008472911, 13157244022, 17275567300, 18008276655) but not 12061231234
///  @param cached  (optional)
///
///  @returns NSArray* /* NSString */
///
-(NSNumber*) enterpriseApiGetBlockListWithCached: (NSNumber*) cached
    completionHandler: (void (^)(NSArray* /* NSString */ output, NSError* error)) handler {

    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/Enterprise/GetBlockList"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (cached != nil) {
        
        queryParams[@"cached"] = cached;
    }
    
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
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray* /* NSString */"
                           completionBlock: ^(id data, NSError *error) {
                               handler((NSArray* /* NSString */)data, error);
                           }
          ];
}

///
/// Enterprise  GET: GetUser\r\n            Returns the current information from the user
/// 
///  @param phoneNumber  
///
///  @returns SWGCallControlUser*
///
-(NSNumber*) enterpriseApiGetUserWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(SWGCallControlUser* output, NSError* error)) handler {

    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `phoneNumber` when calling `enterpriseApiGetUser`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/Enterprise/GetUser/{phoneNumber}"];

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
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGCallControlUser*"
                           completionBlock: ^(id data, NSError *error) {
                               handler((SWGCallControlUser*)data, error);
                           }
          ];
}

///
/// Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
/// This returns information required to perform basic call blocking behaviors\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)
///  @param phoneNumber phone number to search 
///
///  @param userPhoneNumber (OPTOPNAL) phone number of user to look up block rules 
///
///  @returns NSString*
///
-(NSNumber*) enterpriseApiShouldBlockWithPhoneNumber: (NSString*) phoneNumber
    userPhoneNumber: (NSString*) userPhoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {

    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `phoneNumber` when calling `enterpriseApiShouldBlock`"];
    }
    
    // verify the required parameter 'userPhoneNumber' is set
    if (userPhoneNumber == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `userPhoneNumber` when calling `enterpriseApiShouldBlock`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber}"];

    // remove format in URL if needed
    if ([resourcePath rangeOfString:@".{format}"].location != NSNotFound) {
        [resourcePath replaceCharactersInRange: [resourcePath rangeOfString:@".{format}"] withString:@".json"];
    }

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (phoneNumber != nil) {
        pathParams[@"phoneNumber"] = phoneNumber;
    }
    if (userPhoneNumber != nil) {
        pathParams[@"userPhoneNumber"] = userPhoneNumber;
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
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    
    
    

    
    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                               handler((NSString*)data, error);
                           }
          ];
}

///
/// 
/// 
///  @param user  
///
///  @returns SWGObject*
///
-(NSNumber*) enterpriseApiUpsertUserWithUser: (SWGCallControlUser*) user
    completionHandler: (void (^)(SWGObject* output, NSError* error)) handler {

    
    // verify the required parameter 'user' is set
    if (user == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `user` when calling `enterpriseApiUpsertUser`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/Enterprise/UpsertUser"];

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
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    
    bodyParam = user;
    

    
    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGObject*"
                           completionBlock: ^(id data, NSError *error) {
                               handler((SWGObject*)data, error);
                           }
          ];
}



@end
