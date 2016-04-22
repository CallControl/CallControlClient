#
# Copyright 2016 SmartBear Software
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
#
package WWW::SwaggerClient::EnterpriseApiApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;
use WWW::SwaggerClient::Configuration;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class   = shift;
    my (%self) = (
        'api_client' => WWW::SwaggerClient::ApiClient->instance,
        @_
    );

    #my $self = {
    #    #api_client => $options->{api_client}
    #    api_client => $default_api_client
    #}; 

    bless \%self, $class;

}


#
# enterprise_api_get_block_list
#
# Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking
# 
# @param boolean $cached  (optional)
{
    my $params = {
    'cached' => {
        data_type => 'boolean',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ enterprise_api_get_block_list } = { 
    	summary => 'Enterprise  GET: GetBlockList\r\n            Simple Enteprise which returns the current and complete list of numbers that the network is blocking',
        params => $params,
        returns => 'ARRAY[string]',
        };
}
# @return ARRAY[string]
#
sub enterprise_api_get_block_list {
    my ($self, %args) = @_;

    

    # parse inputs
    my $_resource_path = '/api/2015-11-01/Enterprise/GetBlockList';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json', 'text/json', 'application/xml', 'text/xml');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'cached'}) {
        $query_params->{'cached'} = $self->{api_client}->to_query_value($args{'cached'});
    }
    
    
    
    my $_body_data;
    

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[string]', $response);
    return $_response_object;
    
}

#
# enterprise_api_get_user
#
# Enterprise  GET: GetUser\r\n            Returns the current information from the user
# 
# @param string $phone_number  (required)
{
    my $params = {
    'phone_number' => {
        data_type => 'string',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ enterprise_api_get_user } = { 
    	summary => 'Enterprise  GET: GetUser\r\n            Returns the current information from the user',
        params => $params,
        returns => 'CallControlUser',
        };
}
# @return CallControlUser
#
sub enterprise_api_get_user {
    my ($self, %args) = @_;

    
    # verify the required parameter 'phone_number' is set
    unless (exists $args{'phone_number'}) {
      croak("Missing the required parameter 'phone_number' when calling enterprise_api_get_user");
    }
    

    # parse inputs
    my $_resource_path = '/api/2015-11-01/Enterprise/GetUser/{phoneNumber}';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json', 'text/json', 'application/xml', 'text/xml');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    
    
    # path params
    if ( exists $args{'phone_number'}) {
        my $_base_variable = "{" . "phoneNumber" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'phone_number'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }
    
    my $_body_data;
    

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('CallControlUser', $response);
    return $_response_object;
    
}

#
# enterprise_api_should_block
#
# Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.
# 
# @param string $phone_number phone number to search (required)
# @param string $user_phone_number (OPTOPNAL) phone number of user to look up block rules (required)
{
    my $params = {
    'phone_number' => {
        data_type => 'string',
        description => 'phone number to search',
        required => '1',
    },
    'user_phone_number' => {
        data_type => 'string',
        description => '(OPTOPNAL) phone number of user to look up block rules',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ enterprise_api_should_block } = { 
    	summary => 'Enterprise  GET: ShouldBlock\r\n            Simple Enteprise which returns a call block proceed decision.',
        params => $params,
        returns => 'string',
        };
}
# @return string
#
sub enterprise_api_should_block {
    my ($self, %args) = @_;

    
    # verify the required parameter 'phone_number' is set
    unless (exists $args{'phone_number'}) {
      croak("Missing the required parameter 'phone_number' when calling enterprise_api_should_block");
    }
    
    # verify the required parameter 'user_phone_number' is set
    unless (exists $args{'user_phone_number'}) {
      croak("Missing the required parameter 'user_phone_number' when calling enterprise_api_should_block");
    }
    

    # parse inputs
    my $_resource_path = '/api/2015-11-01/Enterprise/ShouldBlock/{phoneNumber}/{userPhoneNumber}';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json', 'text/json', 'application/xml', 'text/xml');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    
    
    # path params
    if ( exists $args{'phone_number'}) {
        my $_base_variable = "{" . "phoneNumber" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'phone_number'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }# path params
    if ( exists $args{'user_phone_number'}) {
        my $_base_variable = "{" . "userPhoneNumber" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'user_phone_number'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }
    
    my $_body_data;
    

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('string', $response);
    return $_response_object;
    
}

#
# enterprise_api_upsert_user
#
# 
# 
# @param CallControlUser $user  (required)
{
    my $params = {
    'user' => {
        data_type => 'CallControlUser',
        description => '',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ enterprise_api_upsert_user } = { 
    	summary => '',
        params => $params,
        returns => 'Object',
        };
}
# @return Object
#
sub enterprise_api_upsert_user {
    my ($self, %args) = @_;

    
    # verify the required parameter 'user' is set
    unless (exists $args{'user'}) {
      croak("Missing the required parameter 'user' when calling enterprise_api_upsert_user");
    }
    

    # parse inputs
    my $_resource_path = '/api/2015-11-01/Enterprise/UpsertUser';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json', 'text/json', 'application/xml', 'text/xml');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json', 'text/json', 'application/xml', 'text/xml', 'application/x-www-form-urlencoded');

    
    
    
    
    my $_body_data;
    # body params
    if ( exists $args{'user'}) {
        $_body_data = $args{'user'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Object', $response);
    return $_response_object;
    
}


1;
