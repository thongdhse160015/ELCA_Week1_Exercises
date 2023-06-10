# elca-fptu-bootcamp-week1-exercise
We have a file named companies.csv with the structure as following:

User interface is not necessary, you need to write a program to provide the following features:
1.Import the file. Please note that the application can be extended in the future to support more file extensions (e.g: XML, XLSX, …).
2.Output to the console the total capital of headquarters located in “CH”.
3.Output to the console the name of companies that the country is in “CH”. The list is sorted descending by capital.
4.Modify your program to monitor a predefined folder “import” for changes. If your program is able to process the file, reimport the file and print out the results in feature #2 and #3.
5.Use your program to re-import the following zip file (companies_big_data.zip). Unzip the file with Windows before importing, your program only needs to handle csv file for now.

Suggested design patterns: Template method, Factory, Singleton, State, Observer.

After finishing your program, your trainer can check with you about:
- The way you applied resource management (e.g: read file) and exception handling.
- The data structure (object, class, interface) has been used in your code.
- How is Lambda expression used in your code to facilitate the aggregation calculation?
- How did you prepare for the new file extensions that might come in the future?
- How many design patterns did you use in the implementation?
- How did you improve your program so that the big file can be imported without any memory issue? If your program worked without any changes, can you explain why?
