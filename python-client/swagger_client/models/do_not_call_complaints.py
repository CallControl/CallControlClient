# coding: utf-8

"""
Copyright 2015 SmartBear Software

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


class DoNotCallComplaints(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        DoNotCallComplaints - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'reported_caller_name': 'str',
            'total_number_of_complaints': 'int',
            'complaints_by_gov_entity': 'dict(str, int)',
            'last_compaint_date': 'datetime',
            'tags': 'list[str]'
        }

        self.attribute_map = {
            'reported_caller_name': 'ReportedCallerName',
            'total_number_of_complaints': 'TotalNumberOfComplaints',
            'complaints_by_gov_entity': 'ComplaintsByGovEntity',
            'last_compaint_date': 'LastCompaintDate',
            'tags': 'Tags'
        }

        self._reported_caller_name = None
        self._total_number_of_complaints = None
        self._complaints_by_gov_entity = None
        self._last_compaint_date = None
        self._tags = None

    @property
    def reported_caller_name(self):
        """
        Gets the reported_caller_name of this DoNotCallComplaints.
        Reported Caller Name

        :return: The reported_caller_name of this DoNotCallComplaints.
        :rtype: str
        """
        return self._reported_caller_name

    @reported_caller_name.setter
    def reported_caller_name(self, reported_caller_name):
        """
        Sets the reported_caller_name of this DoNotCallComplaints.
        Reported Caller Name

        :param reported_caller_name: The reported_caller_name of this DoNotCallComplaints.
        :type: str
        """
        self._reported_caller_name = reported_caller_name

    @property
    def total_number_of_complaints(self):
        """
        Gets the total_number_of_complaints of this DoNotCallComplaints.


        :return: The total_number_of_complaints of this DoNotCallComplaints.
        :rtype: int
        """
        return self._total_number_of_complaints

    @total_number_of_complaints.setter
    def total_number_of_complaints(self, total_number_of_complaints):
        """
        Sets the total_number_of_complaints of this DoNotCallComplaints.


        :param total_number_of_complaints: The total_number_of_complaints of this DoNotCallComplaints.
        :type: int
        """
        self._total_number_of_complaints = total_number_of_complaints

    @property
    def complaints_by_gov_entity(self):
        """
        Gets the complaints_by_gov_entity of this DoNotCallComplaints.


        :return: The complaints_by_gov_entity of this DoNotCallComplaints.
        :rtype: dict(str, int)
        """
        return self._complaints_by_gov_entity

    @complaints_by_gov_entity.setter
    def complaints_by_gov_entity(self, complaints_by_gov_entity):
        """
        Sets the complaints_by_gov_entity of this DoNotCallComplaints.


        :param complaints_by_gov_entity: The complaints_by_gov_entity of this DoNotCallComplaints.
        :type: dict(str, int)
        """
        self._complaints_by_gov_entity = complaints_by_gov_entity

    @property
    def last_compaint_date(self):
        """
        Gets the last_compaint_date of this DoNotCallComplaints.


        :return: The last_compaint_date of this DoNotCallComplaints.
        :rtype: datetime
        """
        return self._last_compaint_date

    @last_compaint_date.setter
    def last_compaint_date(self, last_compaint_date):
        """
        Sets the last_compaint_date of this DoNotCallComplaints.


        :param last_compaint_date: The last_compaint_date of this DoNotCallComplaints.
        :type: datetime
        """
        self._last_compaint_date = last_compaint_date

    @property
    def tags(self):
        """
        Gets the tags of this DoNotCallComplaints.


        :return: The tags of this DoNotCallComplaints.
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this DoNotCallComplaints.


        :param tags: The tags of this DoNotCallComplaints.
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
