package jmg;

// John Gabriele, 2012. Distributed under the MIT license.
// See LICENSE.txt for details.

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import com.xeiam.xchart.BitmapEncoder;
import com.xeiam.xchart.Chart;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("Please pass exactly 4 args:\n\n" +
                               "    the plot title\n" +
                               "    x-axis name\n" +
                               "    y-axis name\n" +
                               "    input data filename\n\n" +
                               "Exiting.");
            System.exit(1);
        }
        String
            plot_title     = args[0],
            x_axis_name    = args[1],
            y_axis_name    = args[2],
            input_filename = args[3];
        
        if (! input_filename.endsWith(".txt")) {
            System.out.println("Please use an input filename ending with \".txt\".");
            System.out.println("Exiting.");
            System.exit(1);
        }
        
        String output_filename =
            input_filename.substring(0, input_filename.length() - 4) + "-plot.png";

        List<String> input_lines = Main.read_all_lines(input_filename);
        String data_series_name = input_lines.remove(0);
        data_series_name = data_series_name.trim();

        Collection<Number> x_data = new ArrayList<Number>();
        Collection<Number> y_data = new ArrayList<Number>();
        for (String s : input_lines) {
            String s2 = s.trim();
            String[] vals = s2.split(",\\s+");
            x_data.add(Double.parseDouble(vals[0]));
            y_data.add(Double.parseDouble(vals[1]));
        }

        Chart chart = new Chart(500, 400);
        chart.setTitle(plot_title);
        chart.setXAxisTitle(x_axis_name);
        chart.setYAxisTitle(y_axis_name);
        chart.addSeries(data_series_name, x_data, y_data);
        BitmapEncoder.savePNG(chart, output_filename);
    }


    public static List<String> read_all_lines(String filename) {
        BufferedReader br;
        List<String> all_lines = new ArrayList<String>();
        String line;
        try {
            br = new BufferedReader(new FileReader(filename));
            line = br.readLine();
            all_lines.add(line);
            while ((line = br.readLine()) != null) {
                all_lines.add(line);
            }
        }
        catch (IOException e) {
            System.out.println("Error: Unable to open file \"" + filename + "\".");
            System.out.println("Exiting.");
            System.exit(1);
        }
        return all_lines;
    }
}
