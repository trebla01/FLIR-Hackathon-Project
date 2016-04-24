package com.flir.flironeexampleapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;

import com.flir.flironeexampleapplication.R;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by Ryan on 4/23/2016.
 */
public class graphActivity extends com.flir.flironeexampleapplication.PreviewActivity{
    private com.github.mikephil.charting.charts.LineChart mainlayout;
    private LineChart mLineChart;
    PopupMenu popUp;
    ArrayList<Entry> entries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        //LineChart lineChart = (LineChart) findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(18f, 4));
        entries.add(new Entry(9f, 5));

        LineDataSet dataset = new LineDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        LineData data = new LineData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        dataset.setDrawCubic(true);
        dataset.setDrawFilled(true);

        //lineChart.setData(data);
        //lineChart.animateY(5000);
    }

    /*
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {;
        LineChart lineChart = (LineChart) findViewById(R.id.graph_view);

        View v = inflater.inflate(R.layout.graph, container, false);
        mLineChart = (LineChart) v.findViewById(R.id.graph_view);
        mainlayout.setBackgroundColor(Color.parseColor("#e3f2f6"));

        entries = new ArrayList<>();

        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(18f, 4));
        entries.add(new Entry(9f, 5));

        LineDataSet dataset = new LineDataSet(entries, "# of Calls");

        // creating labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        LineData data = new LineData(labels, dataset);
        lineChart.setData(data); // set the data and list of lables into chart

        lineChart.setDescription("Description");  // set the description

        return mLineChart;
    }*/

    public void setData(Chart data){
        //temperatureData;
    }
}