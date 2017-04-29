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

public class WEIGHT extends Fragment {
    private View x;
    private EditText input;
    private TextView Carat,milligram,Centigram,Decigram,Gram,Decagram,Hectogram,Kilogram,metricton,ounce,Pound,stone,tonsus,tonsuk;
    private Spinner spin;
    private DecimalFormat decimal  = new DecimalFormat("#.##############");
    private double c,milli,cen,deci,g,deca,hecto,kilo,metric,O,p,s,tus,tuk;
    private long number,number1,number2,number3;
    List<String> arrlist = new ArrayList<String>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        x = inflater.inflate(R.layout.weight, null);
        Thread run = new Thread(r);
        run.start();
        input = (EditText) x.findViewById(R.id.Input);
        input.setGravity(Gravity.RIGHT);
        Carat = (TextView) x.findViewById(R.id.Carat);
        milligram = (TextView) x.findViewById(R.id.Milligram);
        Centigram = (TextView) x.findViewById(R.id.Centigram);
        Decigram = (TextView) x.findViewById(R.id.Decigram);
        Gram = (TextView) x.findViewById(R.id.Gram);
        Decagram = (TextView) x.findViewById(R.id.Decagram);
        Hectogram = (TextView) x.findViewById(R.id.Hectogram);
        Kilogram = (TextView) x.findViewById(R.id.Kilogram);
        metricton = (TextView) x.findViewById(R.id.Metricton);
        ounce = (TextView) x.findViewById(R.id.Ounce);
        Pound = (TextView) x.findViewById(R.id.Pound);
        stone = (TextView) x.findViewById(R.id.Stone);
        tonsus = (TextView) x.findViewById(R.id.TonsUS);
        tonsuk = (TextView) x.findViewById(R.id.TonsUK);
        spin = (Spinner) x.findViewById(R.id.Unit);
        arrlist.add("Selected");
        arrlist.add("Carat");
        arrlist.add("Milligram");
        arrlist.add("Centigram");
        arrlist.add("Decigram");
        arrlist.add("Gram");
        arrlist.add("Decagram");
        arrlist.add("Hectogram");
        arrlist.add("Kilogram");
        arrlist.add("Metricton");
        arrlist.add("Ounce");
        arrlist.add("Pound");
        arrlist.add("Stone");
        arrlist.add("Tons(US)");
        arrlist.add("Tons(UK)");
        ArrayAdapter<String> arrAd = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, arrlist);
        spin.setAdapter(arrAd);
        return x;
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    try {
                        String edit = input.getText().toString();
                        if (edit.isEmpty()){
                            Carat("0");
                            milligram("0");
                            centigram("0");
                            decigram("0");
                            gram("0");
                            decagram("0");
                            hectogram("0");
                            kilogram("0");
                            metricton("0");
                            ounce("0");
                            pound("0");
                            stone("0");
                            tonsus("0");
                            tonsuk("0");
                        }
                        if (spin.getSelectedItem() == arrlist.get(1)) {
                            Carat(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(2)) {
                            milligram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(3)) {
                            centigram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(4)) {
                            decigram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(5)) {
                            gram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(6)) {
                            decagram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(7)) {
                            hectogram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(8)) {
                            kilogram(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(9)) {
                            metricton(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(10)) {
                            ounce(edit);
                        }
                        if (spin.getSelectedItem() == arrlist.get(11)) {
                            pound(edit);
                        }
                        if(spin.getSelectedItem() == arrlist.get(12)){
                            stone(edit);
                        }
                        if(spin.getSelectedItem() == arrlist.get(13)){
                            tonsus(edit);
                        }
                        if(spin.getSelectedItem() == arrlist.get(14)){
                            tonsuk(edit);
                        }
                    } catch (Exception e) {
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
                                    Carat("0");
                                    milligram("0");
                                    centigram("0");
                                    decigram("0");
                                    gram("0");
                                    decagram("0");
                                    hectogram("0");
                                    kilogram("0");
                                    metricton("0");
                                    ounce("0");
                                    pound("0");
                                    stone("0");
                                    tonsus("0");
                                    tonsuk("0");
                                }
                                if (spin.getSelectedItem() == arrlist.get(1)) {
                                    Carat(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(2)) {
                                   milligram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(3)) {
                                    centigram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(4)) {
                                    decigram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(5)) {
                                   gram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(6)) {
                                   decagram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(7)) {
                                    hectogram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(8)) {
                                    kilogram(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(9)) {
                                    metricton(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(10)) {
                                    ounce(edit);
                                }
                                if (spin.getSelectedItem() == arrlist.get(11)) {
                                    pound(edit);
                                }
                                if(spin.getSelectedItem() == arrlist.get(12)){
                                    stone(edit);
                                }
                                if(spin.getSelectedItem() == arrlist.get(13)){
                                     tonsus(edit);
                                }
                                if(spin.getSelectedItem() == arrlist.get(14)){
                                    tonsuk(edit);
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
   public void Carat(String input){
       try{
           c = Double.parseDouble(input);
           milli = Double.parseDouble(input)* 200;
           cen = Double.parseDouble(input) * 20;
           deci = Double.parseDouble(input) * 2;
           g = Double.parseDouble(input) / 5  ;
           deca = Double.parseDouble(input) /50;
           hecto = Double.parseDouble(input)/500;
           kilo = Double.parseDouble(input)/5000;
           metric = Double.parseDouble(input)/5000000;
           O = Double.parseDouble(input)/141.7476;
           p = Double.parseDouble(input)/ 2267.962;
           s = Double.parseDouble(input)/ 31751.47;
           tus =Double.parseDouble(input)/4535924;
           tuk = Double.parseDouble(input)/5080235;
           Carat.setText(String.valueOf(decimal.format(c)));
           milligram.setText(String.valueOf(decimal.format(milli)));
           Centigram.setText(String.valueOf(decimal.format(cen)));
           Decigram.setText(String.valueOf(decimal.format(deci)));
           Gram.setText(String.valueOf(decimal.format(g)));
           Decagram.setText(String.valueOf(decimal.format(deca)));
           Hectogram.setText(String.valueOf(decimal.format(hecto)));
           Kilogram.setText(String.valueOf(decimal.format(kilo)));
           metricton.setText(String.valueOf(decimal.format(metric)));
           ounce.setText(String.valueOf(decimal.format(O)));
           Pound.setText(String.valueOf(decimal.format(p)));
           stone.setText(String.valueOf(decimal.format(s)));
           tonsus.setText(String.valueOf(decimal.format(tus)));
           tonsuk.setText(String.valueOf(decimal.format(tuk)));
       }catch (Exception e){}
   }
    public void milligram(String input){
        try{
            c = Double.parseDouble(input)/ 200;
            milli = Double.parseDouble(input);
            cen = Double.parseDouble(input) / 10;
            deci = Double.parseDouble(input) / 100;
            g = Double.parseDouble(input) / 1000  ;
            deca = Double.parseDouble(input) /10000;
            hecto = Double.parseDouble(input)/100000;
            kilo = Double.parseDouble(input)/1000000;
            metric = Double.parseDouble(input)/1000000000;
            O = Double.parseDouble(input)/28349.52;
            p = Double.parseDouble(input)/ 453592.4;
            s = Double.parseDouble(input)/6350293;
            tus =Double.parseDouble(input)/907184740;
            tuk = Double.parseDouble(input)/1016046909;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void centigram(String input){
        try{
            c = Double.parseDouble(input)/ 20;
            milli = Double.parseDouble(input)*10;
            cen = Double.parseDouble(input)  ;
            deci = Double.parseDouble(input) / 10;
            g = Double.parseDouble(input) / 100  ;
            deca = Double.parseDouble(input) /1000;
            hecto = Double.parseDouble(input)/10000;
            kilo = Double.parseDouble(input)/100000;
            metric = Double.parseDouble(input)/100000000;
            O = Double.parseDouble(input)/2834.952;
            p = Double.parseDouble(input)/ 45359.24;
            s = Double.parseDouble(input)/635029.3;
            tus =Double.parseDouble(input)/90718474;
            tuk = Double.parseDouble(input)/101604690.9;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void decigram(String input){
        try{
            c = Double.parseDouble(input)/ 2;
            milli = Double.parseDouble(input)*100;
            cen = Double.parseDouble(input) *10 ;
            deci = Double.parseDouble(input);
            g = Double.parseDouble(input) / 10  ;
            deca = Double.parseDouble(input) /100;
            hecto = Double.parseDouble(input)/1000;
            kilo = Double.parseDouble(input)/10000;
            metric = Double.parseDouble(input)/10000000;
            O = Double.parseDouble(input)/283.4952;
            p = Double.parseDouble(input)/ 4535.924;
            s = Double.parseDouble(input)/63502.93;
            tus =Double.parseDouble(input)/9071847.40;
            tuk = Double.parseDouble(input)/10160469.09;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void gram(String input){
        try{
            c = Double.parseDouble(input)*5;
            milli = Double.parseDouble(input)*1000;
            cen = Double.parseDouble(input) *100 ;
            deci = Double.parseDouble(input)*10;
            g = Double.parseDouble(input);
            deca = Double.parseDouble(input) /10;
            hecto = Double.parseDouble(input)/100;
            kilo = Double.parseDouble(input)/1000;
            metric = Double.parseDouble(input)/1000000;
            O = Double.parseDouble(input)/28.34952;
            p = Double.parseDouble(input)/453.5924;
            s = Double.parseDouble(input)/6350.293;
            tus =Double.parseDouble(input)/907184.740;
            tuk = Double.parseDouble(input)/1016046.909;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void decagram(String input){
        try{
        c = Double.parseDouble(input)*50;
        milli = Double.parseDouble(input)*10000;
        cen = Double.parseDouble(input) *1000 ;
        deci = Double.parseDouble(input)*100;
        g = Double.parseDouble(input) * 10  ;
        deca = Double.parseDouble(input);
        hecto = Double.parseDouble(input)/10;
        kilo = Double.parseDouble(input)/100;
        metric = Double.parseDouble(input)/100000;
        O = Double.parseDouble(input)/2.834952;
        p = Double.parseDouble(input)/ 45.35924;
        s = Double.parseDouble(input)/635.0293;
        tus =Double.parseDouble(input)/90718.4740;
        tuk = Double.parseDouble(input)/101604.6909;
        Carat.setText(String.valueOf(decimal.format(c)));
        milligram.setText(String.valueOf(decimal.format(milli)));
        Centigram.setText(String.valueOf(decimal.format(cen)));
        Decigram.setText(String.valueOf(decimal.format(deci)));
        Gram.setText(String.valueOf(decimal.format(g)));
        Decagram.setText(String.valueOf(decimal.format(deca)));
        Hectogram.setText(String.valueOf(decimal.format(hecto)));
        Kilogram.setText(String.valueOf(decimal.format(kilo)));
        metricton.setText(String.valueOf(decimal.format(metric)));
        ounce.setText(String.valueOf(decimal.format(O)));
        Pound.setText(String.valueOf(decimal.format(p)));
        stone.setText(String.valueOf(decimal.format(s)));
        tonsus.setText(String.valueOf(decimal.format(tus)));
        tonsuk.setText(String.valueOf(decimal.format(tuk)));
    }catch (Exception e){}
    }
    public void hectogram(String input){
        try{
            c = Double.parseDouble(input)*500;
            milli = Double.parseDouble(input)*100000;
            cen = Double.parseDouble(input) *10000 ;
            deci = Double.parseDouble(input)*1000;
            g = Double.parseDouble(input) *100  ;
            deca = Double.parseDouble(input)*10;
            hecto = Double.parseDouble(input);
            kilo = Double.parseDouble(input)/10;
            metric = Double.parseDouble(input)/10000;
            O = Double.parseDouble(input)/0.2834952;
            p = Double.parseDouble(input)/ 4.535924;
            s = Double.parseDouble(input)/63.50293;
            tus =Double.parseDouble(input)/9071.84740;
            tuk = Double.parseDouble(input)/10160.46909;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void kilogram(String input){
        try{
            c = Double.parseDouble(input)*5000;
            milli = Double.parseDouble(input)*1000000;
            cen = Double.parseDouble(input) *100000 ;
            deci = Double.parseDouble(input)*10000;
            g = Double.parseDouble(input) *1000  ;
            deca = Double.parseDouble(input)*100;
            hecto = Double.parseDouble(input)*10;
            kilo = Double.parseDouble(input);
            metric = Double.parseDouble(input)/1000;
            O = Double.parseDouble(input)/0.02834952;
            p = Double.parseDouble(input)/ 0.4535924;
            s = Double.parseDouble(input)/6.350293;
            tus =Double.parseDouble(input)/907.18474;
            tuk = Double.parseDouble(input)/1016.046909;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void metricton(String input){
        try{
            c = Double.parseDouble(input)*5000000;
            milli = Double.parseDouble(input)*1000000000;
            cen = Double.parseDouble(input) *100000000 ;
            deci = Double.parseDouble(input)*10000000;
            g = Double.parseDouble(input) *1000000 ;
            deca = Double.parseDouble(input)*100000;
            hecto = Double.parseDouble(input)*10000;
            kilo = Double.parseDouble(input)*1000;
            metric = Double.parseDouble(input);
            O = Double.parseDouble(input)/0.00002834952;
            p = Double.parseDouble(input)/ 0.0004535924;
            s = Double.parseDouble(input)/0.006350293;
            tus =Double.parseDouble(input)/0.90718474;
            tuk = Double.parseDouble(input)/1.016046909;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(milli));
            Centigram.setText(String.valueOf(cen));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void ounce(String input){
        try{
            c = Double.parseDouble(input)*141.7476;
            milli = Double.parseDouble(input)*28349.52;
            cen = Double.parseDouble(input) *2834.952 ;
            deci = Double.parseDouble(input)*283.4952;
            g = Double.parseDouble(input) *28.34952 ;
            deca = Double.parseDouble(input)*2.834952;
            hecto = Double.parseDouble(input)*0.2834952;
            kilo = Double.parseDouble(input)*0.02834952;
            metric = Double.parseDouble(input)*0.00002834952;
            O = Double.parseDouble(input);
            p = Double.parseDouble(input)/ 16;
            s = Double.parseDouble(input)/224;
            tus =Double.parseDouble(input)/32000;
            tuk = Double.parseDouble(input)/35840;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void pound(String input){
        try{
            c = Double.parseDouble(input)*2267.962;
            milli = Double.parseDouble(input)*453592.4;
            cen = Double.parseDouble(input) *45359.24 ;
            deci = Double.parseDouble(input)*4535.924;
            g = Double.parseDouble(input) *453.5924 ;
            deca = Double.parseDouble(input)*45.35924;
            hecto = Double.parseDouble(input)*4.535924;
            kilo = Double.parseDouble(input)*0.4535924;
            metric = Double.parseDouble(input)*0.0004535924;
            O = Double.parseDouble(input)*16;
            p = Double.parseDouble(input);
            s = Double.parseDouble(input)/14;
            tus =Double.parseDouble(input)/2000;
            tuk = Double.parseDouble(input)/2240;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void stone(String input){
        try{
            c = Double.parseDouble(input)*31751.47;
            milli = Double.parseDouble(input)*6350293;
            cen = Double.parseDouble(input) *635029.3 ;
            deci = Double.parseDouble(input)*63502.93;
            g = Double.parseDouble(input) *6350.293 ;
            deca = Double.parseDouble(input)*635.0293;
            hecto = Double.parseDouble(input)*63.50293;
            kilo = Double.parseDouble(input)*6.350293;
            metric = Double.parseDouble(input)*0.006350293;
            O = Double.parseDouble(input)*224;
            p = Double.parseDouble(input)*14;
            s = Double.parseDouble(input);
            tus =Double.parseDouble(input)/142.8571;
            tuk = Double.parseDouble(input)/160;
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(decimal.format(milli)));
            Centigram.setText(String.valueOf(decimal.format(cen)));
            Decigram.setText(String.valueOf(decimal.format(deci)));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
    public void tonsus(String input){
        try{
        c = Double.parseDouble(input)*4535924;
        milli = Double.parseDouble(input)*907184740;
        cen = Double.parseDouble(input) *90718474 ;
        deci = Double.parseDouble(input)*9071847.4;
        g = Double.parseDouble(input) *907184.74 ;
        deca = Double.parseDouble(input)*90718.474;
        hecto = Double.parseDouble(input)*9071.8474;
        kilo = Double.parseDouble(input)*907.18474;
        metric = Double.parseDouble(input)*0.90718474;
        O = Double.parseDouble(input)*32000;
        p = Double.parseDouble(input)*2000;
        s = Double.parseDouble(input)*142.8571;
        tus =Double.parseDouble(input);
        tuk = Double.parseDouble(input)/1.12;
        Carat.setText(String.valueOf(decimal.format(c)));
        milligram.setText(String.valueOf(milli));
        Centigram.setText(String.valueOf(cen));
        Decigram.setText(String.valueOf(decimal.format(deci)));
        Gram.setText(String.valueOf(decimal.format(g)));
        Decagram.setText(String.valueOf(decimal.format(deca)));
        Hectogram.setText(String.valueOf(decimal.format(hecto)));
        Kilogram.setText(String.valueOf(decimal.format(kilo)));
        metricton.setText(String.valueOf(decimal.format(metric)));
        ounce.setText(String.valueOf(decimal.format(O)));
        Pound.setText(String.valueOf(decimal.format(p)));
        stone.setText(String.valueOf(decimal.format(s)));
        tonsus.setText(String.valueOf(decimal.format(tus)));
        tonsuk.setText(String.valueOf(decimal.format(tuk)));
    }catch (Exception e){}
    }
    public void tonsuk(String input){
        try{
            c = Double.parseDouble(input)*5080235;
            milli = Double.parseDouble(input)*1016046909;
            cen = Double.parseDouble(input) *101604690.9 ;
            deci = Double.parseDouble(input)*10160469.09;
            g = Double.parseDouble(input) *1016046.909 ;
            deca = Double.parseDouble(input)*101604.6909;
            hecto = Double.parseDouble(input)*10160.46909;
            kilo = Double.parseDouble(input)*1016.046909;
            metric = Double.parseDouble(input)*1.016046909;
            O = Double.parseDouble(input)*35840;
            p = Double.parseDouble(input)*2240;
            s = Double.parseDouble(input)*160;
            tus =Double.parseDouble(input)*1.12;
            tuk = Double.parseDouble(input);
            Carat.setText(String.valueOf(decimal.format(c)));
            milligram.setText(String.valueOf(milli));
            Centigram.setText(String.valueOf(cen));
            Decigram.setText(String.valueOf(deci));
            Gram.setText(String.valueOf(decimal.format(g)));
            Decagram.setText(String.valueOf(decimal.format(deca)));
            Hectogram.setText(String.valueOf(decimal.format(hecto)));
            Kilogram.setText(String.valueOf(decimal.format(kilo)));
            metricton.setText(String.valueOf(decimal.format(metric)));
            ounce.setText(String.valueOf(decimal.format(O)));
            Pound.setText(String.valueOf(decimal.format(p)));
            stone.setText(String.valueOf(decimal.format(s)));
            tonsus.setText(String.valueOf(decimal.format(tus)));
            tonsuk.setText(String.valueOf(decimal.format(tuk)));
        }catch (Exception e){}
    }
}
