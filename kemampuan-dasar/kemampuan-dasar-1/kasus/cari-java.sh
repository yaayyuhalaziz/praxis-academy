#!/bin/bash
dir=$1
if [ -z "$1" ]
    then dir=$(pwd)
fi
echo -e "\nHasil Pencarian file .java pada direktori: $dir\n"

if [ ! -d "$dir" ]
    then echo -e "Directory $dir tidak valid.\n"
else
    dirjava=$(find $dir -type f -name "*.sh" -exec dirname {} \; | sort -u)
    if [[ `echo $dirjava | grep / | wc -l` -gt 0 ]]
    then
        printf '%s\n' $dirjava | awk '{print "Ada file Java pada direktori", $0}'
    fi
fi