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
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test case below to test the API endpoints.
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::ReputationApi');

my $api = WWW::SwaggerClient::ReputationApi->new();
isa_ok($api, 'WWW::SwaggerClient::ReputationApi');

#
# reputation_report test
#
{
    my $call_report = undef; # replace NULL with a proper value
    my $result = $api->reputation_report(call_report => $call_report);
}

#
# reputation_reputation test
#
{
    my $phone_number = undef; # replace NULL with a proper value
    my $result = $api->reputation_reputation(phone_number => $phone_number);
}


1;