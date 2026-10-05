# Android Application Demonstrating Implicit & Explicit Intent

## Aim

Create an Android application which demonstrates **Implicit Intent** and **Explicit Intent**.

## Description

This practical demonstrates how Android Intents are used to communicate between activities and applications.

The application provides different buttons to perform various actions such as making a phone call, opening a URL, viewing the call log, opening the gallery, setting an alarm, opening the camera, and navigating to another activity.

## Features

- Make a call to a specific number
- Open a specific URL
- Open Call Log
- Open Gallery
- Set an Alarm
- Open Camera
- Open Login Activity

## Types of Intent Used

### Implicit Intent

An implicit intent does not specify a particular application or activity. Instead, it specifies an action that needs to be performed, and Android finds a suitable application to handle that action.

Implicit intents are used in this application for:

- Making a phone call
- Opening a website
- Opening the call log
- Opening the gallery
- Setting an alarm
- Opening the camera

### Explicit Intent

An explicit intent specifies the exact activity or component that should be opened.

Explicit intent is used in this application to:

- Open `LoginActivity` from `MainActivity`

## Actions Demonstrated

### 1. Make Call

The application opens the phone dialer with a specific phone number.

The `tel:` URI scheme is used to specify the phone number.

### 2. Open Specific URL

The application opens a specific website using the device's web browser.

`Uri.parse()` is used to convert the URL string into a URI.

### 3. Open Call Log

The application opens the device's call log.

`CallLog.Calls.CONTENT_TYPE` is used to access the call log.

### 4. Open Gallery

The application opens the device's gallery or image picker.

The `"image/*"` MIME type is used to indicate that image files are required.

### 5. Set Alarm

The application opens the device's alarm application and allows an alarm to be set.

### 6. Open Camera

The application opens the camera application using an appropriate camera intent.

### 7. Open Login Activity

The application navigates from `MainActivity` to `LoginActivity` using an explicit intent.

## Android Components Used

- MainActivity
- LoginActivity
- Button
- TextView
- ConstraintLayout
- CoordinatorLayout
- Intent
- Uri
- ActivityResultContracts

## Android Concepts Studied

- Intent
- Implicit Intent
- Explicit Intent
- Types of Intent Actions
- Intent.setData()
- Intent.setType()
- startActivity()
- ActivityResultContracts
- Permission in Manifest
- ContextCompat.checkSelfPermission()
- ActivityCompat.requestPermissions()
- Uri.parse()

## Constants Used

The practical demonstrates the use of:

- `ContactsContract.Contacts.CONTENT_TYPE`
- `CallLog.Calls.CONTENT_TYPE`
- `"image/*"`
- `"tel:"`

## Project Structure

The main components of the project are:

- `MainActivity.kt`
- `LoginActivity.kt`
- `activity_main.xml`
- `activity_login.xml`
- `AndroidManifest.xml`

## Permissions

Some operations may require permissions to be declared in the `AndroidManifest.xml` file and requested at runtime.

The application demonstrates:

- Permission declaration in the Manifest
- Checking permissions using `ContextCompat.checkSelfPermission()`
- Requesting permissions using `ActivityCompat.requestPermissions()`

## Working

1. The application starts with `MainActivity`.
2. The main screen displays buttons for different operations.
3. When a button is clicked, the corresponding Intent is created.
4. Implicit intents are used to communicate with suitable applications installed on the device.
5. Explicit intent is used to open `LoginActivity`.
6. Android handles the requested action using the appropriate application or activity.



|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/f2e58971-cee3-4f64-ae1b-05476ea54e44" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/1a081541-fb4c-4c95-821e-d096438b2b99" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/eb9db595-acf9-4eaf-9564-3bd80a227463" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/c71f1265-4713-4df5-9e6a-30e73d57a580" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/47d3aef6-4695-43bf-92ab-f3030c3aa2d8" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/a3089e00-e6c6-4429-9c0e-a26525821288" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/ae1017e3-a896-4c00-9a6f-1e706d86c1df" />|<img width="300" height="700" alt="image" src="https://github.com/user-attachments/assets/3d18a0e4-4f64-4ec5-993e-bbabb4788e32" />|









## Conclusion

This practical demonstrates the use of **Implicit and Explicit Intents** in Android. It shows how an Android application can interact with other applications and activities to perform tasks such as making calls, opening websites, accessing the call log and gallery, setting alarms, opening the camera, and navigating between activities.
