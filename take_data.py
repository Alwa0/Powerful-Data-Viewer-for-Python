import sys
import pandas

#csv = '/home/alina/IdeaProjects/st/testing_data/d1.csv'
pandas.options.display.max_columns = None
pandas.options.display.max_rows = None
pandas.options.display.width=None
csv = sys.argv[1]
a = pandas.read_csv(csv)
print(a)
