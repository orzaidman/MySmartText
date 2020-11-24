# MySmartText
[![](https://jitpack.io/v/orzaidman/MySmartText.svg)](https://jitpack.io/#orzaidman/MySmartText)

![](https://github.com/orzaidman/MySmartText/blob/master/smart.gif)

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.orzaidman:MySmartText:1.0.0.01'
	}
	
	
	
# Usage
Basicly it's a textview with custom attributes.
Speed012 - default is 1 - 0 fastest
  ```
  <com.or.mysmartview.SmartTextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="loading.."
    android:textSize="80dp"
    android:layout_centerInParent="true"
    tools:ignore="MissingConstraints"
    app:speed012="1"
        android:textColor="@color/black"
        />```
