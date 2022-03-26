 package com.example.date_picker;

 import android.app.DatePickerDialog;
 import android.app.Dialog;
 import android.os.Bundle;
 import android.widget.DatePicker;

 import androidx.annotation.NonNull;
 import androidx.annotation.Nullable;
 import androidx.fragment.app.DialogFragment;

 import java.util.Calendar;

 public class Date_picker extends DialogFragment {
     @NonNull
     @Override
     public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
         Calendar c = Calendar.getInstance();
         int year = c.get(Calendar.YEAR);
         int date = c.get(Calendar.DATE);
         int month = c.get(Calendar.MONTH);

         return new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener) getActivity(),year,month,date);

     }
 }
