%spark
val DataFrame = spark.read.format("CSV").load("/home/devuser/Test.csv")
DataFrame.printSchema()
