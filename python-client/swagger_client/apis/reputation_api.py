# coding: utf-8

"""
ReputationApi.py
Copyright 2016 SmartBear Software

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
"""

from __future__ import absolute_import

import sys
import os

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class ReputationApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def reputation_report(self, call_report, **kwargs):
        """
        Report: report spam calls received to better tune our algorithms based upon spam calls you receive
        This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.reputation_report(call_report, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param CallReport call_report: [FromBody] Call Report\r\n            PhoneNumber, \r\n            Caller name(optional), \r\n            Call category(optional), \r\n            Comment or tags(free text) (optional), \r\n            Unwanted call  - yes/no(optional), (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['call_report']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method reputation_report" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'call_report' is set
        if ('call_report' not in params) or (params['call_report'] is None):
            raise ValueError("Missing the required parameter `call_report` when calling `reputation_report`")

        resource_path = '/api/2015-11-01/Report'.replace('{format}', 'json')
        path_params = {}

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'call_report' in params:
            body_params = params['call_report']

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'text/json', 'application/xml', 'text/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json', 'text/json', 'application/xml', 'text/xml', 'application/x-www-form-urlencoded'])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'POST',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def reputation_reputation(self, phone_number, **kwargs):
        """
        Reputation:\r\n            Premium service which returns a reputation informaiton of a phone number via API.
        This returns information required to perform basic call blocking behaviors<br />\r\n            Try with api_key 'demo' and phone numbers 18008472911, 13157244022, 17275567300, 18008276655, and 12061231234 (last one not spam)

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.reputation_reputation(phone_number, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str phone_number: phone number to search (required)
        :return: Reputation
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['phone_number']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method reputation_reputation" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'phone_number' is set
        if ('phone_number' not in params) or (params['phone_number'] is None):
            raise ValueError("Missing the required parameter `phone_number` when calling `reputation_reputation`")

        resource_path = '/api/2015-11-01/Reputation/{phoneNumber}'.replace('{format}', 'json')
        path_params = {}
        if 'phone_number' in params:
            path_params['phoneNumber'] = params['phone_number']

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'text/json', 'application/xml', 'text/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'GET',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type='Reputation',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response
