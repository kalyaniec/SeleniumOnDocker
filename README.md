# SeleniumOnDocker
How to run Selenium on docker

Display containers are running on the machine:
  >>   docker ps

Pull the docker images from Docker Hub
  Selenium Standalone with Chrome
  >>docker pull selenium/standalone-chrome:latest
  Selenium Standalone with Firefox
 >>docker pull selenium/standalone-firefox:latest

Displays images pulled into system
>> docker images

Creating container by using image:
>>   docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:latest

>>   docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-firefox:latest


>>   VBoxManage startvm "Ubuntu2" --type headless

  •	Node.js v14.15.3 to /usr/local/bin/node
	•	npm v6.14.9 to /usr/local/bin/npm
