package com.example.songyanjun.myhospital.Fragement3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.songyanjun.myhospital.R;

public class PhotoPickerFragment extends DialogFragment {
    public final static int REQUEST_IMAGE_SELECT = 2;
    private Button cam;

    private Button alb;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.photopicker, container,false);
        cam = (Button) view.findViewById(R.id.Btn_camera);
        alb = (Button) view.findViewById(R.id.Btn_album);



        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        alb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_IMAGE_SELECT);
                dismiss();

            }
        });
//        init_drawable ();
        return view;
    }
        /*@Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (resultCode == RESULT_OK && requestCode == REQUEST_IMAGE_SELECT) {
                Log.i("qqliLog", "GalleryUri:    " + data.getData());
            }
        }*/

}
