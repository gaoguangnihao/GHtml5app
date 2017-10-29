package g.h5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

import g.h5.g.h5.tool.JsBridge;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        JsBridge jb = new JsBridge(getApplicationContext());

        WebView mWeb = (WebView)findViewById(R.id.main_web);
        mWeb.getSettings().setJavaScriptEnabled(true);
        mWeb.addJavascriptInterface(jb, "android");

        mWeb.loadUrl("file:///android_asset/web/index.html");
//        mWeb.loadUrl("http://www.baidu.com");
    }
}
