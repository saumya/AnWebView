AnWebView
===========================

 - OpenFL Native Extension for **Android**
 - Opens an URL in native Webview or Browser, depening upon your choice
 - Done with **Lime 4.1.0** and **OpenFL 5.0.0**

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