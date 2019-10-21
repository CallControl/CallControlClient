=begin
Call Control API

API for blocking phone calls with Call Control. Data is from crowdsourced community blacklist from 12+ million users and government agencies (FTC, FCC, IRS) Try with api_key 'demo', hit explore above, and then try phone numbers 18008472911,13157244022,17275567300,18008276655,12061231234.

OpenAPI spec version: 2015-11-01
Contact: info@kedlin.com
Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::QuietHour
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'QuietHour' do
  before do
    # run before each test
    @instance = SwaggerClient::QuietHour.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of QuietHour' do
    it 'should create an instact of QuietHour' do
      @instance.should be_a(SwaggerClient::QuietHour) 
    end
  end
  describe 'test attribute "day_of_week_list"' do
    it 'should work' do
       # assertion here
       # should be_a()
       # should be_nil
       # should ==
       # should_not ==
    end
  end

  describe 'test attribute "start_hour_local"' do
    it 'should work' do
       # assertion here
       # should be_a()
       # should be_nil
       # should ==
       # should_not ==
    end
  end

  describe 'test attribute "start_min_local"' do
    it 'should work' do
       # assertion here
       # should be_a()
       # should be_nil
       # should ==
       # should_not ==
    end
  end

  describe 'test attribute "duration_min"' do
    it 'should work' do
       # assertion here
       # should be_a()
       # should be_nil
       # should ==
       # should_not ==
    end
  end

  describe 'test attribute "time_zone_name"' do
    it 'should work' do
       # assertion here
       # should be_a()
       # should be_nil
       # should ==
       # should_not ==
    end
  end

end
