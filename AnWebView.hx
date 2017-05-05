package;

#if (android && openfl)

import lime.system.JNI;



class AnWebView {
	
	public static function open(urlString:String,?shouldOpenInBrowserInstead:Bool=false){
		anwebview_open_jni(urlString,shouldOpenInBrowserInstead);
	}

	//private static var anwebview_sample_method_jni = JNI.createStaticMethod ("org.haxe.extension.AnWebView", "sampleMethod", "(I)I");
	private static var anwebview_open_jni = JNI.createStaticMethod ("org.haxe.extension.AnWebView", "openURL", "(Ljava/lang/String;Z)V",false);
	
}

#end