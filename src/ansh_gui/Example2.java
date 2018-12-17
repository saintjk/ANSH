/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChartBuilder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;

/**
 *
 * @author ninslab
 */

    public class Example2 {
  public static void main(String[] args) throws Exception {
 
    double[] xData = new double[] { 0.0, 1.0, 2.0 };
    double[] yData = new double[] { 2.0, 1.0, 0.0 };
 
    // Create Chart
      org.knowm.xchart.XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);
 
    // Show it
    new SwingWrapper(chart).displayChart();
 
  }
}

