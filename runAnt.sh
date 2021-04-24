#!/bin/sh

cd projects/antProject/ant/ || exit
. ./setantenv.sh

cd ..

ant
ant clean