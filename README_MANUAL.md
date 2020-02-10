# LIDL SCRM
> The project consist of manual test cases for the Digital Leaflet of the LIDL Plus app. The project tends to check the quality of the product.


NB! In order to check the actual app I used the VPN app for Android and set my phone's fake location to Zaragoza because the app
is not available in Bulgaria and I wasn't able to download the app if my location is stated to Bulgaria. After downloading the Lidl Plus app
I set the store location to Zaragoza - Zar-Avda store and checked all the posibilities I have in the app. After checking any leaflet
there was no option to click on a certain product's details including its photo, availability and description. Also I didn't
find any floating button in order to see the date filters and the filter for the concrete promotions. As described in file:
"If you download the app, you’ll see only the Digital Leaflet available for Zaragoza stores." In order to derive detailed test cases
one needs to be able to check the actual feature or to have a detailed specificatons/requirements list which will give information such as:
1. If the date filters are fields with free text option or there are available drop down calendars from which a date should be chosen.
2. The date format.
3. The structure of the certain promotion filter like is the list of the promotions a drop down menu or radio button or checkboxes.
4. When clicking on a certain product should the description open in the same page or in a new page in order to know if there is API to test.
5. The structure of the database or at least the tables which consist of the surtido and the tables for the certain period of time
in order to check if what is visible in the UI matches the database data.
6. If the certain promotion filter depends on the selected dates or are the both filters independent from one another.

## Table of contents
* [General info](#general-info)
* [Test Cases](#test-cases)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
The project consists of the following test cases based on the description provided in the QA Engineer Hybrid Test (Digital Leaflet) - EN.pdf file:
1. Check surtido's products dates in the Leaflet.
2. Check a certain product's details by selecting the product.
3. Check Floating button's dates filters.
4. Check Floating button's concrete promotion filters.

## Test Cases
1. Check surtido's products dates in the Leaflet.

The test case aims to check if the products in the Leaflet are only products which will be on the surtido for ten days from now. To do this, the following is required:

Check if the first product is the most recent one.

Check if the last product is the oldest one.

Check if any of the middle products corresponds to the middle date of start and end date.

2. Check a certain product's details by selecting the product.

The test case aims to check if a certain selected product from the surtido has all the right information and details.

Check if the selected product is part of the surtido in the selected time frame.

Check if the product's details match the details given in requirements and stated in database.

Check if product's image is corresponding to the product.

Check if the detailed information for the product opens in a new tab and if it does is the new tab's link the correct one.

3. Check Floating button's dates filters.

Check if dates format is as given by specifications.

Check if both date filters have drop down calendars.

Check if the range between the dates can extend to more then 10 days.

Check if the "from" date can be further than the "to" date.

Check if after the filter is applied the products correspond to the selected time period.

4. Check Floating button's concrete promotion filters.

Check if the filter has all of the available promotions in it.

Check if tafter the filter is applied the products correspond to the selected promotion.

Check if after the filter is applied does the filter refresh.

Check if the promotion filter depends on the dates filter.

Check if the promotion filter has in it's options old and already unavailable promotions.

Check if more than one promotion can be selected.



## Status
Project is: _finished_

## Inspiration
The project is inspired by SCRM – LIDL Digital Hub 

## Contact
Created by [@ktodorova0508](https://github.com/ktodorova0508) - feel free to contact me!
