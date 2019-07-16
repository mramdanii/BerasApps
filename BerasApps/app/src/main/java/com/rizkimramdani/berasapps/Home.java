package com.rizkimramdani.berasapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.APIlib;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        AnyChartView anyChartView = findViewById(R.id.any_chart_view_grafik);
//        APIlib.getInstance().setActiveAnyChartView(anyChartView);
//
//        Pie pie = AnyChart.pie();
//
//        List<DataEntry> data = new ArrayList<>();
//        data.add(new ValueDataEntry("Apples", 6371664));
//        data.add(new ValueDataEntry("Pears", 789622));
//        data.add(new ValueDataEntry("Bananas", 7216301));
//        data.add(new ValueDataEntry("Grapes", 1486621));
//        data.add(new ValueDataEntry("Oranges", 1200000));
//
//        pie.data(data);
//
//        pie.title("Fruits imported in 2015 (in kg)");
//
//        anyChartView.setChart(pie);

    }
}
