package com.example.hc.smartconvert;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;



public class LENGHT extends Fragment {
    private View x;
    private    EditText input;
    private   TextView Nano,Micro,Milli,Cen,Mete,Kilo,Digit,Foot,Yard,Mile,Nmile;
    private Spinner spin;
    private DecimalFormat decimal  = new DecimalFormat("#.##############");
    private double N,Mil,Mic,C,Met,K,D,F,Y,mile,nmile;
    private long number,number1,number2,number3;
    List<String> arrlist = new ArrayList<String>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            x = inflater.inflate(R.layout.lenght, null);
                 Thread calculator = new Thread(r);//Execute Thread
                 calculator.start();//Thread start
                 input = (EditText) x.findViewById(R.id.Input);
                 input.setGravity(Gravity.RIGHT);
                 Nano = (TextView) x.findViewById(R.id.Nano);
                 Milli = (TextView) x.findViewById(R.id.Milli);
                 Micro = (TextView) x.findViewById(R.id.Micro);
                 Cen = (TextView) x.findViewById(R.id.Centi);
                 Mete = (TextView) x.findViewById(R.id.Meter);
                 Kilo = (TextView) x.findViewById(R.id.Kilo);
                 Digit = (TextView) x.findViewById(R.id.Digit);
                 Foot = (TextView) x.findViewById(R.id.Foot);
                 Yard = (TextView) x.findViewById(R.id.Yard);
                 Mile = (TextView) x.findViewById(R.id.Mile);
                 Nmile = (TextView) x.findViewById(R.id.nmile);
                 spin = (Spinner) x.findViewById(R.id.Unit);
                 arrlist.add("Selected");
                 arrlist.add("Nano");
                 arrlist.add("Micro");
                 arrlist.add("Millemeter");
                 arrlist.add("Centimeter");
                 arrlist.add("Metres");
                 arrlist.add("Kilometer");
                 arrlist.add("Digit");
                 arrlist.add("Foot");
                 arrlist.add("Yard");
                 arrlist.add("Mile");
                 arrlist.add("nautical(M)");
                 ArrayAdapter<String> arrAd = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrlist);
                 spin.setAdapter(arrAd);
                 return x;
    }
    //Thread
    Runnable r = new Runnable() {
        @Override
        public void run() {
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 try{
                    String edit = input.getText().toString();
                     if(spin.getSelectedItem() == arrlist.get(0)){
                         Nano("0");
                         Mille("0");
                         Micro("0");
                         Centi("0");
                         Mete("0");
                         Kilo("0");
                         Foot("0");
                         Digit("0");
                         Yard("0");
                         Mile("0");
                         Nmile("0");
                     }
                    if (spin.getSelectedItem() == arrlist.get(1)) {
                        Nano(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(2)) {
                        Micro(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(3)) {
                        Mille(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(4)) {
                        Centi(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(5)) {
                        Mete(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(6)) {
                        Kilo(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(7)) {
                        Digit(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(8)) {
                        Foot(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(9)) {
                        Yard(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(10)) {
                        Mile(edit);
                    }
                    if (spin.getSelectedItem() == arrlist.get(11)) {
                        Nmile(edit);
                    }
                 }catch (Exception e){

                 }
                    TextWatcher watcher = new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                                    try {
                                        String edit = input.getText().toString();
                                        if (edit.isEmpty()){
                                            Nano("0");
                                            Mille("0");
                                            Micro("0");
                                            Centi("0");
                                            Mete("0");
                                            Kilo("0");
                                            Foot("0");
                                            Digit("0");
                                            Yard("0");
                                            Mile("0");
                                            Nmile("0");
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(1)) {
                                            Nano(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(2)) {
                                            Micro(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(3)) {
                                            Mille(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(4)) {
                                            Centi(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(5)) {
                                            Mete(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(6)) {
                                            Kilo(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(7)) {
                                            Digit(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(8)) {
                                            Foot(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(9)) {
                                            Yard(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(10)) {
                                            Mile(edit);
                                        }
                                        if (spin.getSelectedItem() == arrlist.get(11)) {
                                            Nmile(edit);
                                        }
                                    } catch (Exception e) {
                                    }
                        }
                    };
                    input.addTextChangedListener(watcher);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

    };

    public void Nano(String input){
        try {
            N = Double.parseDouble(input);
            Mic = Double.parseDouble(input)/ 1000;
            Mil = Double.parseDouble(input) / 1000000;
            C = Double.parseDouble(input) / 10000000;
            Met = Double.parseDouble(input) / 1000000000;
            K = Double.parseDouble(input) * 0.000000000001;
            D = Double.parseDouble(input) / 25400000;
            F = Double.parseDouble(input) / 304800000;
            Y = Double.parseDouble(input) / 914400000;
            mile = Double.parseDouble(input) * 0.00000000000062;
            nmile = Double.parseDouble(input) * 0.00000000000054;
            Nano.setText(String.valueOf(decimal.format(N)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
        }
    public void Micro(String input){
        try {
            N = Double.parseDouble(input) * 1000;
            Mic = Double.parseDouble(input) ;
            Mil = Double.parseDouble(input) / 1000;
            C = Double.parseDouble(input) / 10000;
            Met = Double.parseDouble(input) / 1000000;
            K = Double.parseDouble(input) / 1000000000;
            D = Double.parseDouble(input) / 25400;
            F = Double.parseDouble(input) / 304800;
            Y = Double.parseDouble(input) / 914400;
            mile = Double.parseDouble(input) /1609344000;
            nmile = Double.parseDouble(input) /1852000000;
            Nano.setText(String.valueOf(decimal.format(N)));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Mille(String input){
        try {
            N = Double.parseDouble(input) * 1000000;
            Mic = Double.parseDouble(input) * 1000;
            Mil = Double.parseDouble(input) ;
            C = Double.parseDouble(input) / 10;
            Met = Double.parseDouble(input)/ 1000;
            K = Double.parseDouble(input) / 1000000;
            D = Double.parseDouble(input) / 25.4;
            F = Double.parseDouble(input) / 304.8;
            Y = Double.parseDouble(input) / 914.4;
            mile = Double.parseDouble(input)/1609344;
            nmile = Double.parseDouble(input) /1852000;
            Nano.setText(String.valueOf(decimal.format(N)));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Centi(String input){
        try {
            N = Double.parseDouble(input) * 10000000;
            Mic = Double.parseDouble(input) * 10000;
            Mil = Double.parseDouble(input) *10;
            C = Double.parseDouble(input) ;
            Met = Double.parseDouble(input) / 100;
            K = Double.parseDouble(input) / 100000;
            D = Double.parseDouble(input) / 2.54;
            F = Double.parseDouble(input) / 30.48;
            Y =Double.parseDouble(input) / 91.44;
            mile = Double.parseDouble(input) /160934.4;
            nmile = Double.parseDouble(input) /185200;
            Nano.setText(String.valueOf(decimal.format(N)));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Mete(String input){
        try {
            N = Double.parseDouble(input) * 1000000000;
            Mic =Double.parseDouble(input) * 1000000;
            Mil = Double.parseDouble(input) *1000;
            C = Double.parseDouble(input) * 100 ;
            Met =Double.parseDouble(input) ;
            K = Double.parseDouble(input) / 1000;
            D = Double.parseDouble(input) / 0.0254;
            F = Double.parseDouble(input) / 0.3048;
            Y = Double.parseDouble(input) / 0.9144;
            mile = Double.parseDouble(input) /1609.344;
            nmile = Double.parseDouble(input) /1852;
            Nano.setText(String.valueOf(N));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Kilo(String input){
        try {
            number = (long)(Double.parseDouble(input) * 1000000000000L);
            Mic = Double.parseDouble(input) * 1000000000;
            Mil = Double.parseDouble(input) * 1000000;
            C = Double.parseDouble(input) * 100000 ;
            Met = Double.parseDouble(input) * 1000 ;
            K = Double.parseDouble(input) ;
            D = Double.parseDouble(input) * 39370.08;
            F = Double.parseDouble(input) * 3280.84;
            Y = Double.parseDouble(input) / 0.000914 ;
            mile = Double.parseDouble(input) /1.609344;
            nmile =Double.parseDouble(input) /1.852;
            Nano.setText(String.valueOf(number));
            Micro.setText(String.valueOf(Mic));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Foot(String input){
        try {
            N = Double.parseDouble(input) * 304800000;
            Mic = Double.parseDouble(input) * 304800;
            Mil = Double.parseDouble(input) * 304.8;
            C = Double.parseDouble(input) * 30.48;
            Met = Double.parseDouble(input) * 0.3048 ;
            K = Double.parseDouble(input) * 0.0003048;
            D = Double.parseDouble(input) * 12;
            F = Double.parseDouble(input);
            Y = Double.parseDouble(input) / 3 ;
            mile = Double.parseDouble(input) /5280;
            nmile =Double.parseDouble(input) /6076.115;
            Nano.setText(String.valueOf(N));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Digit(String input){
        try {
            N = Double.parseDouble(input) * 25400000;
            Mic = Double.parseDouble(input) * 25400;
            Mil = Double.parseDouble(input) * 25.4;
            C = Double.parseDouble(input) * 2.54;
            Met = Double.parseDouble(input) * 0.0254 ;
            K = Double.parseDouble(input) * 0.0000254;
            D = Double.parseDouble(input) ;
            F = Double.parseDouble(input)/ 12;
            Y = Double.parseDouble(input) / 36 ;
            mile = Double.parseDouble(input) /63360;
            nmile =Double.parseDouble(input) / 72913.39;
            Nano.setText(String.valueOf(N));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Yard(String input){
        try {
            N = Double.parseDouble(input) * 914400000;
            Mic = Double.parseDouble(input) * 914400;
            Mil = Double.parseDouble(input) * 914.4;
            C = Double.parseDouble(input) * 91.44;
            Met = Double.parseDouble(input) * 0.9144 ;
            K = Double.parseDouble(input) * 0.0009144;
            D = Double.parseDouble(input) * 36 ;
            F = Double.parseDouble(input) * 3;
            Y = Double.parseDouble(input)  ;
            mile = Double.parseDouble(input) /1760;
            nmile =Double.parseDouble(input) / 2025.372;
            Nano.setText(String.valueOf(N));
            Micro.setText(String.valueOf(decimal.format(Mic)));
            Milli.setText(String.valueOf(decimal.format(Mil)));
            Cen.setText(String.valueOf(decimal.format(C)));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Mile(String input){
        try {
            number =(long) (Double.parseDouble(input) * 1609344000000L);
            number1 = (long) (Double.parseDouble(input) * 1609344000L);
            number2 = (long)(Double.parseDouble(input) * 1609344L);
            number3 = (long)(Double.parseDouble(input) * 160934.4);
            Met = Double.parseDouble(input) * 1609.344 ;
            K = Double.parseDouble(input) * 1.609344;
            D = Double.parseDouble(input) * 63360 ;
            F = Double.parseDouble(input) * 5280;
            Y = Double.parseDouble(input) * 1760 ;
            mile = Double.parseDouble(input) ;
            nmile =Double.parseDouble(input) / 1.150779;
            Nano.setText(String.valueOf(number));
            Micro.setText(String.valueOf(number1));
            Milli.setText(String.valueOf(number2));
            Cen.setText(String.valueOf(number3));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
    public void Nmile(String input){
        try {
            number = (long)(Double.parseDouble(input) * 1852000000000L);
            number1 = (long) (Double.parseDouble(input) * 1852000000L);
            number2 = (long) (Double.parseDouble(input) * 1852000L);
            number3 = (long) (Double.parseDouble(input) * 185200L);
            Met = Double.parseDouble(input) * 1852 ;
            K = Double.parseDouble(input) * 1.852;
            D = Double.parseDouble(input) * 72913.39 ;
            F = Double.parseDouble(input) * 6076.115;
            Y = Double.parseDouble(input) * 2025.372 ;
            mile = Double.parseDouble(input) /0.868976;
            nmile =Double.parseDouble(input) ;
            Nano.setText(String.valueOf(number));
            Micro.setText(String.valueOf(number1));
            Milli.setText(String.valueOf(number2));
            Cen.setText(String.valueOf(number3));
            Mete.setText(String.valueOf(decimal.format(Met)));
            Kilo.setText(String.valueOf(decimal.format(K)));
            Foot.setText(String.valueOf(decimal.format(F)));
            Digit.setText(String.valueOf(decimal.format(D)));
            Yard.setText(String.valueOf(decimal.format(Y)));
            Mile.setText(String.valueOf(decimal.format(mile)));
            Nmile.setText(String.valueOf(decimal.format(nmile)));
        }catch (Exception e){

        }
    }
}



