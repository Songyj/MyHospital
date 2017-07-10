package com.example.songyanjun.myhospital.Fragement3;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.songyanjun.myhospital.Bottom_Toolbar;
import com.example.songyanjun.myhospital.R;

import java.util.ArrayList;

import static com.example.songyanjun.myhospital.R.drawable.star1;
import static com.example.songyanjun.myhospital.R.id.text_time;


/**
 * Created by songyanjun on 2017/7/5.
 */

public class Apply_Redbag extends AppCompatActivity implements DataCallBack{

    public static final String TAG = "SaveStateActivity";

    public String type1;
    public TextView time;
    private TextView title;
    private TextView de_type;

    private ArrayList<EditText> info = new ArrayList<EditText>();
    private Toolbar toolbar;
    private EditText person3;
    private EditText room;
    private EditText person2;
    private EditText person1;
    private boolean n=true;
    private int i;
    private Drawable drawable1;
    private Drawable[] drawable;
    private EditText editText;
    private TextView rb_type;
    private String type2;
    private Drawable[] drawable2;
    private EditText amount;
    private EditText person5;
    private EditText person4;
    private Button upload;
    private Button submit;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            Log.v(TAG, savedInstanceState.getString("data"));
        }
        setContentView(R.layout.apply_rb);

        toolbar = (Toolbar) findViewById(R.id.apply_fl_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Apply_Redbag.this, Bottom_Toolbar.class);
                intent.putExtra("id",2);
                startActivity(intent);
            }
        });




        de_type = (TextView)findViewById(R.id.text_department);
        rb_type = (TextView)findViewById(R.id.text_rb_type);

        init_drawable();
        setDe_type();
        setRb_type();

        de_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                de_type.setCompoundDrawables(null,null,drawable[2],null);
                Intent intent = new Intent(Apply_Redbag.this,Type.class);
                startActivityForResult(intent,1);
            }
        });



        rb_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb_type.setCompoundDrawables(null,null,drawable[2],null);
                Intent intent = new Intent(Apply_Redbag.this,Type1.class);
                startActivityForResult(intent,2);
            }
        });

        person1 = (EditText)findViewById(R.id.text_person1);
        person1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                person1.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        person2 = (EditText)findViewById(R.id.text_person2);
        person2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                person2.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        room = (EditText)findViewById(R.id.text_room);
        room.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                room.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        person3 = (EditText)findViewById(R.id.text_person3);
        person3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                person3.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amount = (EditText)findViewById(R.id.text_amount);
        amount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                amount.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        person4 = (EditText)findViewById(R.id.text_person4);
        person4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                person4.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        person5 = (EditText)findViewById(R.id.text_person5);
        person5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                person5.setCompoundDrawables(null,null,null,null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        time = (TextView)findViewById(text_time);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time.setCompoundDrawables(null,null,null,null);
                DatePickerFragment datePickerFragment = new DatePickerFragment();
                datePickerFragment.show(getSupportFragmentManager(),"data_picker");
            }
        });


        info.add(person1);
        info.add(person2);
        info.add(person3);
        info.add(room);
        info.add(amount);
        info.add(person4);
        info.add(person5);

        drawable1 = getDrawable(star1);
        Rect r = new Rect(0, 0, drawable1.getMinimumWidth()/2, drawable1.getMinimumHeight()/2);
        drawable1.setBounds(r);

        upload = (Button)findViewById(R.id.Btn_upload);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new PhotoPickerFragment().show(getSupportFragmentManager(), "photopicker");
            }
        });

        submit = (Button)findViewById(R.id.Btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check()== true ){
                    new Checkaccept_rg_Fragment().show(getSupportFragmentManager(), "doublecheck");

                    Log.d("result","true");

                }else{
                    Log.d("result","false");
                    new CheckrefuseFragment().show(getSupportFragmentManager(), "doublecheck");

                }
            }
        });

            }



    public void init_drawable (){
        drawable = de_type.getCompoundDrawables();
        drawable2 = rb_type.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        Rect r1 = new Rect(0, 0, drawable[2].getMinimumWidth()/5*2, drawable[2].getMinimumHeight()/5*2);
        Rect r2 = new Rect(0, 0, drawable2[2].getMinimumWidth()/5*2, drawable2[2].getMinimumHeight()/5*2);

        drawable[2].setBounds(r1);
        drawable2[2].setBounds(r2);

        de_type.setCompoundDrawables(null, null, drawable[2],null);
        rb_type.setCompoundDrawables(null, null, drawable2[2],null);
    }

    public void setDe_type(){
        Log.d("get","type1"+type1);
        Log.d("get","type2"+type2);
        if(type1 == null)
        {
            de_type.setText("请选择科室");
            de_type.setGravity(Gravity.RIGHT);
            de_type.setTextColor(getResources().getColor(R.color.lightgray));
        }else
        {
            de_type.setText(type1);
            de_type.setGravity(Gravity.LEFT);
            de_type.setTextColor(getResources().getColor(R.color.darkgray));
        }

    }
    public void setRb_type(){
        Log.d("get","type1"+type1);
        Log.d("get","type2"+type2);
        if(type2 == null)
        {
            rb_type.setText("请选择拒收红包类型");
            rb_type.setGravity(Gravity.RIGHT);
            rb_type.setTextColor(getResources().getColor(R.color.lightgray));
        }else
        {
            rb_type.setText(type2);
            rb_type.setGravity(Gravity.LEFT);
            rb_type.setTextColor(getResources().getColor(R.color.darkgray));
        }

    }

    @Override
    public void getData(String data) {
        if(data.length()!=0){time.setCompoundDrawables(null,null,null,null);time.setText(data);}

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK);{
                type1 = data.getStringExtra("de_type");
                Log.d("de_type","get"+ type1);
                setDe_type();
            }
            case 2:
                if(resultCode== RESULT_OK);{
                type2 = data.getStringExtra("rb_type");
                Log.d("rb_type","get"+ type2);
                setRb_type();
            }
            break;
        default:

        }
    }



    public boolean check(){
        n = true;

        for(i=0;i<info.size();i++){
            editText = info.get(i);
            if(editText.getText().toString().length()==0){n=false;editText.setCompoundDrawables(drawable1,null,null,null);}

        }
        if(de_type.getText().toString()=="请选择科室"){n=false;de_type.setCompoundDrawables(drawable1,null,drawable[2],null);}
        if(de_type.getText().toString()=="请选择拒收红包类型"){n=false;rb_type.setCompoundDrawables(drawable1,null,drawable[2],null);}

        if(time.getText().toString().length()==0){n=false;time.setCompoundDrawables(drawable1,null,null,null);}

        return n;
    }



}