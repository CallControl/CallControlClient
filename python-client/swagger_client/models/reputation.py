# coding: utf-8

"""
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

    Ref: https://github.com/swagger-api/swagger-codegen
"""

from pprint import pformat
from six import iteritems


class Reputation(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        Reputation - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'call_type': 'str',
            'confidence': 'int',
            'is_spam': 'bool',
            'last_compaint_date': 'datetime',
            'reported_caller_name': 'str',
            'tags': 'list[str]'
        }

        self.attribute_map = {
            'call_type': 'CallType',
            'confidence': 'Confidence',
            'is_spam': 'IsSpam',
            'last_compaint_date': 'LastCompaintDate',
            'reported_caller_name': 'ReportedCallerName',
            'tags': 'Tags'
        }

        self._call_type = None
        self._confidence = None
        self._is_spam = None
        self._last_compaint_date = None
        self._reported_caller_name = None
        self._tags = None

    @property
    def call_type(self):
        """
        Gets the call_type of this Reputation.


        :return: The call_type of this Reputation.
        :rtype: str
        """
        return self._call_type

    @call_type.setter
    def call_type(self, call_type):
        """
        Sets the call_type of this Reputation.


        :param call_type: The call_type of this Reputation.
        :type: str
        """
        self._call_type = call_type

    @property
    def confidence(self):
        """
        Gets the confidence of this Reputation.


        :return: The confidence of this Reputation.
        :rtype: int
        """
        return self._confidence

    @confidence.setter
    def confidence(self, confidence):
        """
        Sets the confidence of this Reputation.


        :param confidence: The confidence of this Reputation.
        :type: int
        """
        self._confidence = confidence

    @property
    def is_spam(self):
        """
        Gets the is_spam of this Reputation.


        :return: The is_spam of this Reputation.
        :rtype: bool
        """
        return self._is_spam

    @is_spam.setter
    def is_spam(self, is_spam):
        """
        Sets the is_spam of this Reputation.


        :param is_spam: The is_spam of this Reputation.
        :type: bool
        """
        self._is_spam = is_spam

    @property
    def last_compaint_date(self):
        """
        Gets the last_compaint_date of this Reputation.


        :return: The last_compaint_date of this Reputation.
        :rtype: datetime
        """
        return self._last_compaint_date

    @last_compaint_date.setter
    def last_compaint_date(self, last_compaint_date):
        """
        Sets the last_compaint_date of this Reputation.


        :param last_compaint_date: The last_compaint_date of this Reputation.
        :type: datetime
        """
        self._last_compaint_date = last_compaint_date

    @property
    def reported_caller_name(self):
        """
        Gets the reported_caller_name of this Reputation.


        :return: The reported_caller_name of this Reputation.
        :rtype: str
        """
        return self._reported_caller_name

    @reported_caller_name.setter
    def reported_caller_name(self, reported_caller_name):
        """
        Sets the reported_caller_name of this Reputation.


        :param reported_caller_name: The reported_caller_name of this Reputation.
        :type: str
        """
        self._reported_caller_name = reported_caller_name

    @property
    def tags(self):
        """
        Gets the tags of this Reputation.


        :return: The tags of this Reputation.
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this Reputation.


        :param tags: The tags of this Reputation.
        :type: list[str]
        """
        self._tags = tags

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other

