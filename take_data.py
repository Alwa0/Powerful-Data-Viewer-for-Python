import sys
import pandas

csv = sys.argv[1]
# csv = '/home/alina/IdeaProjects/st/testing_data/d1.csv'
a = pandas.read_csv(csv)
print(a)
