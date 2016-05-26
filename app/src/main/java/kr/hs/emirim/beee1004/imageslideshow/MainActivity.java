package kr.hs.emirim.beee1004.imageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlip;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlip = (ViewFlipper)findViewById(R.id.view_flip);
        editText = (EditText)findViewById(R.id.edit_text);
        Button butStart = (Button)findViewById(R.id.but_start);
        Button butStop = (Button)findViewById(R.id.but_stop);
        butStart.setOnClickListener(this);
        butStop.setOnClickListener(this);

    }
     public void onClick(View view){
         int time = (int)Double.parseDouble(editText.getText().toString())*1000;
         switch(view.getId()) {
             case R.id.but_start:
                 viewFlip.setFlipInterval(time);
                 viewFlip.startFlipping();
                 break;
             case R.id.but_stop:
                 viewFlip.stopFlipping();
                 break;
         }
     }
}
