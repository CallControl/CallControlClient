package WWW::SwaggerClient::Object::Reputation;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use base "WWW::SwaggerClient::Object::BaseObject";

#
#
#
#NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
#

__PACKAGE__->swagger_types( {
    'call_type' => 'string',
    'confidence' => 'int',
    'is_spam' => 'boolean',
    'last_compaint_date' => 'DateTime',
    'reported_caller_name' => 'string',
    'tags' => 'ARRAY[string]'
} );

__PACKAGE__->attribute_map( {
    'call_type' => 'CallType',
    'confidence' => 'Confidence',
    'is_spam' => 'IsSpam',
    'last_compaint_date' => 'LastCompaintDate',
    'reported_caller_name' => 'ReportedCallerName',
    'tags' => 'Tags'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});

1;
