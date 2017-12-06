package com.pinger.splitshow;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.itheima.retrofitutils.ItheimaHttp;
import com.itheima.retrofitutils.listener.HttpResponseListener;
import com.pinger.library.FlowLayout;
import com.pinger.splitshow.model.Tip;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

import okhttp3.ResponseBody;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {



    private  FlowLayout fit,flowLayout;
    private Random random;
    private static Logger logger = Logger.getLogger(MainActivity.class.getName());
    private String han = "";
    private ProgressDialog waitingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flowLayout = (FlowLayout) findViewById(R.id.flow_layout);
        fit = (FlowLayout) findViewById(R.id.flow_fit);

        random = new Random();


        requestDate();
        //addTips();

        showMyDialog();



        /*// 循环添加TextView到容器
        for (int i = 0; i < stringSet.size(); i++) {
            final TextView view = (TextView) createview(mDatas[i]);

            // 设置点击事件
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(MainActivity.this, view.getText().toString(), Toast.LENGTH_SHORT).show();

                    fit.addView(createview(view.getText().toString()));
                    fit.requestLayout();
                }
            });
            flowLayout.addView(view);
        }*/

    }

    private void showMyDialog() {
        waitingDialog=
                new ProgressDialog(MainActivity.this);
        waitingDialog.setTitle("请求网络中");
        waitingDialog.setMessage("等待中...");
        waitingDialog.setIndeterminate(true);
        waitingDialog.setCancelable(false);
        waitingDialog.show();
    }

    private void addTips() {
        final TextView showView = (TextView) createview("拼贴文字");
        showView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(showView.getText().equals("拼贴文字")){
                    showView.setText(han);
                }else {
                    showView.setText("拼贴文字");
                }
            }
        });
        View refreshView = createview("刷新");
        refreshView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMyDialog();
                requestDate();
            }
        });
        View removeView = createview("清空");
        removeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fit.removeAllViews();
                addTips();
            }
        });
        fit.addView(showView);
        fit.addView(refreshView);
        fit.addView(removeView);
    }

    private void requestDate() {
        //Request request = ItheimaHttp.newGetRequest("mock/5a274be78ef919728f8c99ea/SplitShow");
        Call call = ItheimaHttp.getAsync("mock/5a274be78ef919728f8c99ea/SplitShow/tips", new HttpResponseListener<Tip>() {

            @Override
            public void onResponse(Tip tip) {
                logger.info(tip.getData().getInfo());
                flowLayout.removeAllViews();
                fit.removeAllViews();

                han = tip.getData().getInfo();
                Set<String> stringSet = new HashSet<>();
                for (int i = 0; i < han.length(); i++) {
                    stringSet.add( han.charAt(i)+"");
                }
                for (String s:stringSet
                        ) {
                    //logger.info(s);
                    final TextView view = (TextView) createview(s);

                    // 设置点击事件
                    view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //Toast.makeText(MainActivity.this, view.getText().toString(), Toast.LENGTH_SHORT).show();

                            final View view1 = createview(view.getText().toString());
                            view1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    fit.removeView(view1);
                                }
                            });
                            fit.addView(view1);
                            fit.requestLayout();
                        }
                    });
                    flowLayout.addView(view);
                }
                addTips();
                waitingDialog.hide();
            }

            @Override
            public Type getType() {
                return super.getType();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable e) {
                super.onFailure(call, e);
                setTitle("获取数据失败");
                try {
                    throw e;
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        });
    }

    private View createview(CharSequence text){
        final TextView view = new TextView(getApplication());
        view.setText(text);
        view.setTextColor(Color.WHITE);
        view.setPadding(5, 5, 5, 5);
        view.setGravity(Gravity.CENTER);
        view.setTextSize(14);

        // 设置彩色背景
        GradientDrawable normalDrawable = new GradientDrawable();
        normalDrawable.setShape(GradientDrawable.RECTANGLE);
        int a = 255;
        int r = 50 + random.nextInt(150);
        int g = 50 + random.nextInt(150);
        int b = 50 + random.nextInt(150);
        normalDrawable.setColor(Color.argb(a, r, g, b));

        // 设置按下的灰色背景
        GradientDrawable pressedDrawable = new GradientDrawable();
        pressedDrawable.setShape(GradientDrawable.RECTANGLE);
        pressedDrawable.setColor(Color.GRAY);

        // 背景选择器
        StateListDrawable stateDrawable = new StateListDrawable();
        stateDrawable.addState(new int[]{android.R.attr.state_pressed}, pressedDrawable);
        stateDrawable.addState(new int[]{}, normalDrawable);

        // 设置背景选择器到TextView上
        view.setBackground(stateDrawable);
        return view;
    }


}
