# ClockTimeZoneProject

## Synopsis
This program will give the user their current day, date, time, and timezone. Along with this, it'll display the UTC timezone and three other timezones based on the western hemisphere, namely ones in the US. 

## Motivation
I built this because I enjoy time and the passage of time. Everyone should know what time it is at any given moment, and this is one way to do it.

## How to Run
To run the program, all you need to do is to put it into whatever software you can start up code in and use it. To use the custom clock section, all you need to do is enter the code and seek out where it says "Clock clock2 = new Clock( );" and put your own variables in there. For example (hours first, minutes, then seconds): Clock clock2 = new Clock(5, 12, 20); 

## Code Example
I really enjoy this part of the code because it's what wraps everything up together and is what essentially makes all of the code work.
```
System.out.println("\nCurrent Army Time in UTC:" + "\n" + clock1.getHour() + ":" + clock1.getMinute() + ":" + clock1.getSecond());
```

## Tests
Running it is relatively easily. All you need to do is insert the code wherever you please and run it. To use the custom clock, read the "How to Run" section.
