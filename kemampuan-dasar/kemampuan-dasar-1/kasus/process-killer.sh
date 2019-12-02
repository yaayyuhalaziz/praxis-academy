#!/bin/bash
echo "Proses yang akan di-kill: "
read proses
status=`ps aux | grep $proses | sort -u`
if [ ! -z "$status" ]
then
    prosesid=$(echo $status | awk '{print $2}')
    grepid=$(echo $status | awk '{print $11}')
    if [ "$grepid" != "grep" ]
    then
        kill -s KILL $prosesid
        echo "$prosesid killed"
    fi
fi