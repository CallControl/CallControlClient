# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "swagger_client"
VERSION = "1.0.0"



# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.10", "six >= 1.9", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Call Control API",
    author_email="info@kedlin.com",
    url="http://callcontrol.com/docs",
    keywords=["Swagger", "Call Control API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    API for blocking phone calls with Call Control. Data is from crowdsourced community blacklist from 12+ million users and government agencies (FTC, FCC, IRS)&lt;br/&gt;&lt;br/&gt;Try with api_key &#39;demo&#39;, hit explore above, and then try phone number 12012574082 (spam) 12061231234 (not spam)
    """
)


