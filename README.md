# LIDL SCRM
> The project consist of one automation script which tends to open a video in youtube.com

NB! For the manual test cases, please check the "Test Cases" file in the SCRM repository.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
The project is a Maven one and aims to show my skills in coding with Selenium integrated with Java.
The pom.xml file can be found in SCRM repository directly. The pom.xml file consists of dependencies for TestNG and for Selenium and 
Apache Maven plugins which let the code to automate the browser. The executable code can be found in SCRM/src/test/java/PlayYoutubeVideo.java. 
The executable code consists of one public class with declared variable `Webdriver driver` which is used in the 3 methods. The first method 
`setUp()` is a standard Selenium with Java method which is used to open a new browser window and set the desired URL. The second method
`playVideo()` is the actual testing method which follows the below test case steps:

1. Check if the site is youtube.com
2. Find the search box and type "David Bisbal - Mucho más allá (De "Frozen 2")"
3. Click the Search button(next to the search box).
4. From the search results select the first video.
5. Check the URL of the video.

The third method `tearDown()` is another standard Selenium with Java method which is used to close the browser window after the `playVideo()`
method is executed.

## Technologies
* Java - version 1.8
* Selenium - version 3.6.0
* TestNG - version 6.14.3
* Maven - version 3.5.1
- Chrome Browser - version doesn't matter

## Setup
In order to deploy the project to a local environement, one needs to:
- Have installed Java 1.8 + (JRE or JDK)
- Have installed Selenium 3.0 +
- Have installed TestNG 
- Have installed Maven
- Have installed IDE like Eclipse or IntelliJ
- Have installed Chrome Browser, along with chromedriver.exe which driver should be placed local on the machine the code is executed on.
After the driver is downloaded in certain folder, in the class PlayYoutubeVideo.java >> method  `setUp()` >> the driver location must be
changed in the below piece of code:
`System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe");`


## Code Examples
The below part of the code is used to find the search box and enter the David Bisbal - Mucho más allá (De "Frozen 2")

`driver.findElement(By.xpath("//input[@id='search']")).sendKeys("David Bisbal - Mucho más allá (De \"Frozen 2\")");`

## Status
Project is: _finished_

## Inspiration
The project is inspired by SCRM – LIDL Digital Hub 

## Contact
Created by [@ktodorova0508](https://github.com/ktodorova0508) - feel free to contact me!
