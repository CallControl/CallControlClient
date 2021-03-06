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


class QuietHour(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        QuietHour - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'day_of_week_list': 'list[str]',
            'start_hour_local': 'int',
            'start_min_local': 'int',
            'duration_min': 'int',
            'time_zone_name': 'str'
        }

        self.attribute_map = {
            'day_of_week_list': 'DayOfWeekList',
            'start_hour_local': 'StartHourLocal',
            'start_min_local': 'StartMinLocal',
            'duration_min': 'DurationMin',
            'time_zone_name': 'TimeZoneName'
        }

        self._day_of_week_list = None
        self._start_hour_local = None
        self._start_min_local = None
        self._duration_min = None
        self._time_zone_name = None

    @property
    def day_of_week_list(self):
        """
        Gets the day_of_week_list of this QuietHour.


        :return: The day_of_week_list of this QuietHour.
        :rtype: list[str]
        """
        return self._day_of_week_list

    @day_of_week_list.setter
    def day_of_week_list(self, day_of_week_list):
        """
        Sets the day_of_week_list of this QuietHour.


        :param day_of_week_list: The day_of_week_list of this QuietHour.
        :type: list[str]
        """
        self._day_of_week_list = day_of_week_list

    @property
    def start_hour_local(self):
        """
        Gets the start_hour_local of this QuietHour.


        :return: The start_hour_local of this QuietHour.
        :rtype: int
        """
        return self._start_hour_local

    @start_hour_local.setter
    def start_hour_local(self, start_hour_local):
        """
        Sets the start_hour_local of this QuietHour.


        :param start_hour_local: The start_hour_local of this QuietHour.
        :type: int
        """
        self._start_hour_local = start_hour_local

    @property
    def start_min_local(self):
        """
        Gets the start_min_local of this QuietHour.


        :return: The start_min_local of this QuietHour.
        :rtype: int
        """
        return self._start_min_local

    @start_min_local.setter
    def start_min_local(self, start_min_local):
        """
        Sets the start_min_local of this QuietHour.


        :param start_min_local: The start_min_local of this QuietHour.
        :type: int
        """
        self._start_min_local = start_min_local

    @property
    def duration_min(self):
        """
        Gets the duration_min of this QuietHour.


        :return: The duration_min of this QuietHour.
        :rtype: int
        """
        return self._duration_min

    @duration_min.setter
    def duration_min(self, duration_min):
        """
        Sets the duration_min of this QuietHour.


        :param duration_min: The duration_min of this QuietHour.
        :type: int
        """
        self._duration_min = duration_min

    @property
    def time_zone_name(self):
        """
        Gets the time_zone_name of this QuietHour.


        :return: The time_zone_name of this QuietHour.
        :rtype: str
        """
        return self._time_zone_name

    @time_zone_name.setter
    def time_zone_name(self, time_zone_name):
        """
        Sets the time_zone_name of this QuietHour.


        :param time_zone_name: The time_zone_name of this QuietHour.
        :type: str
        """
        self._time_zone_name = time_zone_name

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

