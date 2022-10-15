Feature: Validate the car parking lot of the mall
Scenario Outline: verify for getting a parking ticket and existing the parking lot
Given A person in a <4-wheeler> enters the parking lot
When A person ask for parking ticket in 4-wheeler
Then The Ticket ID is given to the person
And The parking lot has <49> 4-wheeler parkings spots remaining and <100> 2-wheeler parking spots remaining
Examples:
|4-wheeler |2-wheeler|
|50        |100      |
