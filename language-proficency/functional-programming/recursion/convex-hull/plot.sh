#!/usr/bin/env bash

if [ -z "$1" ]; then echo "Please specify a testcase filename"; exit -1; fi
tail -n +2 $1 | gnuplot -p -e "plot '-' using 1:2 with points"
