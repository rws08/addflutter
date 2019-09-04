package sample.rws.com.addflutter.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import io.flutter.facade.FlutterFragment;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterView;

public class TestFlutterFragment extends FlutterFragment {
    private static final String CHANNEL = "add_flutter";
    private static final String TAG = "TestFlutterFragment";

    public static TestFlutterFragment newInstance() {
        TestFlutterFragment fragment = new TestFlutterFragment();
        return fragment;
    }

    public TestFlutterFragment(){
        final Bundle args = new Bundle();
        args.putString(FlutterFragment.ARG_ROUTE, "route1");
        setArguments(args);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        new MethodChannel((FlutterView) getView(), CHANNEL).setMethodCallHandler(new MethodChannel.MethodCallHandler() {
            @Override
            public void onMethodCall(MethodCall call, final MethodChannel.Result result) {
                if (call.method.equals("test")) {
                    if (call.arguments != null) {
                        Log.e(TAG, "Flutter -> Android Callback content:" + call.arguments.toString());
                    } else {
                        Log.e(TAG, "Flutter -> Android Callback parameter is empty!");
                    }
                    result.success("Android -> Flutter Return value after receiving callback:" + TAG);
//                    Toast.makeText(getActivity(), (call.arguments != null) ? "The contents of the callback are as follows:" + call.arguments.toString() : "Callback parameter is empty!", Toast.LENGTH_SHORT).show();
                } else {
                    result.notImplemented();
                }
            }
        });
    }
}
