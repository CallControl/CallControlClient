#import "SWGDoNotCallComplaintsApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGDoNotCallComplaints.h"


@interface SWGDoNotCallComplaintsApi ()
    @property (readwrite, nonatomic, strong) NSMutableDictionary *defaultHeaders;
@end

@implementation SWGDoNotCallComplaintsApi

static SWGDoNotCallComplaintsApi* singletonAPI = nil;

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

+(SWGDoNotCallComplaintsApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGDoNotCallComplaintsApi alloc] init];
        [singletonAPI addHeader:headerValue forKey:key];
    }
    return singletonAPI;
}

+(SWGDoNotCallComplaintsApi*) sharedAPI {

    if (singletonAPI == nil) {
        singletonAPI = [[SWGDoNotCallComplaintsApi alloc] init];
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
/// <br />\r\n<b>DoNotCallComplaints</b>\r\n<br />Free service (with registration), providing community and government complaint lookup by phone number for up to 2,000 queries per month.  Details include number complaint rates from (FTC, FCC, IRS, Indiana Attorney  General) and key entity tag extractions from complaints.
/// This is the main funciton to get data out of the call control reporting system<br />\r\n            Try with api_key 'demo' and phone number 12674070100 (spam) 12061231234 (not spam)
///  @param phoneNumber phone number to search
///
///  @returns SWGDoNotCallComplaints*
///
-(NSNumber*) doNotCallComplaintsDoNotCallComplaintsWithCompletionBlock: (NSString*) phoneNumber
        
        completionHandler: (void (^)(SWGDoNotCallComplaints* output, NSError* error))completionBlock { 
        

    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == nil) {
        [NSException raise:@"Invalid parameter" format:@"Missing the required parameter `phoneNumber` when calling `doNotCallComplaintsDoNotCallComplaints`"];
    }
    

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/api/2015-11-01/DoNotCallComplaints/{phoneNumber}"];

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
                                         responseType: @"SWGDoNotCallComplaints*"
                                      completionBlock: ^(id data, NSError *error) {
                  
                  completionBlock((SWGDoNotCallComplaints*)data, error);
              }
          ];
}



@end
