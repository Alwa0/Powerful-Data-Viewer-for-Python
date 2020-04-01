import sys
import pandas

pandas.options.display.max_columns = None
pandas.options.display.max_rows = None
pandas.options.display.width=None
csv = sys.argv[1]
a = pandas.read_csv(csv)
print(a)
