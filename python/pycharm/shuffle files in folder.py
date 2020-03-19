import os
import random
import sys
from shutil import copy
music_files=[]

if len(sys.argv) == 2:
    print("Usage:", sys.argv[0], "/home/harsha/Documents/team")
else:
    dir_name="/home/harsha/Documents/team"#sys.argv[1]
    if os.path.isdir(dir_name):
        for file_name in os.listdir(dir_name):
            music_files.append(file_name)
    else:
        print("Directory", dir_name, "does not exist")
        sys.exit(1)
# shuffle list
random.shuffle(music_files)
for item in music_files:
    print(os.path.join(dir_name,item))
    src=os.path.join(dir_name,item)
    dst="/home/harsha/Documents/team1/"
    copy(src, dst)