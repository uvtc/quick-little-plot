# Quick Little Plot

A tiny little program for making a plot of some data you've put into a
text file.


## Prerequisites

Requires that you have Java installed.

Requires that you download the [xchart](http://xeiam.com/xchart.jsp)
jar and put it into your ~/jars directory.



## Install

After you've grabbed and moved that xchart jar into your ~/jars
directory (mentioned above):

 1. Download the quick-little-plot jar from the Downloads page and
    move it to your ~/bin directory.

 2. Save [the quick-little-plot.sh
    file](https://raw.github.com/uvtc/quick-little-plot/master/quick-little-plot.sh)
    to your ~/bin directory and make sure it's executable (`chmod +x
    quick-little-plot.sh`).


## Usage

Put your data into a text file named whatever you like (say,
"some-data.txt"). One `x, y` data point per line, but the first line
must be the name of the data set:

```
frob
1.1, 2.4
1.2, 2.7
1.3, 3.1
```

then:

```bash
quick-little-plot.sh "Plot Name" \
                     "x-axis name (units)" \
                     "y-axis name (units)" \
                     some-data.txt
```

That should produce a some-data-plot.png file for you.



## Example output

See the first example shown at <http://xeiam.com/xchart_examplecode.jsp>.



## Author

Distributed under the MIT license (see LICENSE.txt file).

John Gabriele, 2012