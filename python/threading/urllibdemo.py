'''
Author: Shubham Dwivedi
Created on: January 15th 2019
'''

import urllib.request

url = urllib.request.urlopen("http://www.python.org/")
content = url.read()
