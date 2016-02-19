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
package WWW::SwaggerClient::ReputationApi;

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
# reputation_report
#
# Report: report spam calls received to better tune our algorithms based upon spam calls you receive
# 
# @param CallReport $call_report [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional), (required)
{
    my $params = {
    'call_report' => {
        data_type => 'CallReport',
        description => '[FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional),',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ reputation_report } = { 
    	summary => 'Report: report spam calls received to better tune our algorithms based upon spam calls you receive',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub reputation_report {
    my ($self, %args) = @_;

    
    # verify the required parameter 'call_report' is set
    unless (exists $args{'call_report'}) {
      croak("Missing the required parameter 'call_report' when calling reputation_report");
    }
    

    # parse inputs
    my $_resource_path = '/api/2015-11-01/Report';
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
    if ( exists $args{'call_report'}) {
        $_body_data = $args{'call_report'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
    
}

#
# reputation_reputation
#
# Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.
# 
# @param string $phone_number phone number to search (required)
{
    my $params = {
    'phone_number' => {
        data_type => 'string',
        description => 'phone number to search',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ reputation_reputation } = { 
    	summary => 'Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.',
        params => $params,
        returns => 'Reputation',
        };
}
# @return Reputation
#
sub reputation_reputation {
    my ($self, %args) = @_;

    
    # verify the required parameter 'phone_number' is set
    unless (exists $args{'phone_number'}) {
      croak("Missing the required parameter 'phone_number' when calling reputation_reputation");
    }
    

    # parse inputs
    my $_resource_path = '/api/2015-11-01/Reputation/{phoneNumber}';
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
    my $_response_object = $self->{api_client}->deserialize('Reputation', $response);
    return $_response_object;
    
}


1;
