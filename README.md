Android-AOPExample [![Build Status](https://travis-ci.org/android10/Android-AOPExample.svg)](https://travis-ci.org/android10/Android-AOPExample)
==================

This is a simple example of [Aspect Oriented Programming in Android](http://fernandocejas.com/2014/08/03/aspect-oriented-programming-in-android/) as part of a blog post I have written.
The idea was to measure how long takes a method to be executed, so based on annotations, a Metrics aspect was created for making easy to trace a method execution (you can take a look at the 'gintonic' folder).
I wrote an article about Aspect Oriented Development in Android here:

After developing this I realized Jake Wharton has already created a very useful library called [Hugo](https://github.com/JakeWharton/hugo) (I refactored my code to look like this amazing library but mine is kind of a more primitive version, although as an example works fine :)).

The idea is simple, you just add `@DebugTrace` to any method and in the logcat you will see something like this:

```
Gintonic --> onMeasure --> [10ms]
```


Local Development
-----------------

Here are some useful Gradle/adb commands for executing this example:

 * `./gradlew clean build` - Build the entire example.
 * `./gradlew installDebug` - Install the debug apk in the current connected device.
 * `adb shell am start -n android10.org.viewgroupperformance/org.android10.viewgroupperformance.activity.MainActivity` - Start the Main Activity of the example.


License
--------

    Copyright 2014 Fernando Cejas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


![http://www.fernandocejas.com](http://www.android10.org/myimages/android10_logo_big_github.png)
