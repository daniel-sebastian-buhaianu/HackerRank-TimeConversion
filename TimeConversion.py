#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    hour = int(s[:2])
    time_of_day = s[-2:]
    rest_of_time = s[2:-2]
    
    if time_of_day == "AM" and hour == 12:
        hour = 0
    elif time_of_day == "PM" and hour < 12:
        hour += 12
    
    military_time = f"{hour:02}{rest_of_time}"
    
    return military_time

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
