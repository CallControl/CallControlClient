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


class CallControlUser(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        CallControlUser - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'phone_number': 'str',
            'phone_numbe_region': 'str',
            'white_list': 'list[str]',
            'black_list': 'list[str]',
            'quiet_hour_list': 'list[QuietHour]',
            'use_community_blacklist': 'bool',
            'break_through_qh_with_multiple_calls': 'bool',
            'white_list_breaks_qh': 'bool',
            'block_behavior': 'str',
            'email': 'str',
            'age': 'int',
            'gender': 'str',
            'salutation': 'str',
            'first_name': 'str',
            'middle_name': 'str',
            'last_name': 'str',
            'suffix': 'str'
        }

        self.attribute_map = {
            'phone_number': 'PhoneNumber',
            'phone_numbe_region': 'PhoneNumbeRegion',
            'white_list': 'WhiteList',
            'black_list': 'BlackList',
            'quiet_hour_list': 'QuietHourList',
            'use_community_blacklist': 'UseCommunityBlacklist',
            'break_through_qh_with_multiple_calls': 'BreakThroughQhWithMultipleCalls',
            'white_list_breaks_qh': 'WhiteListBreaksQh',
            'block_behavior': 'BlockBehavior',
            'email': 'Email',
            'age': 'Age',
            'gender': 'Gender',
            'salutation': 'Salutation',
            'first_name': 'FirstName',
            'middle_name': 'MiddleName',
            'last_name': 'LastName',
            'suffix': 'Suffix'
        }

        self._phone_number = None
        self._phone_numbe_region = None
        self._white_list = None
        self._black_list = None
        self._quiet_hour_list = None
        self._use_community_blacklist = None
        self._break_through_qh_with_multiple_calls = None
        self._white_list_breaks_qh = None
        self._block_behavior = None
        self._email = None
        self._age = None
        self._gender = None
        self._salutation = None
        self._first_name = None
        self._middle_name = None
        self._last_name = None
        self._suffix = None

    @property
    def phone_number(self):
        """
        Gets the phone_number of this CallControlUser.


        :return: The phone_number of this CallControlUser.
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """
        Sets the phone_number of this CallControlUser.


        :param phone_number: The phone_number of this CallControlUser.
        :type: str
        """
        self._phone_number = phone_number

    @property
    def phone_numbe_region(self):
        """
        Gets the phone_numbe_region of this CallControlUser.


        :return: The phone_numbe_region of this CallControlUser.
        :rtype: str
        """
        return self._phone_numbe_region

    @phone_numbe_region.setter
    def phone_numbe_region(self, phone_numbe_region):
        """
        Sets the phone_numbe_region of this CallControlUser.


        :param phone_numbe_region: The phone_numbe_region of this CallControlUser.
        :type: str
        """
        self._phone_numbe_region = phone_numbe_region

    @property
    def white_list(self):
        """
        Gets the white_list of this CallControlUser.


        :return: The white_list of this CallControlUser.
        :rtype: list[str]
        """
        return self._white_list

    @white_list.setter
    def white_list(self, white_list):
        """
        Sets the white_list of this CallControlUser.


        :param white_list: The white_list of this CallControlUser.
        :type: list[str]
        """
        self._white_list = white_list

    @property
    def black_list(self):
        """
        Gets the black_list of this CallControlUser.


        :return: The black_list of this CallControlUser.
        :rtype: list[str]
        """
        return self._black_list

    @black_list.setter
    def black_list(self, black_list):
        """
        Sets the black_list of this CallControlUser.


        :param black_list: The black_list of this CallControlUser.
        :type: list[str]
        """
        self._black_list = black_list

    @property
    def quiet_hour_list(self):
        """
        Gets the quiet_hour_list of this CallControlUser.


        :return: The quiet_hour_list of this CallControlUser.
        :rtype: list[QuietHour]
        """
        return self._quiet_hour_list

    @quiet_hour_list.setter
    def quiet_hour_list(self, quiet_hour_list):
        """
        Sets the quiet_hour_list of this CallControlUser.


        :param quiet_hour_list: The quiet_hour_list of this CallControlUser.
        :type: list[QuietHour]
        """
        self._quiet_hour_list = quiet_hour_list

    @property
    def use_community_blacklist(self):
        """
        Gets the use_community_blacklist of this CallControlUser.


        :return: The use_community_blacklist of this CallControlUser.
        :rtype: bool
        """
        return self._use_community_blacklist

    @use_community_blacklist.setter
    def use_community_blacklist(self, use_community_blacklist):
        """
        Sets the use_community_blacklist of this CallControlUser.


        :param use_community_blacklist: The use_community_blacklist of this CallControlUser.
        :type: bool
        """
        self._use_community_blacklist = use_community_blacklist

    @property
    def break_through_qh_with_multiple_calls(self):
        """
        Gets the break_through_qh_with_multiple_calls of this CallControlUser.


        :return: The break_through_qh_with_multiple_calls of this CallControlUser.
        :rtype: bool
        """
        return self._break_through_qh_with_multiple_calls

    @break_through_qh_with_multiple_calls.setter
    def break_through_qh_with_multiple_calls(self, break_through_qh_with_multiple_calls):
        """
        Sets the break_through_qh_with_multiple_calls of this CallControlUser.


        :param break_through_qh_with_multiple_calls: The break_through_qh_with_multiple_calls of this CallControlUser.
        :type: bool
        """
        self._break_through_qh_with_multiple_calls = break_through_qh_with_multiple_calls

    @property
    def white_list_breaks_qh(self):
        """
        Gets the white_list_breaks_qh of this CallControlUser.


        :return: The white_list_breaks_qh of this CallControlUser.
        :rtype: bool
        """
        return self._white_list_breaks_qh

    @white_list_breaks_qh.setter
    def white_list_breaks_qh(self, white_list_breaks_qh):
        """
        Sets the white_list_breaks_qh of this CallControlUser.


        :param white_list_breaks_qh: The white_list_breaks_qh of this CallControlUser.
        :type: bool
        """
        self._white_list_breaks_qh = white_list_breaks_qh

    @property
    def block_behavior(self):
        """
        Gets the block_behavior of this CallControlUser.


        :return: The block_behavior of this CallControlUser.
        :rtype: str
        """
        return self._block_behavior

    @block_behavior.setter
    def block_behavior(self, block_behavior):
        """
        Sets the block_behavior of this CallControlUser.


        :param block_behavior: The block_behavior of this CallControlUser.
        :type: str
        """
        allowed_values = ["allow", "voiceMail", "block"]
        if block_behavior not in allowed_values:
            raise ValueError(
                "Invalid value for `block_behavior`, must be one of {0}"
                .format(allowed_values)
            )
        self._block_behavior = block_behavior

    @property
    def email(self):
        """
        Gets the email of this CallControlUser.


        :return: The email of this CallControlUser.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """
        Sets the email of this CallControlUser.


        :param email: The email of this CallControlUser.
        :type: str
        """
        self._email = email

    @property
    def age(self):
        """
        Gets the age of this CallControlUser.


        :return: The age of this CallControlUser.
        :rtype: int
        """
        return self._age

    @age.setter
    def age(self, age):
        """
        Sets the age of this CallControlUser.


        :param age: The age of this CallControlUser.
        :type: int
        """
        self._age = age

    @property
    def gender(self):
        """
        Gets the gender of this CallControlUser.


        :return: The gender of this CallControlUser.
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """
        Sets the gender of this CallControlUser.


        :param gender: The gender of this CallControlUser.
        :type: str
        """
        self._gender = gender

    @property
    def salutation(self):
        """
        Gets the salutation of this CallControlUser.


        :return: The salutation of this CallControlUser.
        :rtype: str
        """
        return self._salutation

    @salutation.setter
    def salutation(self, salutation):
        """
        Sets the salutation of this CallControlUser.


        :param salutation: The salutation of this CallControlUser.
        :type: str
        """
        self._salutation = salutation

    @property
    def first_name(self):
        """
        Gets the first_name of this CallControlUser.


        :return: The first_name of this CallControlUser.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """
        Sets the first_name of this CallControlUser.


        :param first_name: The first_name of this CallControlUser.
        :type: str
        """
        self._first_name = first_name

    @property
    def middle_name(self):
        """
        Gets the middle_name of this CallControlUser.


        :return: The middle_name of this CallControlUser.
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name):
        """
        Sets the middle_name of this CallControlUser.


        :param middle_name: The middle_name of this CallControlUser.
        :type: str
        """
        self._middle_name = middle_name

    @property
    def last_name(self):
        """
        Gets the last_name of this CallControlUser.


        :return: The last_name of this CallControlUser.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """
        Sets the last_name of this CallControlUser.


        :param last_name: The last_name of this CallControlUser.
        :type: str
        """
        self._last_name = last_name

    @property
    def suffix(self):
        """
        Gets the suffix of this CallControlUser.


        :return: The suffix of this CallControlUser.
        :rtype: str
        """
        return self._suffix

    @suffix.setter
    def suffix(self, suffix):
        """
        Sets the suffix of this CallControlUser.


        :param suffix: The suffix of this CallControlUser.
        :type: str
        """
        self._suffix = suffix

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
