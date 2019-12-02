# Location button

A simple button to fetch current location and address

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

### Prerequisites

You need to add the jitpack.io repository:

```
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

### Installing

Add following dependency inside app level build.gradle

```
implementation 'com.github.TechPakka:LocationButton:1.0'
```

Add these permissions inside manifest file

```
<uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```
    
And add this code inside your oncreate method

```
locationButton.initLocationItems(this)
locationButton.setLocationButtonListener(this)
```

Also do not forget to implement LocationButtonListener to fetch location and street address
