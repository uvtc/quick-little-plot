# Quick Little Plot

A tiny little program for making a plot of some data you've put into a
text file.

Only tested to run on Xubuntu (Debian-based) GNU/Linux with OpenJDK 7.



## Prerequisites

Requires that you have Java installed.

Requires that you download the [xchart](http://xeiam.com/xchart.jsp)
v1.2.0 jar and drop it into your ~/jars directory.



## Install

After you've grabbed the xchart jar and moved it into your ~/jars
directory (mentioned above):

 1. [Download](https://github.com/uvtc/quick-little-plot/downloads)
    the quick-little-plot.jar file and move it to your ~/bin
    directory.

 2. Get [the quick-little-plot.sh
    file](https://github.com/uvtc/quick-little-plot/blob/master/quick-little-plot.sh),
    edit it changing "you" to your username, then move it to your
    ~/bin directory. Make sure it's executable (`chmod +x
    quick-little-plot.sh`).


## Usage

Put some data into a text file named whatever you like (say,
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



## Example Output

See the first example shown at <http://xeiam.com/xchart_examplecode.jsp>.



## Author

Distributed under the MIT license (see LICENSE.txt file).

John Gabriele, 2012
