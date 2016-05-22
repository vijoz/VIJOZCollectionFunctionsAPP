package funcrtions.collection.vijozsoft.com.vijozappfunctions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class VIJOZ_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉系统自带标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_vijoz__main);
        //ButterKnife之前版本使用的是ButterKnife.inject();
        ButterKnife.bind(this);
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
    }

    @OnClick(R.id.bt_common)
    //ButterKnife之前版本的写法为void onActionClick(View view)
    void onButtonClick(View view) {
        ///  System.out.println("测试是否运行");
        startActivity(new Intent(this, CommonActivity.class));
        Toast.makeText(this, "打开另一个Activity成功——VIJOZ", Toast.LENGTH_SHORT).show();
    }
}
