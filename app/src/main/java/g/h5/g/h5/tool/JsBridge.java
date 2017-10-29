package g.h5.g.h5.tool;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/10/29.
 */

public class JsBridge {

    Context mApplicatiosnContext;
    public JsBridge(Context context){
        mApplicatiosnContext = context;
    }

    @JavascriptInterface
    public String toast(String str) {
        Toast.makeText(mApplicatiosnContext, "传入的参数是" + str, Toast.LENGTH_SHORT).show();
        return "我是android信息";
    }
}
