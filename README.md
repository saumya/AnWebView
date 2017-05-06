AnWebView
===========================

 - OpenFL Native Extension for **Android**
 - Opens an URL in native WebView or Browser, depending upon your choice
 - Done with **Lime 4.1.0** and **OpenFL 5.0.0**

Here is the [same extension from OpenFL][1] itself.

### Usage

 - Open in a WebView 
  ```
  AnWebView.open("http://www.openfl.org/");
  ```
 - Open in a Browser
  ```
  AnWebView.open("http://www.openfl.org/",true);
  ```

### Notes on NativeExtensions

 - create
 ```
 lime create extension AnWebView
 ```
 - rebuild - before use
 ```
 lime rebuild AnWebView android
 ```
 - From inside the project folder, rebuild before use
 ```
 lime rebuild . android
 ```

### Other extensions
 - [AnCam][4]
 - [RayToast][5]
 - [AnWebView][6]
 - [AnAppLaunch][7]








[1]: https://github.com/openfl/extension-webview

[4]: https://github.com/saumya/AnCam
[5]: https://github.com/saumya/RayToast
[6]: https://github.com/saumya/AnWebView
[7]: https://github.com/saumya/AnAppLaunch
